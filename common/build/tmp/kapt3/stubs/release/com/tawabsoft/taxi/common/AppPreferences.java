package com.tawabsoft.taxi.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\r\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/tawabsoft/taxi/common/AppPreferences;", "", "prefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getAccessToken", "", "getBaseUrl", "getThemeMode", "", "getTokenId", "getUserEmail", "getUserId", "()Ljava/lang/Integer;", "getUserName", "setAccessToken", "", "access_token", "setBaseUrl", "baseUrl", "setThemeMode", "value", "setTokenId", "token_id", "setUserEmail", "user_email", "setUserId", "user_id", "setUserName", "user_name", "Companion", "common_release"})
public final class AppPreferences {
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BASE_URL = "PREF_KEY_BASE_URL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TOKEN_ID = "PREF_KEY_TOKEN_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_ID = "PREF_KEY_USER_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_NAME = "PREF_KEY_USER_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_EMAIL = "PREF_KEY_USER_EMAIL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_THEME_MODE = "PREF_KEY_THEME_MODE";
    public static final com.tawabsoft.taxi.common.AppPreferences.Companion Companion = null;
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String access_token) {
    }
    
    public final void setBaseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
    }
    
    public final void setTokenId(@org.jetbrains.annotations.NotNull()
    java.lang.String token_id) {
    }
    
    public final void setUserId(int user_id) {
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String user_name) {
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String user_email) {
    }
    
    public final void setThemeMode(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public final int getThemeMode() {
        return 0;
    }
    
    public AppPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tawabsoft/taxi/common/AppPreferences$Companion;", "", "()V", "KEY_ACCESS_TOKEN", "", "KEY_BASE_URL", "KEY_THEME_MODE", "KEY_TOKEN_ID", "KEY_USER_EMAIL", "KEY_USER_ID", "KEY_USER_NAME", "common_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}