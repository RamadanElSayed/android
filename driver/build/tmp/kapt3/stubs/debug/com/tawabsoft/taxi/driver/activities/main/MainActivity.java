package com.tawabsoft.taxi.driver.activities.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0015J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\tH\u0017J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J\b\u00102\u001a\u00020\u0014H\u0016J-\u00103\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00122\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u000200052\u0006\u00106\u001a\u000207H\u0016\u00a2\u0006\u0002\u00108J \u00109\u001a\u00020\u00142\u0006\u0010/\u001a\u0002002\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\"H\u0016J\u0010\u0010<\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010=\u001a\u00020\u0014H\u0002J\b\u0010>\u001a\u00020\u0014H\u0002J\b\u0010?\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/main/MainActivity;", "Lcom/tawabsoft/taxi/driver/ui/DriverBaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroid/location/LocationListener;", "Lcom/tawabsoft/taxi/driver/activities/main/fragments/RequestFragment$OnFragmentInteractionListener;", "()V", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ActivityMainBinding;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "markerDropOff", "Lcom/google/android/gms/maps/model/Marker;", "markerPickup", "requestCardsAdapter", "Lcom/tawabsoft/taxi/driver/activities/main/adapters/RequestsFragmentPagerAdapter;", "requestLocationCode", "", "checkPermissions", "", "fillInfo", "getLastKnownLocation", "logout", "onAccept", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDecline", "onInvisible", "onLocationChanged", "location", "Landroid/location/Location;", "onMapReady", "googleMap", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onProviderDisabled", "s", "", "onProviderEnabled", "onReconnected", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStatusChanged", "i", "bundle", "onVisible", "removeMarkers", "requestRefresh", "switchClicked", "Companion", "driver_debug"})
public final class MainActivity extends com.tawabsoft.taxi.driver.ui.DriverBaseActivity implements com.google.android.gms.maps.OnMapReadyCallback, android.location.LocationListener, com.tawabsoft.taxi.driver.activities.main.fragments.RequestFragment.OnFragmentInteractionListener {
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.google.android.gms.maps.model.Marker markerPickup;
    private com.google.android.gms.maps.model.Marker markerDropOff;
    private com.tawabsoft.taxi.driver.databinding.ActivityMainBinding binding;
    private com.tawabsoft.taxi.driver.activities.main.adapters.RequestsFragmentPagerAdapter requestCardsAdapter;
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    private final int requestLocationCode = 432;
    public static final int ACTIVITY_PROFILE = 11;
    public static final int ACTIVITY_WALLET = 12;
    public static final int ACTIVITY_TRAVEL = 14;
    public static final com.tawabsoft.taxi.driver.activities.main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void requestRefresh() {
    }
    
    private final void checkPermissions() {
    }
    
    @java.lang.Override()
    public void onReconnected() {
    }
    
    private final void switchClicked() {
    }
    
    private final void getLastKnownLocation() {
    }
    
    private final void fillInfo() {
    }
    
    private final void logout() {
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
    
    @java.lang.Override()
    public void onAccept(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Request request) {
    }
    
    @java.lang.Override()
    public void onDecline(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Request request) {
    }
    
    @java.lang.Override()
    public void onVisible(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Request request) {
    }
    
    @java.lang.Override()
    public void onInvisible(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Request request) {
    }
    
    private final void removeMarkers() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/main/MainActivity$Companion;", "", "()V", "ACTIVITY_PROFILE", "", "ACTIVITY_TRAVEL", "ACTIVITY_WALLET", "driver_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}