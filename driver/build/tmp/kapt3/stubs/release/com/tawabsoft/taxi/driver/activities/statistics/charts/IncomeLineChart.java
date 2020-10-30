package com.tawabsoft.taxi.driver.activities.statistics.charts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J%\u0010\r\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/statistics/charts/IncomeLineChart;", "Lcom/tawabsoft/taxi/driver/activities/statistics/charts/ChartBase;", "mChart", "Lcom/db/williamchart/view/LineChartView;", "mContext", "Landroid/content/Context;", "(Lcom/db/williamchart/view/LineChartView;Landroid/content/Context;)V", "mBaseAction", "Ljava/lang/Runnable;", "dismiss", "", "action", "show", "update", "labels", "", "", "values", "", "([Ljava/lang/String;[F)V", "driver_release"})
public final class IncomeLineChart extends com.tawabsoft.taxi.driver.activities.statistics.charts.ChartBase {
    private java.lang.Runnable mBaseAction;
    private final com.db.williamchart.view.LineChartView mChart = null;
    private final android.content.Context mContext = null;
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable action) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    java.lang.String[] labels, @org.jetbrains.annotations.NotNull()
    float[] values) {
    }
    
    @java.lang.Override()
    public void dismiss(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable action) {
    }
    
    public IncomeLineChart(@org.jetbrains.annotations.NotNull()
    com.db.williamchart.view.LineChartView mChart, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}