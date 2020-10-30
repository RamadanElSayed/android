package com.tawabsoft.taxi.driver.activities.main.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/main/adapters/RequestsFragmentPagerAdapter;", "Lcom/tawabsoft/taxi/common/ui/ArrayFragmentPagerAdapter;", "Lcom/tawabsoft/taxi/common/models/Request;", "fm", "Landroidx/fragment/app/FragmentManager;", "requests", "Ljava/util/ArrayList;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "getFragment", "Landroidx/fragment/app/Fragment;", "item", "position", "", "getPositionWithTravelId", "travelId", "", "driver_release"})
public final class RequestsFragmentPagerAdapter extends com.tawabsoft.taxi.common.ui.ArrayFragmentPagerAdapter<com.tawabsoft.taxi.common.models.Request> {
    
    public final int getPositionWithTravelId(long travelId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getFragment(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Request item, int position) {
        return null;
    }
    
    public RequestsFragmentPagerAdapter(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tawabsoft.taxi.common.models.Request> requests) {
        super(null);
    }
}