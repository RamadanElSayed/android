package com.tawabsoft.taxi.common.networking.socket.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/ConnectionError;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "showAlert", "", "context", "Landroid/content/Context;", "VersionOutdated", "NotFound", "Blocked", "RegistrationIncomplete", "TokenVerificationError", "NotDecodableError", "Unknown", "ErrorWithoutData", "Companion", "common_release"})
public enum ConnectionError {
    @com.squareup.moshi.Json(name = "VersionOutdated")
    /*public static final*/ VersionOutdated /* = new VersionOutdated(null) */,
    @com.squareup.moshi.Json(name = "NotFound")
    /*public static final*/ NotFound /* = new NotFound(null) */,
    @com.squareup.moshi.Json(name = "NotFound")
    /*public static final*/ Blocked /* = new Blocked(null) */,
    @com.squareup.moshi.Json(name = "RegistrationIncomplete")
    /*public static final*/ RegistrationIncomplete /* = new RegistrationIncomplete(null) */,
    @com.squareup.moshi.Json(name = "TokenVerificationError")
    /*public static final*/ TokenVerificationError /* = new TokenVerificationError(null) */,
    @com.squareup.moshi.Json(name = "NotDecodableError")
    /*public static final*/ NotDecodableError /* = new NotDecodableError(null) */,
    @com.squareup.moshi.Json(name = "Unknown")
    /*public static final*/ Unknown /* = new Unknown(null) */,
    @com.squareup.moshi.Json(name = "ErrorWithoutData")
    /*public static final*/ ErrorWithoutData /* = new ErrorWithoutData(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rawValue = null;
    public static final com.tawabsoft.taxi.common.networking.socket.interfaces.ConnectionError.Companion Companion = null;
    
    public final void showAlert(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawValue() {
        return null;
    }
    
    ConnectionError(java.lang.String rawValue) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/ConnectionError$Companion;", "", "()V", "invoke", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/ConnectionError;", "rawValue", "", "common_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tawabsoft.taxi.common.networking.socket.interfaces.ConnectionError invoke(@org.jetbrains.annotations.NotNull()
        java.lang.String rawValue) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}