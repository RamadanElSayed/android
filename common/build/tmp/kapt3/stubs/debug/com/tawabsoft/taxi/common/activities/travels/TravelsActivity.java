package com.tawabsoft.taxi.common.activities.travels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/travels/TravelsActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "Lcom/tawabsoft/taxi/common/activities/travels/fragments/WriteComplaintDialog$OnWriteComplaintInteractionListener;", "()V", "binding", "Lcom/tawabsoft/taxi/common/databinding/ActivityTravelsBinding;", "getBinding", "()Lcom/tawabsoft/taxi/common/databinding/ActivityTravelsBinding;", "setBinding", "(Lcom/tawabsoft/taxi/common/databinding/ActivityTravelsBinding;)V", "lastSelectedTravelId", "", "loadList", "", "requests", "Ljava/util/ArrayList;", "Lcom/tawabsoft/taxi/common/models/Request;", "Lkotlin/collections/ArrayList;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveComplaintClicked", "event", "Lcom/tawabsoft/taxi/common/activities/travels/fragments/Complaint;", "refreshRequests", "common_debug"})
public final class TravelsActivity extends com.tawabsoft.taxi.common.components.BaseActivity implements com.tawabsoft.taxi.common.activities.travels.fragments.WriteComplaintDialog.OnWriteComplaintInteractionListener {
    private long lastSelectedTravelId = 0L;
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.common.databinding.ActivityTravelsBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.databinding.ActivityTravelsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.databinding.ActivityTravelsBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void refreshRequests() {
    }
    
    private final void loadList(java.util.ArrayList<com.tawabsoft.taxi.common.models.Request> requests) {
    }
    
    @java.lang.Override()
    public void onSaveComplaintClicked(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.activities.travels.fragments.Complaint event) {
    }
    
    public TravelsActivity() {
        super();
    }
}