package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0088\u0001B\u00ad\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010$J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011H\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010l\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010m\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010n\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010o\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010p\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u000b\u0010q\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010s\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u000b\u0010v\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010{\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u000b\u0010|\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010~\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u00c6\u0003J\u00b8\u0002\u0010\u0081\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0003\u0010\u0082\u0001J\u0016\u0010\u0083\u0001\u001a\u00030\u0084\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0086\u0001\u001a\u00020\rH\u00d6\u0001J\n\u0010\u0087\u0001\u001a\u00020\u000bH\u00d6\u0001R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010#\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b5\u0010/\"\u0004\b6\u00101R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bH\u0010>\"\u0004\bI\u0010@R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bJ\u0010>\"\u0004\bK\u0010@R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bL\u0010>\"\u0004\bM\u0010@R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bN\u0010>\"\u0004\bO\u0010@R\u001c\u0010 \u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u00108\"\u0004\bQ\u0010:R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b\u000f\u0010*\"\u0004\bR\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u00108\"\u0004\bT\u0010:R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bY\u0010>\"\u0004\bZ\u0010@R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bc\u0010>\"\u0004\bd\u0010@R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010h\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Request;", "", "driver", "Lcom/tawabsoft/taxi/common/models/Driver;", "rider", "Lcom/tawabsoft/taxi/common/models/Rider;", "cost", "", "startTimestamp", "", "log", "", "distanceBest", "", "rating", "isHidden", "addresses", "", "points", "Lcom/google/android/gms/maps/model/LatLng;", "finishTimestamp", "requestTimestamp", "etaPickup", "durationBest", "costBest", "costAfterCoupon", "currency", "durationReal", "distanceReal", "id", "status", "Lcom/tawabsoft/taxi/common/models/Request$Status;", "imageUrl", "service", "Lcom/tawabsoft/taxi/common/models/Service;", "confirmationCode", "(Lcom/tawabsoft/taxi/common/models/Driver;Lcom/tawabsoft/taxi/common/models/Rider;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/tawabsoft/taxi/common/models/Request$Status;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Service;Ljava/lang/Integer;)V", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "getConfirmationCode", "()Ljava/lang/Integer;", "setConfirmationCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCost", "()Ljava/lang/Double;", "setCost", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCostAfterCoupon", "setCostAfterCoupon", "getCostBest", "setCostBest", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDistanceBest", "setDistanceBest", "getDistanceReal", "()Ljava/lang/Long;", "setDistanceReal", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDriver", "()Lcom/tawabsoft/taxi/common/models/Driver;", "setDriver", "(Lcom/tawabsoft/taxi/common/models/Driver;)V", "getDurationBest", "setDurationBest", "getDurationReal", "setDurationReal", "getEtaPickup", "setEtaPickup", "getFinishTimestamp", "setFinishTimestamp", "getId", "setId", "getImageUrl", "setImageUrl", "setHidden", "getLog", "setLog", "getPoints", "setPoints", "getRating", "setRating", "getRequestTimestamp", "setRequestTimestamp", "getRider", "()Lcom/tawabsoft/taxi/common/models/Rider;", "setRider", "(Lcom/tawabsoft/taxi/common/models/Rider;)V", "getService", "()Lcom/tawabsoft/taxi/common/models/Service;", "setService", "(Lcom/tawabsoft/taxi/common/models/Service;)V", "getStartTimestamp", "setStartTimestamp", "getStatus", "()Lcom/tawabsoft/taxi/common/models/Request$Status;", "setStatus", "(Lcom/tawabsoft/taxi/common/models/Request$Status;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/tawabsoft/taxi/common/models/Driver;Lcom/tawabsoft/taxi/common/models/Rider;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/tawabsoft/taxi/common/models/Request$Status;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Service;Ljava/lang/Integer;)Lcom/tawabsoft/taxi/common/models/Request;", "equals", "", "other", "hashCode", "toString", "Status", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Request {
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Driver driver;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Rider rider;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cost;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long startTimestamp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String log;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer distanceBest;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer rating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer isHidden;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> addresses;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.google.android.gms.maps.model.LatLng> points;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long finishTimestamp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long requestTimestamp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long etaPickup;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer durationBest;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double costBest;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double costAfterCoupon;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long durationReal;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long distanceReal;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Request.Status status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageUrl;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Service service;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer confirmationCode;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Driver getDriver() {
        return null;
    }
    
    public final void setDriver(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Rider getRider() {
        return null;
    }
    
    public final void setRider(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Rider p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCost() {
        return null;
    }
    
    public final void setCost(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getStartTimestamp() {
        return null;
    }
    
    public final void setStartTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLog() {
        return null;
    }
    
    public final void setLog(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDistanceBest() {
        return null;
    }
    
    public final void setDistanceBest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isHidden() {
        return null;
    }
    
    public final void setHidden(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAddresses() {
        return null;
    }
    
    public final void setAddresses(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        return null;
    }
    
    public final void setPoints(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFinishTimestamp() {
        return null;
    }
    
    public final void setFinishTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getRequestTimestamp() {
        return null;
    }
    
    public final void setRequestTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEtaPickup() {
        return null;
    }
    
    public final void setEtaPickup(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDurationBest() {
        return null;
    }
    
    public final void setDurationBest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCostBest() {
        return null;
    }
    
    public final void setCostBest(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCostAfterCoupon() {
        return null;
    }
    
    public final void setCostAfterCoupon(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDurationReal() {
        return null;
    }
    
    public final void setDurationReal(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDistanceReal() {
        return null;
    }
    
    public final void setDistanceReal(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Request.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Request.Status p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Service getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Service p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getConfirmationCode() {
        return null;
    }
    
    public final void setConfirmationCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public Request(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver driver, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Rider rider, @org.jetbrains.annotations.Nullable()
    java.lang.Double cost, @org.jetbrains.annotations.Nullable()
    java.lang.Long startTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String log, @org.jetbrains.annotations.Nullable()
    java.lang.Integer distanceBest, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isHidden, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.gms.maps.model.LatLng> points, @org.jetbrains.annotations.Nullable()
    java.lang.Long finishTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long requestTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long etaPickup, @org.jetbrains.annotations.Nullable()
    java.lang.Integer durationBest, @org.jetbrains.annotations.Nullable()
    java.lang.Double costBest, @org.jetbrains.annotations.Nullable()
    java.lang.Double costAfterCoupon, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.Long durationReal, @org.jetbrains.annotations.Nullable()
    java.lang.Long distanceReal, @org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Request.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Service service, @org.jetbrains.annotations.Nullable()
    java.lang.Integer confirmationCode) {
        super();
    }
    
    public Request() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Driver component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Rider component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.gms.maps.model.LatLng> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Request.Status component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Service component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Request copy(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver driver, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Rider rider, @org.jetbrains.annotations.Nullable()
    java.lang.Double cost, @org.jetbrains.annotations.Nullable()
    java.lang.Long startTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String log, @org.jetbrains.annotations.Nullable()
    java.lang.Integer distanceBest, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isHidden, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.gms.maps.model.LatLng> points, @org.jetbrains.annotations.Nullable()
    java.lang.Long finishTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long requestTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long etaPickup, @org.jetbrains.annotations.Nullable()
    java.lang.Integer durationBest, @org.jetbrains.annotations.Nullable()
    java.lang.Double costBest, @org.jetbrains.annotations.Nullable()
    java.lang.Double costAfterCoupon, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.Long durationReal, @org.jetbrains.annotations.Nullable()
    java.lang.Long distanceReal, @org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Request.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Service service, @org.jetbrains.annotations.Nullable()
    java.lang.Integer confirmationCode) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Request$Status;", "", "(Ljava/lang/String;I)V", "localizedDescription", "", "getLocalizedDescription", "()I", "Requested", "NotFound", "NoCloseFound", "Found", "DriverAccepted", "Arrived", "WaitingForPrePay", "RiderCanceled", "DriverCanceled", "WaitingForPostPay", "WaitingForReview", "Started", "Booked", "Expired", "Finished", "common_release"})
    public static enum Status {
        @com.squareup.moshi.Json(name = "Requested")
        /*public static final*/ Requested /* = new Requested() */,
        @com.squareup.moshi.Json(name = "NotFound")
        /*public static final*/ NotFound /* = new NotFound() */,
        @com.squareup.moshi.Json(name = "NoCloseFound")
        /*public static final*/ NoCloseFound /* = new NoCloseFound() */,
        @com.squareup.moshi.Json(name = "Found")
        /*public static final*/ Found /* = new Found() */,
        @com.squareup.moshi.Json(name = "DriverAccepted")
        /*public static final*/ DriverAccepted /* = new DriverAccepted() */,
        @com.squareup.moshi.Json(name = "Arrived")
        /*public static final*/ Arrived /* = new Arrived() */,
        @com.squareup.moshi.Json(name = "WaitingForPrePay")
        /*public static final*/ WaitingForPrePay /* = new WaitingForPrePay() */,
        @com.squareup.moshi.Json(name = "RiderCanceled")
        /*public static final*/ RiderCanceled /* = new RiderCanceled() */,
        @com.squareup.moshi.Json(name = "DriverCanceled")
        /*public static final*/ DriverCanceled /* = new DriverCanceled() */,
        @com.squareup.moshi.Json(name = "WaitingForPostPay")
        /*public static final*/ WaitingForPostPay /* = new WaitingForPostPay() */,
        @com.squareup.moshi.Json(name = "WaitingForReview")
        /*public static final*/ WaitingForReview /* = new WaitingForReview() */,
        @com.squareup.moshi.Json(name = "Started")
        /*public static final*/ Started /* = new Started() */,
        @com.squareup.moshi.Json(name = "Booked")
        /*public static final*/ Booked /* = new Booked() */,
        @com.squareup.moshi.Json(name = "Expired")
        /*public static final*/ Expired /* = new Expired() */,
        @com.squareup.moshi.Json(name = "Finished")
        /*public static final*/ Finished /* = new Finished() */;
        
        public final int getLocalizedDescription() {
            return 0;
        }
        
        Status() {
        }
    }
}