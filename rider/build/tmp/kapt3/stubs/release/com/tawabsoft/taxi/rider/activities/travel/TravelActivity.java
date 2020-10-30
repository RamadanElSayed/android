package com.tawabsoft.taxi.rider.activities.travel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0015J\u0010\u0010\'\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0011H\u0016J\u0012\u0010*\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J-\u0010,\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00132\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\b\u00103\u001a\u00020\u0019H\u0014J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0019H\u0002J\b\u00108\u001a\u00020\u0019H\u0002J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020;H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/travel/TravelActivity;", "Lcom/tawabsoft/taxi/rider/ui/RiderBaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/tawabsoft/taxi/rider/activities/travel/fragments/ReviewDialog$OnReviewFragmentInteractionListener;", "Lcom/tawabsoft/taxi/rider/activities/travel/fragments/TabStatisticsFragment$OnTravelInfoReceived;", "()V", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ActivityTravelBinding;", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ActivityTravelBinding;", "setBinding", "(Lcom/tawabsoft/taxi/rider/databinding/ActivityTravelBinding;)V", "driverLocation", "Lcom/google/android/gms/maps/model/LatLng;", "driverMarker", "Lcom/google/android/gms/maps/model/Marker;", "gMap", "Lcom/google/android/gms/maps/GoogleMap;", "permissionPhoneCallRequestCode", "", "pointMarkers", "", "travelTabsViewPagerAdapter", "Lcom/tawabsoft/taxi/rider/activities/travel/adapters/TravelTabsViewPagerAdapter;", "callDriver", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onApplyCouponClicked", "view", "Landroid/view/View;", "onBackPressed", "onChargeAccountClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEnableVerification", "onMapReady", "googleMap", "onReceived", "onReconnected", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onReviewTravelClicked", "review", "Lcom/tawabsoft/taxi/common/models/Review;", "refreshPage", "requestRefresh", "updateTravelStatus", "status", "Lcom/tawabsoft/taxi/common/models/Request$Status;", "Companion", "rider_release"})
public final class TravelActivity extends com.tawabsoft.taxi.rider.ui.RiderBaseActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.tawabsoft.taxi.rider.activities.travel.fragments.ReviewDialog.OnReviewFragmentInteractionListener, com.tawabsoft.taxi.rider.activities.travel.fragments.TabStatisticsFragment.OnTravelInfoReceived {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.rider.databinding.ActivityTravelBinding binding;
    private java.util.List<com.google.android.gms.maps.model.Marker> pointMarkers;
    private com.google.android.gms.maps.model.Marker driverMarker;
    private com.google.android.gms.maps.model.LatLng driverLocation;
    private com.google.android.gms.maps.GoogleMap gMap;
    private com.tawabsoft.taxi.rider.activities.travel.adapters.TravelTabsViewPagerAdapter travelTabsViewPagerAdapter;
    private final int permissionPhoneCallRequestCode = 400;
    private static final int ACTIVITY_COUPON = 700;
    public static final com.tawabsoft.taxi.rider.activities.travel.TravelActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.databinding.ActivityTravelBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.databinding.ActivityTravelBinding p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onReconnected() {
    }
    
    private final void requestRefresh() {
    }
    
    private final void refreshPage() {
    }
    
    private final void updateTravelStatus(com.tawabsoft.taxi.common.models.Request.Status status) {
    }
    
    public final void onChargeAccountClicked(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onApplyCouponClicked(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onReviewTravelClicked(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Review review) {
    }
    
    private final void callDriver() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onReceived(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng driverLocation) {
    }
    
    public final void onEnableVerification(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public TravelActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/travel/TravelActivity$Companion;", "", "()V", "ACTIVITY_COUPON", "", "rider_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}