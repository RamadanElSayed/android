package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/tawabsoft/taxi/common/models/PaymentGatewayType;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Stripe", "Braintree", "Flutterwave", "PayGate", "Companion", "common_debug"})
public enum PaymentGatewayType {
    @com.squareup.moshi.Json(name = "stripe")
    /*public static final*/ Stripe /* = new Stripe(null) */,
    @com.squareup.moshi.Json(name = "braintree")
    /*public static final*/ Braintree /* = new Braintree(null) */,
    @com.squareup.moshi.Json(name = "flutterwave")
    /*public static final*/ Flutterwave /* = new Flutterwave(null) */,
    @com.squareup.moshi.Json(name = "paygate")
    /*public static final*/ PayGate /* = new PayGate(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rawValue = null;
    public static final com.tawabsoft.taxi.common.models.PaymentGatewayType.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawValue() {
        return null;
    }
    
    PaymentGatewayType(java.lang.String rawValue) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/common/models/PaymentGatewayType$Companion;", "", "()V", "invoke", "Lcom/tawabsoft/taxi/common/models/PaymentGatewayType;", "rawValue", "", "common_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tawabsoft.taxi.common.models.PaymentGatewayType invoke(@org.jetbrains.annotations.NotNull()
        java.lang.String rawValue) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}