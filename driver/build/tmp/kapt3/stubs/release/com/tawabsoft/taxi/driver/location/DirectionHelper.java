package com.tawabsoft.taxi.driver.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 e2\u00020\u0001:\u0004efghB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004Jh\u0010/\u001a\u0002002\u0006\u0010\u001e\u001a\u00020\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u00102\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u000106J\u0006\u00107\u001a\u000200J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016H\u0002J\u001c\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020CJ\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010B\u001a\u00020CJ\u001b\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0F2\u0006\u0010B\u001a\u00020C\u00a2\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020I2\u0006\u0010B\u001a\u00020CJ\u001b\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0F2\u0006\u0010B\u001a\u00020C\u00a2\u0006\u0002\u0010GJ\u000e\u0010K\u001a\u00020I2\u0006\u0010B\u001a\u00020CJ\u000e\u0010L\u001a\u00020:2\u0006\u0010B\u001a\u00020CJ\u001e\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010N\u001a\u00020\u00162\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020:H\u0002J\u001e\u0010R\u001a\u0002062\u0006\u0010B\u001a\u00020C2\u0006\u0010S\u001a\u00020\u00162\u0006\u0010T\u001a\u00020\u0016J\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010B\u001a\u00020CJ\u000e\u0010V\u001a\u00020:2\u0006\u0010B\u001a\u00020CJ\u000e\u0010W\u001a\u00020:2\u0006\u0010B\u001a\u00020CJ\u000e\u0010X\u001a\u00020:2\u0006\u0010B\u001a\u00020CJ\u000e\u0010Y\u001a\u00020\u00162\u0006\u0010B\u001a\u00020CJ\u000e\u0010Z\u001a\u00020:2\u0006\u0010B\u001a\u00020CJ\u000e\u0010[\u001a\u00020\u00162\u0006\u0010B\u001a\u00020CJ\u001e\u0010\\\u001a\u00020:2\u0006\u0010]\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020:J\u000e\u0010_\u001a\u0002002\u0006\u00102\u001a\u00020\u0016J\u000e\u0010`\u001a\u0002002\u0006\u0010a\u001a\u00020\u0019J\u0010\u0010b\u001a\u0002002\b\u0010c\u001a\u0004\u0018\u00010&J\u0010\u0010d\u001a\u0002002\b\u0010c\u001a\u0004\u0018\u00010)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006i"}, d2 = {"Lcom/tawabsoft/taxi/driver/location/DirectionHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "animateCamera", "", "animateDistance", "<set-?>", "Lcom/google/android/gms/maps/model/Marker;", "animateMarker", "getAnimateMarker", "()Lcom/google/android/gms/maps/model/Marker;", "animateMarkerPosition", "Lcom/google/android/gms/maps/model/LatLng;", "Lcom/google/android/gms/maps/model/Polyline;", "animatePolyline", "getAnimatePolyline", "()Lcom/google/android/gms/maps/model/Polyline;", "animatePositionList", "Ljava/util/ArrayList;", "animateSpeed", "", "beginPosition", "cameraLock", "", "drawLine", "drawMarker", "endPosition", "flatMarker", "gm", "Lcom/google/android/gms/maps/GoogleMap;", "isAnimated", "()Z", "isCameraTilt", "isCameraZoom", "isLogging", "mAnimateListener", "Lcom/tawabsoft/taxi/driver/location/DirectionHelper$OnAnimateListener;", "mContext", "mDirectionListener", "Lcom/tawabsoft/taxi/driver/location/DirectionHelper$OnDirectionResponseListener;", "r", "Ljava/lang/Runnable;", "step", "totalAnimateDistance", "zoom", "animateDirection", "", "direction", "speed", "mo", "Lcom/google/android/gms/maps/model/MarkerOptions;", "po", "Lcom/google/android/gms/maps/model/PolylineOptions;", "cancelAnimated", "decodePoly", "encoded", "", "dpToPx", "dp", "getBearing", "", "begin", "end", "getCopyRights", "doc", "Lorg/w3c/dom/Document;", "getDirection", "getDistanceText", "", "(Lorg/w3c/dom/Document;)[Ljava/lang/String;", "getDistanceValue", "", "getDurationText", "getDurationValue", "getEndAddress", "getNewPosition", "getNodeIndex", "nl", "Lorg/w3c/dom/NodeList;", "nodename", "getPolyline", "width", "color", "getSection", "getStartAddress", "getStatus", "getTotalDistanceText", "getTotalDistanceValue", "getTotalDurationText", "getTotalDurationValue", "request", "start", "mode", "setCameraUpdateSpeed", "setLogging", "state", "setOnAnimateListener", "listener", "setOnDirectionResponseListener", "Companion", "OnAnimateListener", "OnDirectionResponseListener", "RequestTask", "driver_release"})
public final class DirectionHelper {
    private com.tawabsoft.taxi.driver.location.DirectionHelper.OnDirectionResponseListener mDirectionListener;
    private com.tawabsoft.taxi.driver.location.DirectionHelper.OnAnimateListener mAnimateListener;
    private boolean isLogging = false;
    private com.google.android.gms.maps.model.LatLng animateMarkerPosition;
    private com.google.android.gms.maps.model.LatLng beginPosition;
    private com.google.android.gms.maps.model.LatLng endPosition;
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> animatePositionList;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker animateMarker;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Polyline animatePolyline;
    private com.google.android.gms.maps.GoogleMap gm;
    private int step = -1;
    private int animateSpeed = -1;
    private int zoom = -1;
    private double animateDistance = -1.0;
    private double animateCamera = -1.0;
    private double totalAnimateDistance = 0.0;
    private boolean cameraLock = false;
    private boolean drawMarker = false;
    private boolean drawLine = false;
    private boolean flatMarker = false;
    private boolean isCameraTilt = false;
    private boolean isCameraZoom = false;
    private boolean isAnimated = false;
    private android.content.Context mContext;
    private final java.lang.Runnable r = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE_DRIVING = "driving";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE_WALKING = "walking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE_BICYCLING = "bicycling";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_OK = "OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_NOT_FOUND = "NOT_FOUND";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_ZERO_RESULTS = "ZERO_RESULTS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_MAX_WAYPOINTS_EXCEEDED = "MAX_WAYPOINTS_EXCEEDED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_INVALID_REQUEST = "INVALID_REQUEST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_REQUEST_DENIED = "REQUEST_DENIED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_UNKNOWN_ERROR = "UNKNOWN_ERROR";
    private static final int SPEED_VERY_FAST = 1;
    private static final int SPEED_FAST = 2;
    private static final int SPEED_NORMAL = 3;
    private static final int SPEED_SLOW = 4;
    private static final int SPEED_VERY_SLOW = 5;
    public static final com.tawabsoft.taxi.driver.location.DirectionHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getAnimateMarker() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Polyline getAnimatePolyline() {
        return null;
    }
    
    public final boolean isAnimated() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String request(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng start, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng end, @org.jetbrains.annotations.NotNull()
    java.lang.String mode) {
        return null;
    }
    
    public final void setLogging(boolean state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getDurationText(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getDurationValue(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalDurationText(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    public final int getTotalDurationValue(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getDistanceText(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getDistanceValue(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalDistanceText(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    public final int getTotalDistanceValue(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartAddress(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndAddress(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCopyRights(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getDirection(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getSection(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.PolylineOptions getPolyline(@org.jetbrains.annotations.NotNull()
    org.w3c.dom.Document doc, int width, int color) {
        return null;
    }
    
    private final int getNodeIndex(org.w3c.dom.NodeList nl, java.lang.String nodename) {
        return 0;
    }
    
    private final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> decodePoly(java.lang.String encoded) {
        return null;
    }
    
    private final int dpToPx(int dp) {
        return 0;
    }
    
    public final void setOnDirectionResponseListener(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.driver.location.DirectionHelper.OnDirectionResponseListener listener) {
    }
    
    public final void setOnAnimateListener(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.driver.location.DirectionHelper.OnAnimateListener listener) {
    }
    
    public final void animateDirection(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap gm, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> direction, int speed, boolean cameraLock, boolean isCameraTilt, boolean isCameraZoom, boolean drawMarker, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.MarkerOptions mo, boolean flatMarker, boolean drawLine, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.PolylineOptions po) {
    }
    
    public final void cancelAnimated() {
    }
    
    private final com.google.android.gms.maps.model.LatLng getNewPosition(com.google.android.gms.maps.model.LatLng begin, com.google.android.gms.maps.model.LatLng end) {
        return null;
    }
    
    private final float getBearing(com.google.android.gms.maps.model.LatLng begin, com.google.android.gms.maps.model.LatLng end) {
        return 0.0F;
    }
    
    public final void setCameraUpdateSpeed(int speed) {
    }
    
    public DirectionHelper(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/tawabsoft/taxi/driver/location/DirectionHelper$RequestTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Lorg/w3c/dom/Document;", "(Lcom/tawabsoft/taxi/driver/location/DirectionHelper;)V", "doInBackground", "uri", "", "([Ljava/lang/String;)Lorg/w3c/dom/Document;", "getStatus", "doc", "onPostExecute", "", "driver_release"})
    final class RequestTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, org.w3c.dom.Document> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected org.w3c.dom.Document doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... uri) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        org.w3c.dom.Document doc) {
        }
        
        private final java.lang.String getStatus(org.w3c.dom.Document doc) {
            return null;
        }
        
        public RequestTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/tawabsoft/taxi/driver/location/DirectionHelper$OnDirectionResponseListener;", "", "onResponse", "", "status", "", "doc", "Lorg/w3c/dom/Document;", "gd", "Lcom/tawabsoft/taxi/driver/location/DirectionHelper;", "driver_release"})
    public static abstract interface OnDirectionResponseListener {
        
        public abstract void onResponse(@org.jetbrains.annotations.Nullable()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        org.w3c.dom.Document doc, @org.jetbrains.annotations.Nullable()
        com.tawabsoft.taxi.driver.location.DirectionHelper gd);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/tawabsoft/taxi/driver/location/DirectionHelper$OnAnimateListener;", "", "onFinish", "", "onProgress", "progress", "", "total", "onStart", "driver_release"})
    public static abstract interface OnAnimateListener {
        
        public abstract void onFinish();
        
        public abstract void onStart();
        
        public abstract void onProgress(int progress, int total);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tawabsoft/taxi/driver/location/DirectionHelper$Companion;", "", "()V", "MODE_BICYCLING", "", "MODE_DRIVING", "MODE_WALKING", "SPEED_FAST", "", "SPEED_NORMAL", "SPEED_SLOW", "SPEED_VERY_FAST", "SPEED_VERY_SLOW", "STATUS_INVALID_REQUEST", "STATUS_MAX_WAYPOINTS_EXCEEDED", "STATUS_NOT_FOUND", "STATUS_OK", "STATUS_OVER_QUERY_LIMIT", "STATUS_REQUEST_DENIED", "STATUS_UNKNOWN_ERROR", "STATUS_ZERO_RESULTS", "driver_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}