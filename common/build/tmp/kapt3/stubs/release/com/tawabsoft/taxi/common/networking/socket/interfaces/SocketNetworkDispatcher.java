package com.tawabsoft.taxi.common.networking.socket.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0002J>\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u001e\u00106\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020907\u0012\u0004\u0012\u00020\u00060\u0004J\u0006\u0010:\u001a\u00020\u0006JE\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u0002042\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u001e\u00106\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@07\u0012\u0004\u0012\u00020\u00060\u0004H\u0016\u00a2\u0006\u0002\u0010AR(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006C"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketNetworkDispatcher;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/NetworkDispatcher;", "()V", "onArrived", "Lkotlin/Function1;", "", "", "getOnArrived", "()Lkotlin/jvm/functions/Function1;", "setOnArrived", "(Lkotlin/jvm/functions/Function1;)V", "onCancel", "getOnCancel", "setOnCancel", "onCancelRequest", "getOnCancelRequest", "setOnCancelRequest", "onDriverAccepted", "Lcom/tawabsoft/taxi/common/models/Request;", "getOnDriverAccepted", "setOnDriverAccepted", "onFinished", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/FinishResult;", "getOnFinished", "setOnFinished", "onNewMessage", "Lcom/tawabsoft/taxi/common/models/ChatMessage;", "getOnNewMessage", "setOnNewMessage", "onNewRequest", "getOnNewRequest", "setOnNewRequest", "onPaid", "getOnPaid", "setOnPaid", "onStarted", "getOnStarted", "setOnStarted", "onTravelInfo", "Lcom/google/android/gms/maps/model/LatLng;", "getOnTravelInfo", "setOnTravelInfo", "socket", "Lio/socket/client/Socket;", "getSocket", "()Lio/socket/client/Socket;", "setSocket", "(Lio/socket/client/Socket;)V", "connect", "namespace", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/Namespace;", "token", "", "notificationId", "completionHandler", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/ConnectionError;", "disconnect", "dispatch", "event", "params", "", "", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketClientError;", "(Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Companion", "common_release"})
public final class SocketNetworkDispatcher implements com.tawabsoft.taxi.common.networking.socket.interfaces.NetworkDispatcher {
    @org.jetbrains.annotations.Nullable()
    private io.socket.client.Socket socket;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.ChatMessage, kotlin.Unit> onNewMessage;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onArrived;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.Request, kotlin.Unit> onStarted;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> onTravelInfo;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.Request, kotlin.Unit> onNewRequest;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.networking.socket.interfaces.FinishResult, kotlin.Unit> onFinished;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCancel;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCancelRequest;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.Request, kotlin.Unit> onDriverAccepted;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPaid;
    @org.jetbrains.annotations.NotNull()
    private static com.tawabsoft.taxi.common.networking.socket.interfaces.SocketNetworkDispatcher instance;
    @org.jetbrains.annotations.Nullable()
    private static com.tawabsoft.taxi.common.networking.socket.interfaces.Namespace currentNamespace;
    public static final com.tawabsoft.taxi.common.networking.socket.interfaces.SocketNetworkDispatcher.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.socket.client.Socket getSocket() {
        return null;
    }
    
    public final void setSocket(@org.jetbrains.annotations.Nullable()
    io.socket.client.Socket p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.tawabsoft.taxi.common.models.ChatMessage, kotlin.Unit> getOnNewMessage() {
        return null;
    }
    
    public final void setOnNewMessage(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.ChatMessage, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnArrived() {
        return null;
    }
    
    public final void setOnArrived(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.tawabsoft.taxi.common.models.Request, kotlin.Unit> getOnStarted() {
        return null;
    }
    
    public final void setOnStarted(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.Request, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.LatLng, kotlin.Unit> getOnTravelInfo() {
        return null;
    }
    
    public final void setOnTravelInfo(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.tawabsoft.taxi.common.models.Request, kotlin.Unit> getOnNewRequest() {
        return null;
    }
    
    public final void setOnNewRequest(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.Request, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.tawabsoft.taxi.common.networking.socket.interfaces.FinishResult, kotlin.Unit> getOnFinished() {
        return null;
    }
    
    public final void setOnFinished(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.networking.socket.interfaces.FinishResult, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnCancel() {
        return null;
    }
    
    public final void setOnCancel(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnCancelRequest() {
        return null;
    }
    
    public final void setOnCancelRequest(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.tawabsoft.taxi.common.models.Request, kotlin.Unit> getOnDriverAccepted() {
        return null;
    }
    
    public final void setOnDriverAccepted(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.models.Request, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnPaid() {
        return null;
    }
    
    public final void setOnPaid(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void dispatch(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.Nullable()
    java.lang.Object[] params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<java.lang.Object, com.tawabsoft.taxi.common.networking.socket.interfaces.SocketClientError>, kotlin.Unit> completionHandler) {
    }
    
    public final void connect(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.networking.socket.interfaces.Namespace namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String notificationId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<java.lang.Boolean, com.tawabsoft.taxi.common.networking.socket.interfaces.ConnectionError>, kotlin.Unit> completionHandler) {
    }
    
    public final void disconnect() {
    }
    
    public SocketNetworkDispatcher() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketNetworkDispatcher$Companion;", "", "()V", "currentNamespace", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/Namespace;", "getCurrentNamespace", "()Lcom/tawabsoft/taxi/common/networking/socket/interfaces/Namespace;", "setCurrentNamespace", "(Lcom/tawabsoft/taxi/common/networking/socket/interfaces/Namespace;)V", "instance", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketNetworkDispatcher;", "getInstance", "()Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketNetworkDispatcher;", "setInstance", "(Lcom/tawabsoft/taxi/common/networking/socket/interfaces/SocketNetworkDispatcher;)V", "common_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.networking.socket.interfaces.SocketNetworkDispatcher getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.networking.socket.interfaces.SocketNetworkDispatcher p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.tawabsoft.taxi.common.networking.socket.interfaces.Namespace getCurrentNamespace() {
            return null;
        }
        
        public final void setCurrentNamespace(@org.jetbrains.annotations.Nullable()
        com.tawabsoft.taxi.common.networking.socket.interfaces.Namespace p0) {
        }
        
        private Companion() {
            super();
        }
    }
}