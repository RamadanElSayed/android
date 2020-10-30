package com.tawabsoft.taxi.rider.activities.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/login/RiderLoginActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "()V", "appPreferences", "Lcom/tawabsoft/taxi/common/AppPreferences;", "callbacks", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "resendToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "riderLoginBinding", "Lcom/tawabsoft/taxi/rider/databinding/ActivityRiderLoginBinding;", "storedVerificationId", "", "token", "hideKeyboard", "", "view", "Landroid/view/View;", "initClickListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "resendVerificationCode", "phoneNumber", "signInWithPhoneAuthCredential", "credential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "startPhoneNumberVerification", "verifyPhoneNumberWithCode", "verificationId", "code", "rider_debug"})
public final class RiderLoginActivity extends com.tawabsoft.taxi.common.components.BaseActivity {
    private com.tawabsoft.taxi.rider.databinding.ActivityRiderLoginBinding riderLoginBinding;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    private com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    private java.lang.String storedVerificationId = "";
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken resendToken;
    private java.lang.String token;
    private com.tawabsoft.taxi.common.AppPreferences appPreferences;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startPhoneNumberVerification(java.lang.String phoneNumber) {
    }
    
    private final void verifyPhoneNumberWithCode(java.lang.String verificationId, java.lang.String code) {
    }
    
    private final void resendVerificationCode(java.lang.String phoneNumber, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken token) {
    }
    
    private final void signInWithPhoneAuthCredential(com.google.firebase.auth.PhoneAuthCredential credential) {
    }
    
    private final void initClickListeners() {
    }
    
    private final void hideKeyboard(android.view.View view) {
    }
    
    public RiderLoginActivity() {
        super();
    }
}