package com.tawabsoft.taxi.rider.activities.coupon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/coupon/CouponActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "()V", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ActivityCouponBinding;", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ActivityCouponBinding;", "setBinding", "(Lcom/tawabsoft/taxi/rider/databinding/ActivityCouponBinding;)V", "coupon", "Lcom/tawabsoft/taxi/common/models/Coupon;", "getCoupon", "()Lcom/tawabsoft/taxi/common/models/Coupon;", "setCoupon", "(Lcom/tawabsoft/taxi/common/models/Coupon;)V", "isEditMode", "", "()Z", "setEditMode", "(Z)V", "addCoupon", "", "code", "", "applyCoupon", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "refreshCoupons", "rider_debug"})
public final class CouponActivity extends com.tawabsoft.taxi.common.components.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.rider.databinding.ActivityCouponBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Coupon coupon;
    private boolean isEditMode = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.databinding.ActivityCouponBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.databinding.ActivityCouponBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Coupon getCoupon() {
        return null;
    }
    
    public final void setCoupon(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Coupon p0) {
    }
    
    public final boolean isEditMode() {
        return false;
    }
    
    public final void setEditMode(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void refreshCoupons() {
    }
    
    public final void applyCoupon(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public final void addCoupon(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public CouponActivity() {
        super();
    }
}