package com.tawabsoft.taxi.rider.activities.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import com.tawabsoft.taxi.common.AppPreferences
import com.tawabsoft.taxi.common.components.BaseActivity
import com.tawabsoft.taxi.rider.R
import com.tawabsoft.taxi.rider.activities.main.MainActivity
import com.tawabsoft.taxi.rider.databinding.ActivityRiderLoginBinding
import java.util.concurrent.TimeUnit

class RiderLoginActivity  : BaseActivity(){
    private lateinit var riderLoginBinding: ActivityRiderLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks
    private var storedVerificationId: String = ""
    private lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    private lateinit var token: String
    private lateinit var appPreferences: AppPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rider_login)
        riderLoginBinding = DataBindingUtil.setContentView(this@RiderLoginActivity, R.layout.activity_rider_login)
         var sharedPreferences = getSharedPreferences("com.tawabsoft.taxi.rider_pref", Context.MODE_PRIVATE)
         appPreferences=AppPreferences(sharedPreferences)
        firebaseAuth = FirebaseAuth.getInstance()

        initClickListeners()

        callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            override fun onVerificationCompleted(credential: PhoneAuthCredential) =
                    Snackbar.make(findViewById(R.id.layout_phone_auth), "Code here!", Snackbar.LENGTH_SHORT).show()

            override fun onVerificationFailed(exception: FirebaseException) {
                riderLoginBinding.progressBar.visibility = View.GONE
                Snackbar.make(findViewById(R.id.layout_phone_auth), "${exception.message}", Snackbar.LENGTH_SHORT).show()
            }

            override fun onCodeSent(
                    verificationId: String,
                    token: PhoneAuthProvider.ForceResendingToken
            ) {
                 riderLoginBinding.progressBar.visibility = View.GONE
                riderLoginBinding.btnLogin.visibility=View.GONE
                riderLoginBinding.countryId.visibility=View.GONE
                riderLoginBinding.countryIdCode.visibility=View.GONE
                riderLoginBinding.smallIc.visibility=View.GONE

                riderLoginBinding.phoneLayout.visibility=View.GONE
                riderLoginBinding.verifyLayout.visibility=View.VISIBLE
                riderLoginBinding.btnVerify.visibility=View.VISIBLE
                storedVerificationId = verificationId
                resendToken = token
            }
        }

    }

    private fun startPhoneNumberVerification(phoneNumber: String) {
         riderLoginBinding.progressBar.visibility = View.VISIBLE
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+20$phoneNumber",
                60,
                TimeUnit.SECONDS,
                this,
                callbacks)
    }

    private fun verifyPhoneNumberWithCode(verificationId: String, code: String) {
         riderLoginBinding.progressBar.visibility = View.VISIBLE
        val credential = PhoneAuthProvider.getCredential(verificationId, code)
        signInWithPhoneAuthCredential(credential)
    }

    private fun resendVerificationCode(
            phoneNumber: String,
            token: PhoneAuthProvider.ForceResendingToken?
    ) {
         riderLoginBinding.progressBar.visibility = View.VISIBLE
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phoneNumber,
                60,
                TimeUnit.SECONDS,
                this,
                callbacks,
                token)
    }

    private fun signInWithPhoneAuthCredential(credential: PhoneAuthCredential) {
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        appPreferences.setTokenId("sucess")
                        startActivity(Intent(this, MainActivity::class.java))
                        finishAffinity()
                    } else if (task.isCanceled || task.isComplete)
                        Snackbar.make(findViewById(R.id.layout_phone_auth), "${task.exception?.message}", Snackbar.LENGTH_SHORT).show()
                     riderLoginBinding.progressBar.visibility = View.GONE
                }
    }

    private fun initClickListeners() {

        riderLoginBinding.btnLogin.setOnClickListener {
            hideKeyboard(riderLoginBinding.layoutPhoneAuth)
            val phoneNumber = riderLoginBinding.etxPhone.text.toString()
            if (phoneNumber.isNotEmpty())
            startPhoneNumberVerification(phoneNumber)
        }
        riderLoginBinding.btnVerify
        .setOnClickListener {
            hideKeyboard(riderLoginBinding.layoutPhoneAuth)
            val code = riderLoginBinding.etxVerify.text.toString()
            if (code.isNotEmpty())
            verifyPhoneNumberWithCode(storedVerificationId, code)
        }

    }
    private fun hideKeyboard(view: View) {
        view?.apply {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}
