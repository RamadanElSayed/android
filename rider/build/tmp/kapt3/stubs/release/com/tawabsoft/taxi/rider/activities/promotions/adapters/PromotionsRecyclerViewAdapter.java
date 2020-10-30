package com.tawabsoft.taxi.rider.activities.promotions.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/promotions/adapters/PromotionsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/rider/activities/promotions/adapters/PromotionsRecyclerViewAdapter$ViewHolder;", "promotions", "", "Lcom/tawabsoft/taxi/common/models/Promotion;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "rider_release"})
public final class PromotionsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.rider.activities.promotions.adapters.PromotionsRecyclerViewAdapter.ViewHolder> {
    private final java.util.List<com.tawabsoft.taxi.common.models.Promotion> promotions = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.rider.activities.promotions.adapters.PromotionsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.activities.promotions.adapters.PromotionsRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PromotionsRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Promotion> promotions) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/promotions/adapters/PromotionsRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ItemPromotionBinding;", "(Lcom/tawabsoft/taxi/rider/databinding/ItemPromotionBinding;)V", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ItemPromotionBinding;", "setBinding", "bind", "", "promotion", "Lcom/tawabsoft/taxi/common/models/Promotion;", "rider_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.tawabsoft.taxi.rider.databinding.ItemPromotionBinding binding;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.tawabsoft.taxi.common.models.Promotion promotion) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.rider.databinding.ItemPromotionBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemPromotionBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemPromotionBinding binding) {
            super(null);
        }
    }
}