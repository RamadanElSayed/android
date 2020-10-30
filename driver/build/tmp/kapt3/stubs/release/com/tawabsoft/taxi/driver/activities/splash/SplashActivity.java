package com.tawabsoft.taxi.driver.activities.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/splash/SplashActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "()V", "SIGN_IN_ACTIVITY", "", "SPLASH_DISPLAY_LENGTH", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ActivitySplashBinding;", "startRequested", "", "token", "", "checkPermissions", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "driver_release"})
public final class SplashActivity extends com.tawabsoft.taxi.common.components.BaseActivity {
    private com.tawabsoft.taxi.driver.databinding.ActivitySplashBinding binding;
    private int SIGN_IN_ACTIVITY = 123;
    private boolean startRequested = false;
    private int SPLASH_DISPLAY_LENGTH = 5000;
    private java.lang.String token;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkPermissions() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public SplashActivity() {
        super();
    }
}