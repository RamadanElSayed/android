package com.tawabsoft.taxi.rider.activities.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020 2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010-\u001a\u00020\u001eH\u0016J-\u0010/\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00052\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e012\u0006\u00102\u001a\u000203H\u0016\u00a2\u0006\u0002\u00104J\b\u00105\u001a\u00020 H\u0014J \u00106\u001a\u00020 2\u0006\u0010-\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020(H\u0016J\b\u00109\u001a\u00020 H\u0002J\u0006\u0010:\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/splash/SplashActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "Landroid/location/LocationListener;", "()V", "SPLASH_DISPLAY_LENGTH", "", "appPreferences", "Lcom/tawabsoft/taxi/common/AppPreferences;", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ActivitySplashBinding;", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ActivitySplashBinding;", "setBinding", "(Lcom/tawabsoft/taxi/rider/databinding/ActivitySplashBinding;)V", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "goingToOpen", "", "isErrored", "locationManager", "Landroid/location/LocationManager;", "locationTimeoutHandler", "Landroid/os/Handler;", "permissionLocationRequestCode", "signInRequestCode", "token", "", "checkPermissions", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "Landroid/location/Location;", "onProviderDisabled", "s", "onProviderEnabled", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStatusChanged", "i", "bundle", "requestLocation", "startSplashScreenVideo", "rider_release"})
public final class SplashActivity extends com.tawabsoft.taxi.common.components.BaseActivity implements android.location.LocationListener {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.rider.databinding.ActivitySplashBinding binding;
    private int signInRequestCode = 123;
    private android.os.Handler locationTimeoutHandler;
    private android.location.LocationManager locationManager;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng currentLocation;
    private boolean isErrored = false;
    private final int permissionLocationRequestCode = 321;
    private boolean goingToOpen = false;
    private int SPLASH_DISPLAY_LENGTH = 5000;
    private java.lang.String token;
    private com.tawabsoft.taxi.common.AppPreferences appPreferences;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.databinding.ActivitySplashBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.databinding.ActivitySplashBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkPermissions() {
    }
    
    private final void requestLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String s, int i, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public final void startSplashScreenVideo() {
    }
    
    public SplashActivity() {
        super();
    }
}