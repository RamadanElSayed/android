package com.tawabsoft.taxi.driver.activities.profile.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$ViewHolder;", "services", "", "Lcom/tawabsoft/taxi/common/models/Service;", "listener", "Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$OnServiceItemInteractionListener;", "(Ljava/util/List;Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$OnServiceItemInteractionListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnServiceItemInteractionListener", "ViewHolder", "driver_debug"})
public final class ServicesRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.ViewHolder> {
    private final java.util.List<com.tawabsoft.taxi.common.models.Service> services = null;
    private final com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.OnServiceItemInteractionListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ServicesRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.Service> services, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.OnServiceItemInteractionListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ItemServiceBinding;", "(Lcom/tawabsoft/taxi/driver/databinding/ItemServiceBinding;)V", "bind", "", "service", "Lcom/tawabsoft/taxi/common/models/Service;", "listener", "Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$OnServiceItemInteractionListener;", "driver_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.tawabsoft.taxi.driver.databinding.ItemServiceBinding binding;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.tawabsoft.taxi.common.models.Service service, @org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.OnServiceItemInteractionListener listener) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.driver.databinding.ItemServiceBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$OnServiceItemInteractionListener;", "", "onChecked", "", "service", "Lcom/tawabsoft/taxi/common/models/Service;", "onUnchecked", "driver_debug"})
    public static abstract interface OnServiceItemInteractionListener {
        
        public abstract void onChecked(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Service service);
        
        public abstract void onUnchecked(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Service service);
    }
}