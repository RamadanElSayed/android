package com.tawabsoft.taxi.common.networking.socket.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J=\u0010\u000e\u001a\u00020\u000f\"\u0006\b\u0000\u0010\u0010\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122 \b\u0004\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u0014H\u0086\bJM\u0010\u0017\u001a\u00020\u000f\"\u0006\b\u0000\u0010\u0010\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u001220\b\u0004\u0010\u0013\u001a*\u0012 \u0012\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H\u00100\u0018j\b\u0012\u0004\u0012\u0002H\u0010`\u0019\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u0014H\u0086\bR\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005\u00a8\u0006\u001a"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketRequest;", "", "()V", "params", "", "([Ljava/lang/Object;)V", "event", "", "getEvent", "()Ljava/lang/String;", "getParams", "()[Ljava/lang/Object;", "setParams", "[Ljava/lang/Object;", "execute", "", "T", "dispatcher", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/NetworkDispatcher;", "completionHandler", "Lkotlin/Function1;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteError;", "executeArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "common_release"})
public abstract class SocketRequest {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object[] params;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object[] getParams() {
        return null;
    }
    
    public final void setParams(@org.jetbrains.annotations.Nullable()
    java.lang.Object[] p0) {
    }
    
    public SocketRequest() {
        super();
    }
    
    public SocketRequest(@org.jetbrains.annotations.NotNull()
    java.lang.Object[] params) {
        super();
    }
}