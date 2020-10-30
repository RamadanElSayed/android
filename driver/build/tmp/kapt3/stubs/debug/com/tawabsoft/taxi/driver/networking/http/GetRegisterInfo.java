package com.tawabsoft.taxi.driver.networking.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/tawabsoft/taxi/driver/networking/http/GetRegisterInfo;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPRequest;", "jwtToken", "", "(Ljava/lang/String;)V", "path", "getPath", "()Ljava/lang/String;", "driver_debug"})
public final class GetRegisterInfo extends com.tawabsoft.taxi.common.networking.http.interfaces.HTTPRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = "driver/get";
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPath() {
        return null;
    }
    
    public GetRegisterInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String jwtToken) {
        super();
    }
}