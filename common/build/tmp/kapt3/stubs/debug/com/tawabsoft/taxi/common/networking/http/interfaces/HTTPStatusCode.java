package com.tawabsoft.taxi.common.networking.http.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPStatusCode;", "", "rawValue", "", "(Ljava/lang/String;II)V", "localizedDescription", "", "getLocalizedDescription", "()Ljava/lang/String;", "getRawValue", "()I", "InvalidCredentials", "HardReject", "NotFound", "Unknown", "InvalidURL", "NoData", "FailedToDecode", "Networking", "Companion", "common_debug"})
public enum HTTPStatusCode {
    /*public static final*/ InvalidCredentials /* = new InvalidCredentials(0) */,
    /*public static final*/ HardReject /* = new HardReject(0) */,
    /*public static final*/ NotFound /* = new NotFound(0) */,
    /*public static final*/ Unknown /* = new Unknown(0) */,
    /*public static final*/ InvalidURL /* = new InvalidURL(0) */,
    /*public static final*/ NoData /* = new NoData(0) */,
    /*public static final*/ FailedToDecode /* = new FailedToDecode(0) */,
    /*public static final*/ Networking /* = new Networking(0) */;
    private final int rawValue = 0;
    public static final com.tawabsoft.taxi.common.networking.http.interfaces.HTTPStatusCode.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalizedDescription() {
        return null;
    }
    
    public final int getRawValue() {
        return 0;
    }
    
    HTTPStatusCode(int rawValue) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPStatusCode$Companion;", "", "()V", "invoke", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPStatusCode;", "rawValue", "", "showAlert", "", "context", "Landroid/content/Context;", "common_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tawabsoft.taxi.common.networking.http.interfaces.HTTPStatusCode invoke(int rawValue) {
            return null;
        }
        
        public final void showAlert(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}