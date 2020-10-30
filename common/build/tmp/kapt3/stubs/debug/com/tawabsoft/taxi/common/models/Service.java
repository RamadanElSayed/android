package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0006fghijkB\u00c1\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u00a2\u0006\u0002\u0010$J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010M\u001a\u00020\tH\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010O\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\t\u0010P\u001a\u00020\u0017H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0019H\u00c6\u0003J\t\u0010R\u001a\u00020\u001bH\u00c6\u0003J\t\u0010S\u001a\u00020\u001dH\u00c6\u0003J\t\u0010T\u001a\u00020\u001fH\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020!H\u00c6\u0003J\t\u0010W\u001a\u00020#H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010Y\u001a\u00020\tH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010[\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0010\u0010]\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\t\u0010^\u001a\u00020\tH\u00c6\u0003J\u00f2\u0001\u0010_\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#H\u00c6\u0001\u00a2\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020\u00172\b\u0010b\u001a\u0004\u0018\u00010cH\u00d6\u0003J\t\u0010d\u001a\u00020\rH\u00d6\u0001J\t\u0010e\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b9\u0010/R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bF\u0010DR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010&\u00a8\u0006l"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service;", "Ljava/io/Serializable;", "serviceCategory", "Lcom/tawabsoft/taxi/common/models/ServiceCategory;", "media", "Lcom/tawabsoft/taxi/common/models/Media;", "availableTimeFrom", "", "perHundredMeters", "", "availableTimeTo", "perMinuteDrive", "rangeMinusPercent", "", "rangePlusPercent", "baseFare", "id", "", "title", "perMinuteWait", "minimumFee", "cost", "canEnableVerificationCode", "", "distanceFeeMode", "Lcom/tawabsoft/taxi/common/models/Service$DistanceFee;", "feeEstimationMode", "Lcom/tawabsoft/taxi/common/models/Service$FeeEstimationMode;", "paymentMethod", "Lcom/tawabsoft/taxi/common/models/Service$PaymentMethod;", "paymentTime", "Lcom/tawabsoft/taxi/common/models/Service$PaymentTime;", "quantityMode", "Lcom/tawabsoft/taxi/common/models/Service$QuantityMode;", "bookingMode", "Lcom/tawabsoft/taxi/common/models/Service$BookingMode;", "(Lcom/tawabsoft/taxi/common/models/ServiceCategory;Lcom/tawabsoft/taxi/common/models/Media;Ljava/lang/String;DLjava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;DJLjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;ZLcom/tawabsoft/taxi/common/models/Service$DistanceFee;Lcom/tawabsoft/taxi/common/models/Service$FeeEstimationMode;Lcom/tawabsoft/taxi/common/models/Service$PaymentMethod;Lcom/tawabsoft/taxi/common/models/Service$PaymentTime;Lcom/tawabsoft/taxi/common/models/Service$QuantityMode;Lcom/tawabsoft/taxi/common/models/Service$BookingMode;)V", "getAvailableTimeFrom", "()Ljava/lang/String;", "getAvailableTimeTo", "getBaseFare", "()D", "getBookingMode", "()Lcom/tawabsoft/taxi/common/models/Service$BookingMode;", "getCanEnableVerificationCode", "()Z", "getCost", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDistanceFeeMode", "()Lcom/tawabsoft/taxi/common/models/Service$DistanceFee;", "getFeeEstimationMode", "()Lcom/tawabsoft/taxi/common/models/Service$FeeEstimationMode;", "getId", "()J", "getMedia", "()Lcom/tawabsoft/taxi/common/models/Media;", "getMinimumFee", "getPaymentMethod", "()Lcom/tawabsoft/taxi/common/models/Service$PaymentMethod;", "getPaymentTime", "()Lcom/tawabsoft/taxi/common/models/Service$PaymentTime;", "getPerHundredMeters", "getPerMinuteDrive", "getPerMinuteWait", "getQuantityMode", "()Lcom/tawabsoft/taxi/common/models/Service$QuantityMode;", "getRangeMinusPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRangePlusPercent", "getServiceCategory", "()Lcom/tawabsoft/taxi/common/models/ServiceCategory;", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/tawabsoft/taxi/common/models/ServiceCategory;Lcom/tawabsoft/taxi/common/models/Media;Ljava/lang/String;DLjava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;DJLjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;ZLcom/tawabsoft/taxi/common/models/Service$DistanceFee;Lcom/tawabsoft/taxi/common/models/Service$FeeEstimationMode;Lcom/tawabsoft/taxi/common/models/Service$PaymentMethod;Lcom/tawabsoft/taxi/common/models/Service$PaymentTime;Lcom/tawabsoft/taxi/common/models/Service$QuantityMode;Lcom/tawabsoft/taxi/common/models/Service$BookingMode;)Lcom/tawabsoft/taxi/common/models/Service;", "equals", "other", "", "hashCode", "toString", "BookingMode", "DistanceFee", "FeeEstimationMode", "PaymentMethod", "PaymentTime", "QuantityMode", "common_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Service implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private final com.tawabsoft.taxi.common.models.ServiceCategory serviceCategory = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tawabsoft.taxi.common.models.Media media = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String availableTimeFrom = null;
    private final double perHundredMeters = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String availableTimeTo = null;
    private final double perMinuteDrive = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rangeMinusPercent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rangePlusPercent = null;
    private final double baseFare = 0.0;
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    private final double perMinuteWait = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double minimumFee = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double cost = null;
    private final boolean canEnableVerificationCode = false;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.models.Service.DistanceFee distanceFeeMode = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.models.Service.FeeEstimationMode feeEstimationMode = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.models.Service.PaymentMethod paymentMethod = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.models.Service.PaymentTime paymentTime = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.models.Service.QuantityMode quantityMode = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tawabsoft.taxi.common.models.Service.BookingMode bookingMode = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.ServiceCategory getServiceCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailableTimeFrom() {
        return null;
    }
    
    public final double getPerHundredMeters() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailableTimeTo() {
        return null;
    }
    
    public final double getPerMinuteDrive() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRangeMinusPercent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRangePlusPercent() {
        return null;
    }
    
    public final double getBaseFare() {
        return 0.0;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final double getPerMinuteWait() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMinimumFee() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCost() {
        return null;
    }
    
    public final boolean getCanEnableVerificationCode() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.DistanceFee getDistanceFeeMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.FeeEstimationMode getFeeEstimationMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.PaymentMethod getPaymentMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.PaymentTime getPaymentTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.QuantityMode getQuantityMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.BookingMode getBookingMode() {
        return null;
    }
    
    public Service(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.ServiceCategory serviceCategory, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media media, @org.jetbrains.annotations.Nullable()
    java.lang.String availableTimeFrom, double perHundredMeters, @org.jetbrains.annotations.Nullable()
    java.lang.String availableTimeTo, double perMinuteDrive, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangeMinusPercent, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangePlusPercent, double baseFare, long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, double perMinuteWait, @org.jetbrains.annotations.Nullable()
    java.lang.Double minimumFee, @org.jetbrains.annotations.Nullable()
    java.lang.Double cost, boolean canEnableVerificationCode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.DistanceFee distanceFeeMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.FeeEstimationMode feeEstimationMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.PaymentMethod paymentMethod, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.PaymentTime paymentTime, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.QuantityMode quantityMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.BookingMode bookingMode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.ServiceCategory component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.DistanceFee component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.FeeEstimationMode component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.PaymentMethod component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.PaymentTime component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.QuantityMode component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service.BookingMode component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Service copy(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.ServiceCategory serviceCategory, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media media, @org.jetbrains.annotations.Nullable()
    java.lang.String availableTimeFrom, double perHundredMeters, @org.jetbrains.annotations.Nullable()
    java.lang.String availableTimeTo, double perMinuteDrive, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangeMinusPercent, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangePlusPercent, double baseFare, long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, double perMinuteWait, @org.jetbrains.annotations.Nullable()
    java.lang.Double minimumFee, @org.jetbrains.annotations.Nullable()
    java.lang.Double cost, boolean canEnableVerificationCode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.DistanceFee distanceFeeMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.FeeEstimationMode feeEstimationMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.PaymentMethod paymentMethod, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.PaymentTime paymentTime, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.QuantityMode quantityMode, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service.BookingMode bookingMode) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service$DistanceFee;", "", "(Ljava/lang/String;I)V", "None", "PickupToDestination", "common_debug"})
    public static enum DistanceFee {
        /*public static final*/ None /* = new None() */,
        /*public static final*/ PickupToDestination /* = new PickupToDestination() */;
        
        DistanceFee() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service$FeeEstimationMode;", "", "(Ljava/lang/String;I)V", "Static", "Dynamic", "Ranged", "RangedStrict", "Disabled", "common_debug"})
    public static enum FeeEstimationMode {
        /*public static final*/ Static /* = new Static() */,
        /*public static final*/ Dynamic /* = new Dynamic() */,
        /*public static final*/ Ranged /* = new Ranged() */,
        /*public static final*/ RangedStrict /* = new RangedStrict() */,
        /*public static final*/ Disabled /* = new Disabled() */;
        
        FeeEstimationMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service$PaymentMethod;", "", "(Ljava/lang/String;I)V", "CashCredit", "OnlyCredit", "OnlyCash", "common_debug"})
    public static enum PaymentMethod {
        /*public static final*/ CashCredit /* = new CashCredit() */,
        /*public static final*/ OnlyCredit /* = new OnlyCredit() */,
        /*public static final*/ OnlyCash /* = new OnlyCash() */;
        
        PaymentMethod() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service$PaymentTime;", "", "(Ljava/lang/String;I)V", "PrePay", "PostPay", "common_debug"})
    public static enum PaymentTime {
        /*public static final*/ PrePay /* = new PrePay() */,
        /*public static final*/ PostPay /* = new PostPay() */;
        
        PaymentTime() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service$QuantityMode;", "", "(Ljava/lang/String;I)V", "Singular", "Multiple", "common_debug"})
    public static enum QuantityMode {
        /*public static final*/ Singular /* = new Singular() */,
        /*public static final*/ Multiple /* = new Multiple() */;
        
        QuantityMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Service$BookingMode;", "", "(Ljava/lang/String;I)V", "OnlyNow", "Time", "DateTime", "DateTimeAbosoluteHour", "common_debug"})
    public static enum BookingMode {
        /*public static final*/ OnlyNow /* = new OnlyNow() */,
        /*public static final*/ Time /* = new Time() */,
        /*public static final*/ DateTime /* = new DateTime() */,
        /*public static final*/ DateTimeAbosoluteHour /* = new DateTimeAbosoluteHour() */;
        
        BookingMode() {
        }
    }
}