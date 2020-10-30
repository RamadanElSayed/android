package com.tawabsoft.taxi.rider.activities.coupon.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\'\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$ViewHolder;", "coupons", "", "Lcom/tawabsoft/taxi/common/models/Coupon;", "isEditMode", "", "listener", "Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$OnCouponItemInteractionListener;", "(Ljava/util/List;ZLcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$OnCouponItemInteractionListener;)V", "()Z", "setEditMode", "(Z)V", "getListener", "()Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$OnCouponItemInteractionListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnCouponItemInteractionListener", "ViewHolder", "rider_debug"})
public final class CouponsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.ViewHolder> {
    private boolean isEditMode = false;
    private final java.util.List<com.tawabsoft.taxi.common.models.Coupon> coupons = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.OnCouponItemInteractionListener listener = null;
    
    public final boolean isEditMode() {
        return false;
    }
    
    public final void setEditMode(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.OnCouponItemInteractionListener getListener() {
        return null;
    }
    
    public CouponsRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Coupon> coupons, boolean isEditMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.OnCouponItemInteractionListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$OnCouponItemInteractionListener;", "", "onSelect", "", "coupon", "Lcom/tawabsoft/taxi/common/models/Coupon;", "rider_debug"})
    public static abstract interface OnCouponItemInteractionListener {
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Coupon coupon);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ItemCouponBinding;", "(Lcom/tawabsoft/taxi/rider/databinding/ItemCouponBinding;)V", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ItemCouponBinding;", "setBinding", "bind", "", "coupon", "Lcom/tawabsoft/taxi/common/models/Coupon;", "listener", "Lcom/tawabsoft/taxi/rider/activities/coupon/adapters/CouponsRecyclerViewAdapter$OnCouponItemInteractionListener;", "rider_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.tawabsoft.taxi.rider.databinding.ItemCouponBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Coupon coupon, @org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.activities.coupon.adapters.CouponsRecyclerViewAdapter.OnCouponItemInteractionListener listener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.rider.databinding.ItemCouponBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemCouponBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemCouponBinding binding) {
            super(null);
        }
    }
}