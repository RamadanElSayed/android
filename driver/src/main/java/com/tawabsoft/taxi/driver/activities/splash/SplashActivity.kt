package com.tawabsoft.taxi.driver.activities.splash

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.databinding.DataBindingUtil
import com.tawabsoft.taxi.common.AppPreferences
import com.tawabsoft.taxi.common.components.BaseActivity
import com.tawabsoft.taxi.common.interfaces.AlertDialogEvent
import com.tawabsoft.taxi.common.utils.AlertDialogBuilder
import com.tawabsoft.taxi.common.utils.AlertDialogBuilder.DialogResult
import com.tawabsoft.taxi.common.utils.AlertDialogBuilder.show
import com.tawabsoft.taxi.common.utils.CommonUtils.isInternetDisabled
import com.tawabsoft.taxi.driver.R
import com.tawabsoft.taxi.driver.activities.main.MainActivity
import com.tawabsoft.taxi.driver.databinding.ActivitySplashBinding
import com.tawabsoft.taxi.driver.login.LoginDriverActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class SplashActivity : BaseActivity() {
    private lateinit var binding: ActivitySplashBinding
    private var SIGN_IN_ACTIVITY = 123
    private var startRequested = false
    private var SPLASH_DISPLAY_LENGTH = 5000
    private lateinit var token: String

//    private val onLoginClicked = View.OnClickListener {
//        startActivityForResult(
//                AuthUI.getInstance()
//                        .createSignInIntentBuilder()
//                        .setAvailableProviders(listOf(PhoneBuilder().build()))
//                        .setLogo(R.drawable.logo)
//                        .setTheme(currentTheme)
//                        .build(),
//                SIGN_IN_ACTIVITY)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        shouldReconnect = false
        immersiveScreen = true
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        startSplashScreenVideo()
         var sharedPreferences = this.getSharedPreferences("com.tawabsoft.taxi.driver_pref", Context.MODE_PRIVATE)
         var appPreferences: AppPreferences
        appPreferences = AppPreferences(sharedPreferences)
        Observable.interval(1, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext { x: Long? -> }
                .takeUntil { aLong: Long -> aLong == SPLASH_DISPLAY_LENGTH.toLong() }
                .doOnComplete {
                    token = appPreferences.getTokenId().toString()
                    if(token.isEmpty()) {
                        token = appPreferences.getTokenId().toString()
                        val intent = Intent(this, LoginDriverActivity::class.java)
                        startActivity(intent)
                    }
                    else
                    {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    finish()
                }.subscribe()
//        binding.loginButton.setOnClickListener(onLoginClicked)
    }

    private fun checkPermissions() {
        if (isInternetDisabled(this)) {
            show(this, getString(R.string.message_internet_connection), AlertDialogBuilder.DialogButton.CANCEL_RETRY, AlertDialogEvent { result: DialogResult ->
                if (result === DialogResult.RETRY) {
                    checkPermissions()
                } else {
                    finishAffinity()
                }
            })
            return
        }
//        if(getInstance(applicationContext).token != null) {
//            tryConnect(getInstance(applicationContext).token!!)
//        } else {
//            goToLoginMode()
//        }
    }


    override fun onResume() {
        super.onResume()
        checkPermissions()
    }
    fun startSplashScreenVideo() {
        val videoview = binding.videoView
        val uris = "android.resource://" + packageName + "/" + R.raw.splash
        val uri = Uri.parse(uris)
        videoview.setVideoURI(uri)
        videoview.requestFocus()
        videoview.start()
    }
}
