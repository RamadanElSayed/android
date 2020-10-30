package com.tawabsoft.taxi.driver.activities.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/statistics/StatisticsActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "()V", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ActivityStatisticsBinding;", "getBinding", "()Lcom/tawabsoft/taxi/driver/databinding/ActivityStatisticsBinding;", "setBinding", "(Lcom/tawabsoft/taxi/driver/databinding/ActivityStatisticsBinding;)V", "tabSelectedListener", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPaymentRequestClicked", "view", "Landroid/view/View;", "refreshStats", "queryType", "Lcom/tawabsoft/taxi/driver/networking/socket/QueryType;", "driver_release"})
public final class StatisticsActivity extends com.tawabsoft.taxi.common.components.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.driver.databinding.ActivityStatisticsBinding binding;
    private com.google.android.material.tabs.TabLayout.OnTabSelectedListener tabSelectedListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.driver.databinding.ActivityStatisticsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.databinding.ActivityStatisticsBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void refreshStats(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.networking.socket.QueryType queryType) {
    }
    
    public final void onPaymentRequestClicked(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public StatisticsActivity() {
        super();
    }
}