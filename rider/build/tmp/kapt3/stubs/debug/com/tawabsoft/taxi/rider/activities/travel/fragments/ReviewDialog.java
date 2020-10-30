package com.tawabsoft.taxi.rider.activities.travel.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/travel/fragments/ReviewDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lcom/tawabsoft/taxi/rider/databinding/FragmentReviewBinding;", "getBinding", "()Lcom/tawabsoft/taxi/rider/databinding/FragmentReviewBinding;", "setBinding", "(Lcom/tawabsoft/taxi/rider/databinding/FragmentReviewBinding;)V", "mListener", "Lcom/tawabsoft/taxi/rider/activities/travel/fragments/ReviewDialog$OnReviewFragmentInteractionListener;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onResume", "Companion", "OnReviewFragmentInteractionListener", "rider_debug"})
public final class ReviewDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.rider.databinding.FragmentReviewBinding binding;
    private com.tawabsoft.taxi.rider.activities.travel.fragments.ReviewDialog.OnReviewFragmentInteractionListener mListener;
    public static final com.tawabsoft.taxi.rider.activities.travel.fragments.ReviewDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.databinding.FragmentReviewBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.databinding.FragmentReviewBinding p0) {
    }
    
    private final android.view.View onCreateDialogView(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
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
    
    public ReviewDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/travel/fragments/ReviewDialog$OnReviewFragmentInteractionListener;", "", "onReviewTravelClicked", "", "review", "Lcom/tawabsoft/taxi/common/models/Review;", "rider_debug"})
    public static abstract interface OnReviewFragmentInteractionListener {
        
        public abstract void onReviewTravelClicked(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Review review);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/travel/fragments/ReviewDialog$Companion;", "", "()V", "newInstance", "Lcom/tawabsoft/taxi/rider/activities/travel/fragments/ReviewDialog;", "rider_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.rider.activities.travel.fragments.ReviewDialog newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}