package com.tawabsoft.taxi.common.networking.http.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001b\b\u0016\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J=\u0010\r\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u000f\u0018\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112 \b\u0004\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0086\bR(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPRequest;", "", "()V", "params", "", "", "(Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "setParams", "path", "getPath", "()Ljava/lang/String;", "execute", "", "T", "dispatcher", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcher;", "completionHandler", "Lkotlin/Function1;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPStatusCode;", "common_debug"})
public abstract class HTTPRequest {
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, ? extends java.lang.Object> params;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPath();
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getParams() {
        return null;
    }
    
    public final void setParams(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
    }
    
    public HTTPRequest() {
        super();
    }
    
    public HTTPRequest(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
        super();
    }
}