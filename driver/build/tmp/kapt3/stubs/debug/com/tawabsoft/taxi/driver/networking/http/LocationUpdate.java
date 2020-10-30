package com.tawabsoft.taxi.driver.networking.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/tawabsoft/taxi/driver/networking/http/LocationUpdate;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPRequest;", "jwtToken", "", "location", "Lcom/google/android/gms/maps/model/LatLng;", "inTravel", "", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Z)V", "path", "getPath", "()Ljava/lang/String;", "driver_debug"})
public final class LocationUpdate extends com.tawabsoft.taxi.common.networking.http.interfaces.HTTPRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = "driver/update_location";
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPath() {
        return null;
    }
    
    public LocationUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String jwtToken, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng location, boolean inTravel) {
        super();
    }
}