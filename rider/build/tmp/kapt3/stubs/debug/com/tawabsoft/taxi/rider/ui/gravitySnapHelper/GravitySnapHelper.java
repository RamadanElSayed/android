package com.tawabsoft.taxi.rider.ui.gravitySnapHelper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0005J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tawabsoft/taxi/rider/ui/gravitySnapHelper/GravitySnapHelper;", "Landroidx/recyclerview/widget/LinearSnapHelper;", "gravity", "", "enableSnapLastItem", "", "snapListener", "Lcom/tawabsoft/taxi/rider/ui/gravitySnapHelper/GravitySnapHelper$SnapListener;", "(IZLcom/tawabsoft/taxi/rider/ui/gravitySnapHelper/GravitySnapHelper$SnapListener;)V", "delegate", "Lcom/tawabsoft/taxi/rider/ui/gravitySnapHelper/GravityDelegate;", "attachToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "enableLastItemSnap", "snap", "findSnapView", "SnapListener", "rider_debug"})
public final class GravitySnapHelper extends androidx.recyclerview.widget.LinearSnapHelper {
    private final com.tawabsoft.taxi.rider.ui.gravitySnapHelper.GravityDelegate delegate = null;
    
    @java.lang.Override()
    public void attachToRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView recyclerView) throws java.lang.IllegalStateException {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public int[] calculateDistanceToFinalSnap(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, @org.jetbrains.annotations.NotNull()
    android.view.View targetView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View findSnapView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return null;
    }
    
    /**
     * Enable snapping of the last item that's snappable.
     * The default value is false, because you can't see the last item completely
     * if this is enabled.
     *
     * @param snap true if you want to enable snapping of the last snappable item
     */
    public final void enableLastItemSnap(boolean snap) {
    }
    
    public GravitySnapHelper(int gravity, boolean enableSnapLastItem, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.rider.ui.gravitySnapHelper.GravitySnapHelper.SnapListener snapListener) {
        super();
    }
    
    public GravitySnapHelper(int gravity, boolean enableSnapLastItem) {
        super();
    }
    
    public GravitySnapHelper(int gravity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/rider/ui/gravitySnapHelper/GravitySnapHelper$SnapListener;", "", "onSnap", "", "position", "", "rider_debug"})
    public static abstract interface SnapListener {
        
        public abstract void onSnap(int position);
    }
}