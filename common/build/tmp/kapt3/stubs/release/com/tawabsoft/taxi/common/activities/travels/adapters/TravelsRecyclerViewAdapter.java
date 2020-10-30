package com.tawabsoft.taxi.common.activities.travels.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$ViewHolder;", "context", "Landroid/content/Context;", "requests", "", "Lcom/tawabsoft/taxi/common/models/Request;", "listener", "Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$OnTravelItemInteractionListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$OnTravelItemInteractionListener;)V", "getListener", "()Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$OnTravelItemInteractionListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnTravelItemInteractionListener", "ViewHolder", "common_release"})
public final class TravelsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final java.util.List<com.tawabsoft.taxi.common.models.Request> requests = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.OnTravelItemInteractionListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.OnTravelItemInteractionListener getListener() {
        return null;
    }
    
    public TravelsRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.Request> requests, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.OnTravelItemInteractionListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$OnTravelItemInteractionListener;", "", "onHideTravel", "", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "onWriteComplaint", "common_release"})
    public static abstract interface OnTravelItemInteractionListener {
        
        public abstract void onHideTravel(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request);
        
        public abstract void onWriteComplaint(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/common/databinding/ItemTravelBinding;", "(Lcom/tawabsoft/taxi/common/databinding/ItemTravelBinding;)V", "getBinding", "()Lcom/tawabsoft/taxi/common/databinding/ItemTravelBinding;", "setBinding", "bind", "", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "listener", "Lcom/tawabsoft/taxi/common/activities/travels/adapters/TravelsRecyclerViewAdapter$OnTravelItemInteractionListener;", "context", "Landroid/content/Context;", "common_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.tawabsoft.taxi.common.databinding.ItemTravelBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request, @org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.activities.travels.adapters.TravelsRecyclerViewAdapter.OnTravelItemInteractionListener listener, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.databinding.ItemTravelBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.databinding.ItemTravelBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.databinding.ItemTravelBinding binding) {
            super(null);
        }
    }
}