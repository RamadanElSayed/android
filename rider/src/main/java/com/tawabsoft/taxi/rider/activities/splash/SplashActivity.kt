package com.tawabsoft.taxi.rider.activities.splash

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.AuthUI.IdpConfig.PhoneBuilder
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.iid.FirebaseInstanceId
import com.tawabsoft.taxi.common.AppPreferences
import com.tawabsoft.taxi.common.components.BaseActivity
import com.tawabsoft.taxi.common.interfaces.AlertDialogEvent
import com.tawabsoft.taxi.common.networking.socket.interfaces.Namespace
import com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse
import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketNetworkDispatcher
import com.tawabsoft.taxi.common.utils.AlertDialogBuilder
import com.tawabsoft.taxi.common.utils.AlertDialogBuilder.DialogResult
import com.tawabsoft.taxi.common.utils.AlertDialogBuilder.show
import com.tawabsoft.taxi.common.utils.AlerterHelper.showError
import com.tawabsoft.taxi.common.utils.CommonUtils.isInternetDisabled
import com.tawabsoft.taxi.common.utils.LocationHelper.Companion.LatLngToDoubleArray
import com.tawabsoft.taxi.rider.R
import com.tawabsoft.taxi.rider.activities.login.RiderLoginActivity
import com.tawabsoft.taxi.rider.activities.main.MainActivity
import com.tawabsoft.taxi.rider.databinding.ActivitySplashBinding
import com.tawabsoft.taxi.rider.networking.http.Login
import com.tawabsoft.taxi.rider.networking.http.LoginResult
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class SplashActivity : BaseActivity(), LocationListener {
    lateinit var binding: ActivitySplashBinding
    private var signInRequestCode = 123
    private var locationTimeoutHandler: Handler? = null
    private var locationManager: LocationManager? = null
    var currentLocation: LatLng? = null
    private var isErrored = false
    private val permissionLocationRequestCode = 321
    private var goingToOpen = false
    private var SPLASH_DISPLAY_LENGTH = 5000
    private lateinit var token: String
    private lateinit var appPreferences: AppPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        showConnectionDialog = false
        immersiveScreen = true
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@SplashActivity, R.layout.activity_splash)
        startSplashScreenVideo()
        Places.initialize(applicationContext, getString(R.string.google_maps_key))
        Places.createClient(this)
         var sharedPreferences = getSharedPreferences("com.tawabsoft.taxi.rider_pref", Context.MODE_PRIVATE)
        appPreferences = AppPreferences(sharedPreferences)
       // test
//        binding.loginButton.setOnClickListener {
//            startActivityForResult(
//                    AuthUI.getInstance()
//                            .createSignInIntentBuilder()
//                            .setAvailableProviders(listOf(PhoneBuilder().build()))
//                            .setTheme(currentTheme)
//                            .build(),
//                    signInRequestCode)
//        }


        Observable.interval(1, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext { x: Long? -> }
                .takeUntil { aLong: Long -> aLong == SPLASH_DISPLAY_LENGTH.toLong() }
                .doOnComplete {
                    token = appPreferences.getTokenId().toString()

                    if(token.isEmpty()) {
                        val intent = Intent(this, RiderLoginActivity::class.java)
                        startActivity(intent)
                    }
                    else
                    {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    finish()
                }.subscribe()
    }

    private fun checkPermissions() {
        if (isInternetDisabled(this)) {
            show(this, getString(R.string.message_enable_wifi), AlertDialogBuilder.DialogButton.CANCEL_RETRY, AlertDialogEvent { result: DialogResult ->
                if (result == DialogResult.RETRY) {
                    checkPermissions()
                } else {
                    finishAffinity()
                }
            })
            return
        }
        if (ContextCompat.checkSelfPermission(this@SplashActivity, ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
             requestLocation()
        } else {
            ActivityCompat.requestPermissions(this@SplashActivity, arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION), permissionLocationRequestCode)
        }
    }

    private fun requestLocation() {
        if (ActivityCompat.checkSelfPermission(this, ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        LocationServices.getFusedLocationProviderClient(this@SplashActivity).lastLocation.addOnSuccessListener(this@SplashActivity) { location: Location? ->
          //  tryConnect()
            if (location != null) {
                currentLocation = LatLng(location.latitude, location.longitude)
            }
        }.addOnFailureListener {
         //   tryConnect()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == permissionLocationRequestCode && !grantResults.contains(-1)) {
            requestLocation()
        } else {
          //  tryConnect()
        }
    }

    override fun onResume() {
        super.onResume()
        checkPermissions()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == signInRequestCode) {
//            if (resultCode == Activity.RESULT_OK) {
//                FirebaseAuth.getInstance().currentUser!!.getIdToken(false).addOnCompleteListener {
//                    tryLogin(it.result!!.token!!)
//                }
//                return
//            }
//        }
//        showError(this@SplashActivity, getString(R.string.login_failed))
//        goToLoginMode()
    }

    override fun onLocationChanged(location: Location) {
        currentLocation = LatLng(location.latitude, location.longitude)
    }

    override fun onStatusChanged(s: String, i: Int, bundle: Bundle) {}
    override fun onProviderEnabled(s: String) {}
    override fun onProviderDisabled(s: String) {}

    fun startSplashScreenVideo() {
        val videoview = binding.videoView
        val uris = "android.resource://" + packageName + "/" + R.raw.splash
        val uri = Uri.parse(uris)
        videoview.setVideoURI(uri)
        videoview.requestFocus()
        videoview.start()
    }
}