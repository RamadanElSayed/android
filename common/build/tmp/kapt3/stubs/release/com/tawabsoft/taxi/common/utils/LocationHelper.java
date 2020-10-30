package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/LocationHelper;", "", "con", "Landroid/content/Context;", "(Landroid/content/Context;)V", "loadGps", "", "listener", "Landroid/location/LocationListener;", "Companion", "common_release"})
public final class LocationHelper {
    private final android.content.Context con = null;
    @org.jetbrains.annotations.Nullable()
    private static android.location.LocationManager locationManager;
    public static final com.tawabsoft.taxi.common.utils.LocationHelper.Companion Companion = null;
    
    public final void loadGps(@org.jetbrains.annotations.Nullable()
    android.location.LocationListener listener) {
    }
    
    public LocationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context con) {
        super();
    }
    
    public static final int distFrom(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng1, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng2) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final double[] LatLngToDoubleArray(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.gms.maps.model.LatLng DoubleArrayToLatLng(@org.jetbrains.annotations.NotNull()
    double[] position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/LocationHelper$Companion;", "", "()V", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "DoubleArrayToLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "position", "", "LatLngToDoubleArray", "distFrom", "", "latLng1", "latLng2", "common_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final android.location.LocationManager getLocationManager() {
            return null;
        }
        
        public final void setLocationManager(@org.jetbrains.annotations.Nullable()
        android.location.LocationManager p0) {
        }
        
        public final int distFrom(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng latLng1, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng latLng2) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final double[] LatLngToDoubleArray(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.maps.model.LatLng DoubleArrayToLatLng(@org.jetbrains.annotations.NotNull()
        double[] position) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}