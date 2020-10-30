package com.tawabsoft.taxi.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/tawabsoft/taxi/common/MyTaxiApplication;", "Landroid/app/Application;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "currentActivity", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "attachBaseContext", "", "base", "Landroid/content/Context;", "getCurrentActivity", "Landroid/app/Activity;", "onCreate", "onMoveToBackground", "onMoveToForeground", "setCurrentActivity", "mCurrentActivity", "common_release"})
public final class MyTaxiApplication extends android.app.Application implements androidx.lifecycle.LifecycleObserver {
    private com.tawabsoft.taxi.common.components.BaseActivity currentActivity;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getCurrentActivity() {
        return null;
    }
    
    public final void setCurrentActivity(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.components.BaseActivity mCurrentActivity) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
    }
    
    public MyTaxiApplication() {
        super();
    }
}