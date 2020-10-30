package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/CommonUtils;", "", "()V", "MY_PERMISSIONS_REQUEST_STORAGE", "", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "isGPSEnabled", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "isInternetDisabled", "common_debug"})
public final class CommonUtils {
    public static final int MY_PERMISSIONS_REQUEST_STORAGE = 2;
    @org.jetbrains.annotations.Nullable()
    private static com.google.android.gms.maps.model.LatLng currentLocation;
    public static final com.tawabsoft.taxi.common.utils.CommonUtils INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    public static final boolean isInternetDisabled(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    public static final boolean isGPSEnabled(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    private CommonUtils() {
        super();
    }
}