package com.tawabsoft.taxi.common.activities.chargeAccount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J?\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010&J\"\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.J\u0012\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020\u001cH\u0014J\b\u00103\u001a\u00020\u001cH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/chargeAccount/ChargeAccountActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "()V", "binding", "Lcom/tawabsoft/taxi/common/databinding/ActivityChargeAccountBinding;", "getBinding", "()Lcom/tawabsoft/taxi/common/databinding/ActivityChargeAccountBinding;", "setBinding", "(Lcom/tawabsoft/taxi/common/databinding/ActivityChargeAccountBinding;)V", "currency", "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "paymentGateways", "", "Lcom/tawabsoft/taxi/common/models/PaymentGateway;", "selectedPayment", "stripe", "Lcom/stripe/android/Stripe;", "getStripe", "()Lcom/stripe/android/Stripe;", "setStripe", "(Lcom/stripe/android/Stripe;)V", "walletItems", "Lcom/tawabsoft/taxi/common/models/WalletItem;", "addCharge", "", "resId", "", "chargeAccount", "amount", "", "paymentToken", "pin", "otp", "transactionId", "(DLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCheckoutClicked", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "startBraintree", "Companion", "common_release"})
public final class ChargeAccountActivity extends com.tawabsoft.taxi.common.components.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.common.databinding.ActivityChargeAccountBinding binding;
    private com.tawabsoft.taxi.common.models.PaymentGateway selectedPayment;
    private java.util.List<com.tawabsoft.taxi.common.models.PaymentGateway> paymentGateways;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.Stripe stripe;
    private java.util.List<com.tawabsoft.taxi.common.models.WalletItem> walletItems;
    private static final int REQUEST_CODE = 243;
    public static final com.tawabsoft.taxi.common.activities.chargeAccount.ChargeAccountActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.databinding.ActivityChargeAccountBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.databinding.ActivityChargeAccountBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.Stripe getStripe() {
        return null;
    }
    
    public final void setStripe(@org.jetbrains.annotations.Nullable()
    com.stripe.android.Stripe p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onCheckoutClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void startBraintree() {
    }
    
    private final void addCharge(int resId) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void chargeAccount(double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pin, @org.jetbrains.annotations.Nullable()
    java.lang.Integer otp, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public ChargeAccountActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/chargeAccount/ChargeAccountActivity$Companion;", "", "()V", "REQUEST_CODE", "", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}