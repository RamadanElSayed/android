package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087\u0002J#\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\u0002\u00a8\u0006\r"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/TravelRepository;", "", "()V", "get", "Lcom/tawabsoft/taxi/common/models/Request;", "context", "Landroid/content/Context;", "app", "Lcom/tawabsoft/taxi/common/utils/TravelRepository$AppType;", "set", "", "request", "AppType", "common_release"})
public final class TravelRepository {
    public static final com.tawabsoft.taxi.common.utils.TravelRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final com.tawabsoft.taxi.common.models.Request get(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.utils.TravelRepository.AppType app) {
        return null;
    }
    
    public static final void set(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.utils.TravelRepository.AppType app, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Request request) {
    }
    
    private TravelRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/TravelRepository$AppType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DRIVER", "RIDER", "Companion", "common_release"})
    public static enum AppType {
        /*public static final*/ DRIVER /* = new DRIVER(null) */,
        /*public static final*/ RIDER /* = new RIDER(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        public static final com.tawabsoft.taxi.common.utils.TravelRepository.AppType.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        AppType(java.lang.String value) {
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/TravelRepository$AppType$Companion;", "", "()V", "get", "Lcom/tawabsoft/taxi/common/utils/TravelRepository$AppType;", "code", "", "common_release"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.tawabsoft.taxi.common.utils.TravelRepository.AppType get(@org.jetbrains.annotations.NotNull()
            java.lang.String code) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}