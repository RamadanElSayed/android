package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010&\u001a\u00020\u001bH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/tawabsoft/taxi/common/models/DriverJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/tawabsoft/taxi/common/models/Driver;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableCarAdapter", "Lcom/tawabsoft/taxi/common/models/Car;", "nullableGenderAdapter", "Lcom/tawabsoft/taxi/common/models/Gender;", "nullableIntAdapter", "", "nullableListOfMediaAdapter", "", "Lcom/tawabsoft/taxi/common/models/Media;", "nullableListOfServiceAdapter", "Lcom/tawabsoft/taxi/common/models/Service;", "nullableListOfWalletItemAdapter", "Lcom/tawabsoft/taxi/common/models/WalletItem;", "nullableLongAdapter", "", "nullableMediaAdapter", "nullableStatusAdapter", "Lcom/tawabsoft/taxi/common/models/Driver$Status;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "common_release"})
public final class DriverJsonAdapter extends com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Driver> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Media> nullableMediaAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Gender> nullableGenderAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> nullableIntAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Long> nullableLongAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Car> nullableCarAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Driver.Status> nullableStatusAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.tawabsoft.taxi.common.models.WalletItem>> nullableListOfWalletItemAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.tawabsoft.taxi.common.models.Media>> nullableListOfMediaAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.tawabsoft.taxi.common.models.Service>> nullableListOfServiceAdapter = null;
    private volatile java.lang.reflect.Constructor<com.tawabsoft.taxi.common.models.Driver> constructorRef;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.common.models.Driver fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver value) {
    }
    
    public DriverJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}