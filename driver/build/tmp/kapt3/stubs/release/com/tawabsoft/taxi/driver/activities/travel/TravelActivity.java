package com.tawabsoft.taxi.driver.activities.travel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0006\u0010!\u001a\u00020\u0019J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u0019H\u0014J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001cH\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J-\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00162\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c022\u0006\u00103\u001a\u000204H\u0016\u00a2\u0006\u0002\u00105J\b\u00106\u001a\u00020\u0019H\u0014J \u00107\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020$H\u0016J\b\u0010:\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u00020\u0019H\u0002J\u0010\u0010<\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010=\u001a\u00020\u0019H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/travel/TravelActivity;", "Lcom/tawabsoft/taxi/driver/ui/DriverBaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroid/location/LocationListener;", "()V", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ActivityTravelBinding;", "getBinding", "()Lcom/tawabsoft/taxi/driver/databinding/ActivityTravelBinding;", "setBinding", "(Lcom/tawabsoft/taxi/driver/databinding/ActivityTravelBinding;)V", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "driverMarker", "Lcom/google/android/gms/maps/model/Marker;", "gMap", "Lcom/google/android/gms/maps/GoogleMap;", "geoLog", "", "locationManager", "Landroid/location/LocationManager;", "permissionPhoneCallRequestCode", "", "pointMarkers", "callFinish", "", "distanceReal", "path", "", "confirmationCode", "(ILjava/lang/String;Ljava/lang/Integer;)V", "callRider", "finishTravel", "onChatButtonClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "Landroid/location/Location;", "onMapReady", "googleMap", "onPause", "onProviderDisabled", "provider", "onProviderEnabled", "onReconnected", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStatusChanged", "status", "extras", "refreshPage", "requestRefresh", "showConfirmationDialog", "startTravel", "driver_release"})
public final class TravelActivity extends com.tawabsoft.taxi.driver.ui.DriverBaseActivity implements com.google.android.gms.maps.OnMapReadyCallback, android.location.LocationListener {
    private com.google.android.gms.maps.GoogleMap gMap;
    private com.google.android.gms.maps.model.LatLng currentLocation;
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.driver.databinding.ActivityTravelBinding binding;
    private java.util.List<com.google.android.gms.maps.model.Marker> pointMarkers;
    private com.google.android.gms.maps.model.Marker driverMarker;
    private android.location.LocationManager locationManager;
    private java.util.List<com.google.android.gms.maps.model.LatLng> geoLog;
    private final int permissionPhoneCallRequestCode = 400;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.driver.databinding.ActivityTravelBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.databinding.ActivityTravelBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onReconnected() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void requestRefresh() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull()
    java.lang.String provider) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull()
    java.lang.String provider) {
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String provider, int status, @org.jetbrains.annotations.NotNull()
    android.os.Bundle extras) {
    }
    
    private final void startTravel() {
    }
    
    private final void refreshPage() {
    }
    
    private final void finishTravel() {
    }
    
    private final void showConfirmationDialog(java.lang.String path) {
    }
    
    private final void callFinish(int distanceReal, java.lang.String path, java.lang.Integer confirmationCode) {
    }
    
    private final void callRider() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void onChatButtonClicked() {
    }
    
    public TravelActivity() {
        super();
    }
}