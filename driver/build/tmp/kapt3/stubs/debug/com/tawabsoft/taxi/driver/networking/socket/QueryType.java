package com.tawabsoft.taxi.driver.networking.socket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/tawabsoft/taxi/driver/networking/socket/QueryType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Daily", "Weekly", "Monthly", "Companion", "driver_debug"})
public enum QueryType {
    @com.squareup.moshi.Json(name = "daily")
    /*public static final*/ Daily /* = new Daily(null) */,
    @com.squareup.moshi.Json(name = "weekly")
    /*public static final*/ Weekly /* = new Weekly(null) */,
    @com.squareup.moshi.Json(name = "monthly")
    /*public static final*/ Monthly /* = new Monthly(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    public static final com.tawabsoft.taxi.driver.networking.socket.QueryType.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    QueryType(java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/driver/networking/socket/QueryType$Companion;", "", "()V", "get", "Lcom/tawabsoft/taxi/driver/networking/socket/QueryType;", "code", "", "driver_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.driver.networking.socket.QueryType get(@org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}