package com.tawabsoft.taxi.common.networking.socket.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/ErrorStatus;", "", "(Ljava/lang/String;I)V", "localizedDescription", "", "getLocalizedDescription", "()I", "DistanceCalculationFailed", "DriversUnavailable", "ConfirmationCodeRequired", "ConfirmationCodeInvalid", "OrderAlreadyTaken", "CreditInsufficient", "CouponUsed", "CouponExpired", "CouponInvalid", "Unknown", "Networking", "FailedEncoding", "FailedToVerify", "RegionUnsupported", "NoServiceInRegion", "PINCodeRequired", "OTPCodeRequired", "common_release"})
public enum ErrorStatus {
    @com.squareup.moshi.Json(name = "DistanceCalculationFailed")
    /*public static final*/ DistanceCalculationFailed /* = new DistanceCalculationFailed() */,
    @com.squareup.moshi.Json(name = "DriversUnavailable")
    /*public static final*/ DriversUnavailable /* = new DriversUnavailable() */,
    @com.squareup.moshi.Json(name = "ConfirmationCodeRequired")
    /*public static final*/ ConfirmationCodeRequired /* = new ConfirmationCodeRequired() */,
    @com.squareup.moshi.Json(name = "ConfirmationCodeInvalid")
    /*public static final*/ ConfirmationCodeInvalid /* = new ConfirmationCodeInvalid() */,
    @com.squareup.moshi.Json(name = "OrderAlreadyTaken")
    /*public static final*/ OrderAlreadyTaken /* = new OrderAlreadyTaken() */,
    @com.squareup.moshi.Json(name = "CreditInsufficient")
    /*public static final*/ CreditInsufficient /* = new CreditInsufficient() */,
    @com.squareup.moshi.Json(name = "CouponUsed")
    /*public static final*/ CouponUsed /* = new CouponUsed() */,
    @com.squareup.moshi.Json(name = "CouponExpired")
    /*public static final*/ CouponExpired /* = new CouponExpired() */,
    @com.squareup.moshi.Json(name = "CouponInvalid")
    /*public static final*/ CouponInvalid /* = new CouponInvalid() */,
    @com.squareup.moshi.Json(name = "Unknown")
    /*public static final*/ Unknown /* = new Unknown() */,
    @com.squareup.moshi.Json(name = "Networking")
    /*public static final*/ Networking /* = new Networking() */,
    @com.squareup.moshi.Json(name = "FailedEncoding")
    /*public static final*/ FailedEncoding /* = new FailedEncoding() */,
    @com.squareup.moshi.Json(name = "FailedToVerify")
    /*public static final*/ FailedToVerify /* = new FailedToVerify() */,
    @com.squareup.moshi.Json(name = "RegionUnsupported")
    /*public static final*/ RegionUnsupported /* = new RegionUnsupported() */,
    @com.squareup.moshi.Json(name = "NoServiceInRegion")
    /*public static final*/ NoServiceInRegion /* = new NoServiceInRegion() */,
    @com.squareup.moshi.Json(name = "PINCodeRequired")
    /*public static final*/ PINCodeRequired /* = new PINCodeRequired() */,
    @com.squareup.moshi.Json(name = "OTPCodeRequired")
    /*public static final*/ OTPCodeRequired /* = new OTPCodeRequired() */;
    
    public final int getLocalizedDescription() {
        return 0;
    }
    
    ErrorStatus() {
    }
}