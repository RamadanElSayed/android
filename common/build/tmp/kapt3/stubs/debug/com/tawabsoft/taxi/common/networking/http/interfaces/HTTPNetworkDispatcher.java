package com.tawabsoft.taxi.common.networking.http.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000bH\u0017J;\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcher;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcherBase;", "()V", "dispatch", "", "path", "", "params", "", "", "completionHandler", "Lkotlin/Function1;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPStatusCode;", "doIt", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "common_debug"})
public final class HTTPNetworkDispatcher implements com.tawabsoft.taxi.common.networking.http.interfaces.HTTPNetworkDispatcherBase {
    @org.jetbrains.annotations.NotNull()
    private static com.tawabsoft.taxi.common.networking.http.interfaces.HTTPNetworkDispatcher instance;
    public static final com.tawabsoft.taxi.common.networking.http.interfaces.HTTPNetworkDispatcher.Companion Companion = null;
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void dispatch(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<java.lang.Object, com.tawabsoft.taxi.common.networking.http.interfaces.HTTPStatusCode>, kotlin.Unit> completionHandler) {
    }
    
    public HTTPNetworkDispatcher() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcher$Companion;", "", "()V", "instance", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcher;", "getInstance", "()Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcher;", "setInstance", "(Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcher;)V", "common_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.networking.http.interfaces.HTTPNetworkDispatcher getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.networking.http.interfaces.HTTPNetworkDispatcher p0) {
        }
        
        private Companion() {
            super();
        }
    }
}