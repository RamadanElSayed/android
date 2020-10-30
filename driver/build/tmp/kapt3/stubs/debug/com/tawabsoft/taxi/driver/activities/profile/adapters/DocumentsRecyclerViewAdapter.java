package com.tawabsoft.taxi.driver.activities.profile.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/adapters/DocumentsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tawabsoft/taxi/driver/activities/profile/adapters/DocumentsRecyclerViewAdapter$ViewHolder;", "documents", "", "Lcom/tawabsoft/taxi/common/models/Media;", "listener", "Lcom/tawabsoft/taxi/common/interfaces/IDocumentEvent;", "(Ljava/util/List;Lcom/tawabsoft/taxi/common/interfaces/IDocumentEvent;)V", "getDocuments", "()Ljava/util/List;", "setDocuments", "(Ljava/util/List;)V", "getListener", "()Lcom/tawabsoft/taxi/common/interfaces/IDocumentEvent;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "driver_debug"})
public final class DocumentsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tawabsoft.taxi.driver.activities.profile.adapters.DocumentsRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.tawabsoft.taxi.common.models.Media> documents;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.interfaces.IDocumentEvent listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.driver.activities.profile.adapters.DocumentsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.activities.profile.adapters.DocumentsRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tawabsoft.taxi.common.models.Media> getDocuments() {
        return null;
    }
    
    public final void setDocuments(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.Media> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.interfaces.IDocumentEvent getListener() {
        return null;
    }
    
    public DocumentsRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.Media> documents, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.interfaces.IDocumentEvent listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/adapters/DocumentsRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ItemDocumentBinding;", "(Lcom/tawabsoft/taxi/driver/databinding/ItemDocumentBinding;)V", "getBinding", "()Lcom/tawabsoft/taxi/driver/databinding/ItemDocumentBinding;", "setBinding", "bind", "", "media", "Lcom/tawabsoft/taxi/common/models/Media;", "listener", "Lcom/tawabsoft/taxi/common/interfaces/IDocumentEvent;", "driver_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.tawabsoft.taxi.driver.databinding.ItemDocumentBinding binding;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.tawabsoft.taxi.common.models.Media media, @org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.interfaces.IDocumentEvent listener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.driver.databinding.ItemDocumentBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.driver.databinding.ItemDocumentBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.driver.databinding.ItemDocumentBinding binding) {
            super(null);
        }
    }
}