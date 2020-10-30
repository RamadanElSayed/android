package com.tawabsoft.taxi.rider.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J8\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\bH\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/tawabsoft/taxi/rider/models/RequestDTO;", "", "locations", "", "Lcom/tawabsoft/taxi/rider/models/LocationWithName;", "services", "Lcom/tawabsoft/taxi/rider/models/OrderedService;", "intervalMinutes", "", "([Lcom/tawabsoft/taxi/rider/models/LocationWithName;[Lcom/tawabsoft/taxi/rider/models/OrderedService;I)V", "getIntervalMinutes", "()I", "setIntervalMinutes", "(I)V", "getLocations", "()[Lcom/tawabsoft/taxi/rider/models/LocationWithName;", "setLocations", "([Lcom/tawabsoft/taxi/rider/models/LocationWithName;)V", "[Lcom/tawabsoft/taxi/rider/models/LocationWithName;", "getServices", "()[Lcom/tawabsoft/taxi/rider/models/OrderedService;", "setServices", "([Lcom/tawabsoft/taxi/rider/models/OrderedService;)V", "[Lcom/tawabsoft/taxi/rider/models/OrderedService;", "component1", "component2", "component3", "copy", "([Lcom/tawabsoft/taxi/rider/models/LocationWithName;[Lcom/tawabsoft/taxi/rider/models/OrderedService;I)Lcom/tawabsoft/taxi/rider/models/RequestDTO;", "equals", "", "other", "hashCode", "toString", "", "rider_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class RequestDTO {
    @org.jetbrains.annotations.NotNull()
    private com.tawabsoft.taxi.rider.models.LocationWithName[] locations;
    @org.jetbrains.annotations.NotNull()
    private com.tawabsoft.taxi.rider.models.OrderedService[] services;
    private int intervalMinutes;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.models.LocationWithName[] getLocations() {
        return null;
    }
    
    public final void setLocations(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.models.LocationWithName[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.models.OrderedService[] getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.models.OrderedService[] p0) {
    }
    
    public final int getIntervalMinutes() {
        return 0;
    }
    
    public final void setIntervalMinutes(int p0) {
    }
    
    public RequestDTO(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.models.LocationWithName[] locations, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.models.OrderedService[] services, int intervalMinutes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.models.LocationWithName[] component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.models.OrderedService[] component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.models.RequestDTO copy(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.models.LocationWithName[] locations, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.rider.models.OrderedService[] services, int intervalMinutes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}