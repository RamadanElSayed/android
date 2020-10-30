package com.tawabsoft.taxi.rider.activities.addresses.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter$ViewHolder;", "addresses", "", "Lcom/tawabsoft/taxi/common/models/Address;", "listener", "Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter$OnAddressItemInteractionListener;", "(Ljava/util/List;Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter$OnAddressItemInteractionListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnAddressItemInteractionListener", "ViewHolder", "rider_release"})
public final class AddressesRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.rider.activities.addresses.adapters.AddressesRecyclerViewAdapter.ViewHolder> {
    private final java.util.List<com.tawabsoft.taxi.common.models.Address> addresses = null;
    private final com.tawabsoft.taxi.rider.activities.addresses.adapters.AddressesRecyclerViewAdapter.OnAddressItemInteractionListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.rider.activities.addresses.adapters.AddressesRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.activities.addresses.adapters.AddressesRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public AddressesRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.Address> addresses, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.activities.addresses.adapters.AddressesRecyclerViewAdapter.OnAddressItemInteractionListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ItemAddressBinding;", "(Lcom/tawabsoft/taxi/rider/databinding/ItemAddressBinding;)V", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ItemAddressBinding;", "setBinding", "bind", "", "address", "Lcom/tawabsoft/taxi/common/models/Address;", "listener", "Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter$OnAddressItemInteractionListener;", "rider_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.tawabsoft.taxi.rider.databinding.ItemAddressBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Address address, @org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.activities.addresses.adapters.AddressesRecyclerViewAdapter.OnAddressItemInteractionListener listener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.rider.databinding.ItemAddressBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemAddressBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemAddressBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/addresses/adapters/AddressesRecyclerViewAdapter$OnAddressItemInteractionListener;", "", "onDelete", "", "address", "Lcom/tawabsoft/taxi/common/models/Address;", "onEdit", "rider_release"})
    public static abstract interface OnAddressItemInteractionListener {
        
        public abstract void onEdit(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Address address);
        
        public abstract void onDelete(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Address address);
    }
}