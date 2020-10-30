package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020\'J\u0018\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020)J\u001c\u0010,\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010 2\b\u0010+\u001a\u0004\u0018\u00010 J\u0018\u0010-\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020)J\u001a\u0010.\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010 2\b\u0010\u0005\u001a\u0004\u0018\u00010 J\u0010\u0010/\u001a\u00020\'2\b\u0010*\u001a\u0004\u0018\u00010 R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015RL\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00182\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0005\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00061"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/MyPreferenceManager;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Lcom/tawabsoft/taxi/common/models/Driver;", "driver", "getDriver", "()Lcom/tawabsoft/taxi/common/models/Driver;", "setDriver", "(Lcom/tawabsoft/taxi/common/models/Driver;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "Lcom/tawabsoft/taxi/common/models/Rider;", "rider", "getRider", "()Lcom/tawabsoft/taxi/common/models/Rider;", "setRider", "(Lcom/tawabsoft/taxi/common/models/Rider;)V", "Ljava/util/ArrayList;", "Lcom/tawabsoft/taxi/common/models/Service;", "Lkotlin/collections/ArrayList;", "services", "getServices", "()Ljava/util/ArrayList;", "setServices", "(Ljava/util/ArrayList;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "clearPreferences", "", "getBoolean", "", "key", "defValue", "getString", "putBoolean", "putString", "remove", "Companion", "common_debug"})
public final class MyPreferenceManager {
    private final android.content.SharedPreferences sharedPreferences = null;
    private static com.tawabsoft.taxi.common.utils.MyPreferenceManager instance;
    public static final com.tawabsoft.taxi.common.utils.MyPreferenceManager.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Driver getDriver() {
        return null;
    }
    
    public final void setDriver(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Rider getRider() {
        return null;
    }
    
    public final void setRider(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Rider value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tawabsoft.taxi.common.models.Service> getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tawabsoft.taxi.common.models.Service> value) {
    }
    
    private final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final boolean putString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defValue) {
        return null;
    }
    
    public final boolean putBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
        return false;
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    public final void remove(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public final void clearPreferences() {
    }
    
    public MyPreferenceManager(@org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.tawabsoft.taxi.common.utils.MyPreferenceManager getInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/MyPreferenceManager$Companion;", "", "()V", "instance", "Lcom/tawabsoft/taxi/common/utils/MyPreferenceManager;", "getInstance", "context", "Landroid/content/Context;", "common_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.utils.MyPreferenceManager getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}