package com.tawabsoft.taxi.driver.activities.main.fragments;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/main/fragments/RequestFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/tawabsoft/taxi/driver/databinding/FragmentRequestBinding;", "getBinding", "()Lcom/tawabsoft/taxi/driver/databinding/FragmentRequestBinding;", "setBinding", "(Lcom/tawabsoft/taxi/driver/databinding/FragmentRequestBinding;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "mListener", "Lcom/tawabsoft/taxi/driver/activities/main/fragments/RequestFragment$OnFragmentInteractionListener;", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "locationChanged", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "Companion", "OnFragmentInteractionListener", "driver_release"})
public final class RequestFragment extends androidx.fragment.app.Fragment {
    private com.tawabsoft.taxi.common.models.Request request;
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.driver.databinding.FragmentRequestBinding binding;
    private android.os.CountDownTimer countDownTimer;
    private com.tawabsoft.taxi.driver.activities.main.fragments.RequestFragment.OnFragmentInteractionListener mListener;
    private static final java.lang.String ARG_REQUEST = "request";
    public static final com.tawabsoft.taxi.driver.activities.main.fragments.RequestFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.driver.databinding.FragmentRequestBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.databinding.FragmentRequestBinding p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public final void locationChanged(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    public RequestFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/main/fragments/RequestFragment$OnFragmentInteractionListener;", "", "onAccept", "", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "onDecline", "onInvisible", "onVisible", "driver_release"})
    public static abstract interface OnFragmentInteractionListener {
        
        public abstract void onAccept(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request);
        
        public abstract void onDecline(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request);
        
        public abstract void onVisible(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request);
        
        public abstract void onInvisible(@org.jetbrains.annotations.NotNull()
        com.tawabsoft.taxi.common.models.Request request);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/main/fragments/RequestFragment$Companion;", "", "()V", "ARG_REQUEST", "", "newInstance", "Lcom/tawabsoft/taxi/driver/activities/main/fragments/RequestFragment;", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "driver_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.driver.activities.main.fragments.RequestFragment newInstance(@org.jetbrains.annotations.Nullable()
        com.tawabsoft.taxi.common.models.Request request) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}