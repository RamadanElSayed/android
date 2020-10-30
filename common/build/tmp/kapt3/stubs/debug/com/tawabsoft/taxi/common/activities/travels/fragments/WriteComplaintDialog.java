package com.tawabsoft.taxi.common.activities.travels.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/travels/fragments/WriteComplaintDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lcom/tawabsoft/taxi/common/databinding/DialogWriteComplaintBinding;", "getBinding", "()Lcom/tawabsoft/taxi/common/databinding/DialogWriteComplaintBinding;", "setBinding", "(Lcom/tawabsoft/taxi/common/databinding/DialogWriteComplaintBinding;)V", "mListener", "Lcom/tawabsoft/taxi/common/activities/travels/fragments/WriteComplaintDialog$OnWriteComplaintInteractionListener;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onResume", "OnWriteComplaintInteractionListener", "common_debug"})
public final class WriteComplaintDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.common.databinding.DialogWriteComplaintBinding binding;
    private com.tawabsoft.taxi.common.activities.travels.fragments.WriteComplaintDialog.OnWriteComplaintInteractionListener mListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.databinding.DialogWriteComplaintBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.databinding.DialogWriteComplaintBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View onCreateDialogView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public WriteComplaintDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/travels/fragments/WriteComplaintDialog$OnWriteComplaintInteractionListener;", "", "onSaveComplaintClicked", "", "event", "Lcom/tawabsoft/taxi/common/activities/travels/fragments/Complaint;", "common_debug"})
    public static abstract interface OnWriteComplaintInteractionListener {
        
        public abstract void onSaveComplaintClicked(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.activities.travels.fragments.Complaint event);
    }
}