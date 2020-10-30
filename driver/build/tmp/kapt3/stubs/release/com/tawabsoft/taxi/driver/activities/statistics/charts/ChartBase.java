package com.tawabsoft.taxi.driver.activities.statistics.charts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0014J#\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0019\u001a\u00020\f\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0002J%\u0010\u001e\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0019\u001a\u00020\fH\u0014\u00a2\u0006\u0002\u0010\u001aR$\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/statistics/charts/ChartBase;", "", "()V", "mLabels", "", "", "getMLabels", "()[Ljava/lang/String;", "setMLabels", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "mValues", "", "getMValues", "()[F", "setMValues", "([F)V", "showAction", "Ljava/lang/Runnable;", "unlockAction", "dismiss", "", "action", "init", "labels", "values", "([Ljava/lang/String;[F)V", "lock", "show", "unlock", "update", "driver_release"})
public class ChartBase {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] mLabels;
    @org.jetbrains.annotations.NotNull()
    private float[] mValues;
    private final java.lang.Runnable unlockAction = null;
    private final java.lang.Runnable showAction = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getMLabels() {
        return null;
    }
    
    public final void setMLabels(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getMValues() {
        return null;
    }
    
    public final void setMValues(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String[] labels, @org.jetbrains.annotations.NotNull()
    float[] values) {
    }
    
    protected void show(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable action) {
    }
    
    protected void update(@org.jetbrains.annotations.NotNull()
    java.lang.String[] labels, @org.jetbrains.annotations.NotNull()
    float[] values) {
    }
    
    protected void dismiss(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable action) {
    }
    
    private final void lock() {
    }
    
    private final void unlock() {
    }
    
    public ChartBase() {
        super();
    }
}