package com.tawabsoft.taxi.common.networking.http.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00030\tH&\u00a8\u0006\f"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPNetworkDispatcherBase;", "", "dispatch", "", "path", "", "params", "", "completionHandler", "Lkotlin/Function1;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPStatusCode;", "common_release"})
public abstract interface HTTPNetworkDispatcherBase {
    
    public abstract void dispatch(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<java.lang.Object, com.tawabsoft.taxi.common.networking.http.interfaces.HTTPStatusCode>, kotlin.Unit> completionHandler);
}