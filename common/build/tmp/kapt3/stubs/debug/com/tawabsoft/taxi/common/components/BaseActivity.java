package com.tawabsoft.taxi.common.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020)H\u0002J\u000e\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nJ\u0010\u0010/\u001a\u00020)2\b\b\u0001\u00100\u001a\u00020\nJ\u0010\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u000101J\u0012\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020)H\u0014J\b\u00106\u001a\u00020)H\u0014J\b\u00107\u001a\u00020)H\u0016J\b\u00108\u001a\u00020)H\u0014J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0001H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006;"}, d2 = {"Lcom/tawabsoft/taxi/common/components/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "app", "Lcom/tawabsoft/taxi/common/MyTaxiApplication;", "getApp", "()Lcom/tawabsoft/taxi/common/MyTaxiApplication;", "setApp", "(Lcom/tawabsoft/taxi/common/MyTaxiApplication;)V", "currentTheme", "", "getCurrentTheme", "()I", "immersiveScreen", "", "getImmersiveScreen", "()Z", "setImmersiveScreen", "(Z)V", "isInForeground", "preferences", "Lcom/tawabsoft/taxi/common/utils/MyPreferenceManager;", "getPreferences", "()Lcom/tawabsoft/taxi/common/utils/MyPreferenceManager;", "primaryColor", "getPrimaryColor", "screenDensity", "", "shouldReconnect", "getShouldReconnect", "setShouldReconnect", "showConnectionDialog", "getShowConnectionDialog", "setShowConnectionDialog", "toolbar", "Landroidx/appcompat/app/ActionBar;", "getToolbar", "()Landroidx/appcompat/app/ActionBar;", "setToolbar", "(Landroidx/appcompat/app/ActionBar;)V", "attachBaseContext", "", "base", "Landroid/content/Context;", "clearReferences", "convertDPToPixel", "dp", "initializeToolbar", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onReconnected", "onResume", "setActivityTheme", "activity", "common_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.ActionBar toolbar;
    private float screenDensity = 0.0F;
    private boolean isInForeground = false;
    private boolean showConnectionDialog = true;
    private boolean shouldReconnect = true;
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.common.MyTaxiApplication app;
    private boolean immersiveScreen = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.ActionBar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.ActionBar p0) {
    }
    
    public final boolean getShowConnectionDialog() {
        return false;
    }
    
    public final void setShowConnectionDialog(boolean p0) {
    }
    
    public final boolean getShouldReconnect() {
        return false;
    }
    
    public final void setShouldReconnect(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.MyTaxiApplication getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.MyTaxiApplication p0) {
    }
    
    public boolean getImmersiveScreen() {
        return false;
    }
    
    public void setImmersiveScreen(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.utils.MyPreferenceManager getPreferences() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    public final void initializeToolbar(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    public final void initializeToolbar(@androidx.annotation.StringRes()
    int title) {
    }
    
    public final int getPrimaryColor() {
        return 0;
    }
    
    public void onReconnected() {
    }
    
    public final int getCurrentTheme() {
        return 0;
    }
    
    private final void setActivityTheme(androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    private final void clearReferences() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final int convertDPToPixel(int dp) {
        return 0;
    }
    
    public BaseActivity() {
        super();
    }
}