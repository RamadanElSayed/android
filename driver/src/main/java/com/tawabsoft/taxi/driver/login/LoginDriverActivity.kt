package com.tawabsoft.taxi.driver.login

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
import com.tawabsoft.taxi.driver.R
import com.tawabsoft.taxi.driver.activities.main.MainActivity
import com.tawabsoft.taxi.driver.databinding.ActivityLoginDriverBinding
import java.util.concurrent.TimeUnit

class LoginDriverActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var driverLoginBinding: ActivityLoginDriverBinding
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks
    private var storedVerificationId: String = ""
    private lateinit var appPreferences: AppPreferences
    private lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_driver)
        driverLoginBinding = DataBindingUtil.setContentView(this@LoginDriverActivity, R.layout.activity_login_driver)
        var sharedPreferences = this.getSharedPreferences("com.tawabsoft.taxi.driver_pref", Context.MODE_PRIVATE)
        appPreferences= AppPreferences(sharedPreferences)
        firebaseAuth = FirebaseAuth.getInstance()
        initClickListeners()

        callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            override fun onVerificationCompleted(credential: PhoneAuthCredential) =
                    Snackbar.make(findViewById(R.id.layout_phone_auth), "Code here!", Snackbar.LENGTH_SHORT).show()

            override fun onVerificationFailed(exception: FirebaseException) {
                driverLoginBinding.progressBar.visibility = View.GONE
                Snackbar.make(findViewById(R.id.layout_phone_auth), "${exception.message}", Snackbar.LENGTH_SHORT).show()
            }

            override fun onCodeSent(
                    verificationId: String,
                    token: PhoneAuthProvider.ForceResendingToken
            ) {
                driverLoginBinding.progressBar.visibility = View.GONE
                driverLoginBinding.btnLogin.visibility= View.GONE
                driverLoginBinding.countryId.visibility= View.GONE
                driverLoginBinding.countryIdCode.visibility= View.GONE
                driverLoginBinding.smallIc.visibility= View.GONE

                driverLoginBinding.phoneLayout.visibility= View.GONE
                driverLoginBinding.verifyLayout.visibility= View.VISIBLE
                driverLoginBinding.btnVerify.visibility= View.VISIBLE
                storedVerificationId = verificationId
                resendToken = token
            }
        }

    }

    private fun startPhoneNumberVerification(phoneNumber: String) {
        driverLoginBinding.progressBar.visibility = View.VISIBLE
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+20$phoneNumber",
                60,
                TimeUnit.SECONDS,
                this,
                callbacks)
    }

    private fun verifyPhoneNumberWithCode(verificationId: String, code: String) {
        driverLoginBinding.progressBar.visibility = View.VISIBLE
        val credential = PhoneAuthProvider.getCredential(verificationId, code)
        signInWithPhoneAuthCredential(credential)
    }

    private fun resendVerificationCode(
            phoneNumber: String,
            token: PhoneAuthProvider.ForceResendingToken?
    ) {
        driverLoginBinding.progressBar.visibility = View.VISIBLE
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
                    driverLoginBinding.progressBar.visibility = View.GONE
                }
    }

    private fun initClickListeners() {

        driverLoginBinding.btnLogin.setOnClickListener {
            hideKeyboard(driverLoginBinding.layoutPhoneAuth)
            val phoneNumber = driverLoginBinding.etxPhone.text.toString()
            if (phoneNumber.isNotEmpty())
                startPhoneNumberVerification(phoneNumber)
        }
        driverLoginBinding.btnVerify
                .setOnClickListener {
                    hideKeyboard(driverLoginBinding.layoutPhoneAuth)
                    val code = driverLoginBinding.etxVerify.text.toString()
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
