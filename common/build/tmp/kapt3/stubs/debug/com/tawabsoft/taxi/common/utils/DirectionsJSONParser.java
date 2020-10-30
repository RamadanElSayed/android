package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00130\u000b0\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/DirectionsJSONParser;", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "origin", "Lcom/google/android/gms/maps/model/LatLng;", "destination", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V", "line", "Lcom/google/android/gms/maps/model/Polyline;", "decodePoly", "", "encoded", "", "downloadUrl", "strUrl", "getDirectionsUrl", "dest", "parse", "Ljava/util/HashMap;", "jObject", "Lorg/json/JSONObject;", "removeLine", "", "run", "DownloadTask", "ParserTask", "common_debug"})
public final class DirectionsJSONParser {
    private com.google.android.gms.maps.model.Polyline line;
    private final com.google.android.gms.maps.GoogleMap googleMap = null;
    private final com.google.android.gms.maps.model.LatLng origin = null;
    private final com.google.android.gms.maps.model.LatLng destination = null;
    
    public final void run() {
    }
    
    public final void removeLine() {
    }
    
    private final java.util.List<java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>> parse(org.json.JSONObject jObject) {
        return null;
    }
    
    private final java.util.List<com.google.android.gms.maps.model.LatLng> decodePoly(java.lang.String encoded) {
        return null;
    }
    
    private final java.lang.String getDirectionsUrl(com.google.android.gms.maps.model.LatLng origin, com.google.android.gms.maps.model.LatLng dest) {
        return null;
    }
    
    private final java.lang.String downloadUrl(java.lang.String strUrl) throws java.io.IOException {
        return null;
    }
    
    public DirectionsJSONParser(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng origin, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng destination) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014\u00a8\u0006\f"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/DirectionsJSONParser$DownloadTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "(Lcom/tawabsoft/taxi/common/utils/DirectionsJSONParser;)V", "doInBackground", "url", "", "([Ljava/lang/String;)Ljava/lang/String;", "onPostExecute", "", "result", "common_debug"})
    final class DownloadTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... url) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.lang.String result) {
        }
        
        public DownloadTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002,\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J;\u0010\u0007\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u00020\f2 \u0010\r\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/DirectionsJSONParser$ParserTask;", "Landroid/os/AsyncTask;", "", "", "", "Ljava/util/HashMap;", "(Lcom/tawabsoft/taxi/common/utils/DirectionsJSONParser;)V", "doInBackground", "jsonData", "", "([Ljava/lang/String;)Ljava/util/List;", "onPostExecute", "", "result", "common_debug"})
    final class ParserTask extends android.os.AsyncTask<java.lang.String, java.lang.Integer, java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>>> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... jsonData) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>> result) {
        }
        
        public ParserTask() {
            super();
        }
    }
}