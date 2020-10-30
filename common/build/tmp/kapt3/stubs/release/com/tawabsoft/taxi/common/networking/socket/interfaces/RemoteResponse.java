package com.tawabsoft.taxi.common.networking.socket.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0003\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "T", "E", "", "()V", "Companion", "Error", "Success", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Success;", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Error;", "common_release"})
public abstract class RemoteResponse<T extends java.lang.Object, E extends java.lang.Object> {
    public static final com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse.Companion Companion = null;
    
    private RemoteResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Success;", "T", "E", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "common_release"})
    public static final class Success<T extends java.lang.Object, E extends java.lang.Object> extends com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<T, E> {
        private final T body = null;
        
        public final T getBody() {
            return null;
        }
        
        public Success(T body) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse.Success<T, E> copy(T body) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Error;", "T", "E", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "error", "(Ljava/lang/Object;)V", "getError", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Error;", "equals", "", "other", "", "hashCode", "", "toString", "", "common_release"})
    public static final class Error<T extends java.lang.Object, E extends java.lang.Object> extends com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<T, E> {
        private final E error = null;
        
        public final E getError() {
            return null;
        }
        
        public Error(E error) {
            super();
        }
        
        public final E component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse.Error<T, E> copy(E error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\n\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse$Companion;", "", "()V", "createError", "Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "T", "E", "error", "(Ljava/lang/Object;)Lcom/tawabsoft/taxi/common/networking/socket/interfaces/RemoteResponse;", "createSuccess", "data", "common_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object, E extends java.lang.Object>com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<T, E> createError(E error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object, E extends java.lang.Object>com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse<T, E> createSuccess(T data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}