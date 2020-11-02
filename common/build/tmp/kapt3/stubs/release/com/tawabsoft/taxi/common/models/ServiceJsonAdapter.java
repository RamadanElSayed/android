package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010-\u001a\u00020\u001cH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/tawabsoft/taxi/common/models/ServiceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/tawabsoft/taxi/common/models/Service;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "bookingModeAdapter", "Lcom/tawabsoft/taxi/common/models/Service$BookingMode;", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "distanceFeeAdapter", "Lcom/tawabsoft/taxi/common/models/Service$DistanceFee;", "doubleAdapter", "", "feeEstimationModeAdapter", "Lcom/tawabsoft/taxi/common/models/Service$FeeEstimationMode;", "longAdapter", "", "nullableDoubleAdapter", "nullableIntAdapter", "", "nullableMediaAdapter", "Lcom/tawabsoft/taxi/common/models/Media;", "nullableServiceCategoryAdapter", "Lcom/tawabsoft/taxi/common/models/ServiceCategory;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "paymentMethodAdapter", "Lcom/tawabsoft/taxi/common/models/Service$PaymentMethod;", "paymentTimeAdapter", "Lcom/tawabsoft/taxi/common/models/Service$PaymentTime;", "quantityModeAdapter", "Lcom/tawabsoft/taxi/common/models/Service$QuantityMode;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "common_release"})
public final class ServiceJsonAdapter extends com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.ServiceCategory> nullableServiceCategoryAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Media> nullableMediaAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Double> doubleAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> nullableIntAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Long> longAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Double> nullableDoubleAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> booleanAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service.DistanceFee> distanceFeeAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service.FeeEstimationMode> feeEstimationModeAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service.PaymentMethod> paymentMethodAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service.PaymentTime> paymentTimeAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service.QuantityMode> quantityModeAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service.BookingMode> bookingModeAdapter = null;
    private volatile java.lang.reflect.Constructor<com.tawabsoft.taxi.common.models.Service> constructorRef;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.common.models.Service fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Service value) {
    }
    
    public ServiceJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}