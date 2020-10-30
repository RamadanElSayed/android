package com.tawabsoft.taxi.rider.activities.travel.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bJ\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/travel/adapters/TravelTabsViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "manager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "request", "Lcom/tawabsoft/taxi/common/models/Request;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/tawabsoft/taxi/common/models/Request;)V", "arrayIndexes", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "statisticsFragment", "Lcom/tawabsoft/taxi/rider/activities/travel/fragments/TabStatisticsFragment;", "getStatisticsFragment", "()Lcom/tawabsoft/taxi/rider/activities/travel/fragments/TabStatisticsFragment;", "setStatisticsFragment", "(Lcom/tawabsoft/taxi/rider/activities/travel/fragments/TabStatisticsFragment;)V", "deletePage", "", "position", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "getPageTitle", "", "rider_debug"})
public final class TravelTabsViewPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    private final java.util.ArrayList<java.lang.Integer> arrayIndexes = null;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.rider.activities.travel.fragments.TabStatisticsFragment statisticsFragment;
    private final android.content.Context context = null;
    private final com.tawabsoft.taxi.common.models.Request request = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.rider.activities.travel.fragments.TabStatisticsFragment getStatisticsFragment() {
        return null;
    }
    
    public final void setStatisticsFragment(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.rider.activities.travel.fragments.TabStatisticsFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    public final void deletePage(int position) {
    }
    
    public TravelTabsViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Request request) {
        super(null);
    }
}