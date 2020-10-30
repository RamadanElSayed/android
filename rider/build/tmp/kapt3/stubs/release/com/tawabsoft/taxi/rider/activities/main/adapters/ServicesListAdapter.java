package com.tawabsoft.taxi.rider.activities.main.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/main/adapters/ServicesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/rider/activities/main/adapters/ServicesListAdapter$ViewHolder;", "services", "", "Lcom/tawabsoft/taxi/common/models/Service;", "distance", "", "duration", "currency", "", "(Ljava/util/List;IILjava/lang/String;)V", "tracker", "Landroidx/recyclerview/selection/SelectionTracker;", "", "getTracker", "()Landroidx/recyclerview/selection/SelectionTracker;", "setTracker", "(Landroidx/recyclerview/selection/SelectionTracker;)V", "getItemCount", "getItemId", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "rider_release"})
public final class ServicesListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.rider.activities.main.adapters.ServicesListAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.selection.SelectionTracker<java.lang.Long> tracker;
    private final java.util.List<com.tawabsoft.taxi.common.models.Service> services = null;
    private int distance;
    private int duration;
    private java.lang.String currency;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.selection.SelectionTracker<java.lang.Long> getTracker() {
        return null;
    }
    
    public final void setTracker(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.selection.SelectionTracker<java.lang.Long> p0) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.rider.activities.main.adapters.ServicesListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.activities.main.adapters.ServicesListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ServicesListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.Service> services, int distance, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J(\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0017"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/main/adapters/ServicesListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/rider/databinding/ItemServiceBinding;", "(Lcom/tawabsoft/taxi/rider/databinding/ItemServiceBinding;)V", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/ItemServiceBinding;", "setBinding", "bind", "", "service", "Lcom/tawabsoft/taxi/common/models/Service;", "distance", "", "duration", "currency", "", "selected", "", "getItemDetails", "Landroidx/recyclerview/selection/ItemDetailsLookup$ItemDetails;", "", "updatePrice", "rider_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.tawabsoft.taxi.rider.databinding.ItemServiceBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Service service, int distance, int duration, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, boolean selected) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.selection.ItemDetailsLookup.ItemDetails<java.lang.Long> getItemDetails() {
            return null;
        }
        
        private final void updatePrice(com.tawabsoft.taxi.common.models.Service service, int distance, int duration, java.lang.String currency) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.rider.databinding.ItemServiceBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemServiceBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.rider.databinding.ItemServiceBinding binding) {
            super(null);
        }
    }
}