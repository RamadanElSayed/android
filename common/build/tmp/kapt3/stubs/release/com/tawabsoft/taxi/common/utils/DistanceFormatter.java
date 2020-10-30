package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/tawabsoft/taxi/common/utils/DistanceFormatter;", "", "()V", "FEET_IN_ONE_MILE", "", "METERS_IN_ONE_FOOT", "METERS_IN_ONE_MILE", "decimalFormat", "Ljava/text/DecimalFormat;", "format", "", "distanceInMeters", "", "realTime", "", "units", "Lcom/tawabsoft/taxi/common/utils/DistanceFormatter$DistanceUnits;", "locale", "Ljava/util/Locale;", "formatDistanceInKilometers", "formatDistanceInMiles", "formatDistanceLessThanTenFeet", "distanceInFeet", "formatDistanceOverTenFeet", "formatDistanceOverTenMeters", "formatKilometers", "formatMiles", "formatShortMeters", "roundDownToNearestTen", "distance", "useMiles", "DistanceUnits", "common_release"})
public final class DistanceFormatter {
    private static final double METERS_IN_ONE_MILE = 1609.0;
    private static final double METERS_IN_ONE_FOOT = 0.3048;
    private static final double FEET_IN_ONE_MILE = 5280.0;
    private static java.text.DecimalFormat decimalFormat;
    public static final com.tawabsoft.taxi.common.utils.DistanceFormatter INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(int distanceInMeters, boolean realTime) {
        return null;
    }
    
    /**
     * Format distance for display using specified distance units.
     *
     * @param distanceInMeters the actual distance in meters.
     * @param realTime boolean flag for navigation vs. list view.
     * @param units miles or kilometers.
     * @return distance string formatted according to the rules of the formatter.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(int distanceInMeters, boolean realTime, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.utils.DistanceFormatter.DistanceUnits units) {
        return null;
    }
    
    /**
     * Format distance for display using specified locale.
     *
     * @param distanceInMeters the actual distance in meters.
     * @param realTime boolean flag for navigation vs. list view.
     * @param locale Locale that defines the number format for displaying distance.
     * @return distance string formatted according to the rules of the formatter.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(int distanceInMeters, boolean realTime, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    /**
     * Format distance for display using specified locale and units.
     *
     * @param distanceInMeters the actual distance in meters.
     * @param realTime boolean flag for navigation vs. list view.
     * @param locale Locale that defines the number format for displaying distance.
     * @param units miles or kilometers.
     * @return distance string formatted according to the rules of the formatter.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(int distanceInMeters, boolean realTime, @org.jetbrains.annotations.Nullable()
    java.util.Locale locale, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.utils.DistanceFormatter.DistanceUnits units) {
        return null;
    }
    
    private final java.lang.String formatMiles(int distanceInMeters, boolean realTime) {
        return null;
    }
    
    private final java.lang.String formatKilometers(int distanceInMeters, boolean realTime) {
        return null;
    }
    
    private final boolean useMiles(java.util.Locale locale) {
        return false;
    }
    
    private final java.lang.String formatDistanceOverTenMeters(int distanceInMeters) {
        return null;
    }
    
    private final java.lang.String formatShortMeters(int distanceInMeters, boolean realTime) {
        return null;
    }
    
    private final java.lang.String formatDistanceInKilometers(int distanceInMeters) {
        return null;
    }
    
    private final java.lang.String formatDistanceLessThanTenFeet(double distanceInFeet, boolean realTime) {
        return null;
    }
    
    private final java.lang.String formatDistanceOverTenFeet(double distanceInFeet) {
        return null;
    }
    
    private final java.lang.String formatDistanceInMiles(int distanceInMeters) {
        return null;
    }
    
    private final int roundDownToNearestTen(double distance) {
        return 0;
    }
    
    private DistanceFormatter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/DistanceFormatter$DistanceUnits;", "", "(Ljava/lang/String;I)V", "MILES", "KILOMETERS", "common_release"})
    public static enum DistanceUnits {
        /*public static final*/ MILES /* = new MILES() */,
        /*public static final*/ KILOMETERS /* = new KILOMETERS() */;
        
        DistanceUnits() {
        }
    }
}