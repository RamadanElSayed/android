package com.tawabsoft.taxi.rider.activities.main.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tawabsoft/taxi/rider/activities/main/adapters/ServiceCategoryViewPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "manager", "Landroidx/fragment/app/FragmentManager;", "list", "", "Lcom/tawabsoft/taxi/common/models/ServiceCategory;", "distance", "", "duration", "currency", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;IILjava/lang/String;)V", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getItemPosition", "object", "", "getPageTitle", "", "setItems", "", "Ljava/util/ArrayList;", "rider_release"})
public final class ServiceCategoryViewPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
    private java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> list;
    private final int distance = 0;
    private final int duration = 0;
    private final java.lang.String currency = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tawabsoft.taxi.common.models.ServiceCategory> list) {
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
    
    @java.lang.Override()
    public int getItemPosition(@org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return 0;
    }
    
    public ServiceCategoryViewPagerAdapter(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> list, int distance, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        super(null);
    }
}