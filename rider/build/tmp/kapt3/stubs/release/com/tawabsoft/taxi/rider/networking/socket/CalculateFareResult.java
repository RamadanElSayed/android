package com.tawabsoft.taxi.rider.networking.socket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/tawabsoft/taxi/rider/networking/socket/CalculateFareResult;", "", "categories", "", "Lcom/tawabsoft/taxi/common/models/ServiceCategory;", "distance", "", "duration", "currency", "", "(Ljava/util/List;IILjava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getDistance", "()I", "getDuration", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "rider_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CalculateFareResult {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> categories = null;
    private final int distance = 0;
    private final int duration = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> getCategories() {
        return null;
    }
    
    public final int getDistance() {
        return 0;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public CalculateFareResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> categories, int distance, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.rider.networking.socket.CalculateFareResult copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tawabsoft.taxi.common.models.ServiceCategory> categories, int distance, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
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