package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u007fB\u00af\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001f\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001f\u00a2\u0006\u0002\u0010$J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010SJ\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0010\u0010e\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u000b\u0010f\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u00c6\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001fH\u00c6\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00c0\u0002\u0010u\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001fH\u00c6\u0001\u00a2\u0006\u0002\u0010vJ\u0013\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010zH\u00d6\u0003J\n\u0010{\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010J\u001a\u00020\u0003H\u0016J\b\u0010|\u001a\u00020\u0003H\u0016J\t\u0010}\u001a\u00020\u000fH\u00d6\u0001J\t\u0010~\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010&\"\u0004\bC\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010&\"\u0004\bE\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010&\"\u0004\bN\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00106\"\u0004\bP\u00108R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bQ\u0010KR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010@\"\u0004\bV\u0010WR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010@\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Driver;", "Lcom/stfalcon/chatkit/commons/models/IUser;", "accountNumber", "", "bankName", "bankRoutingNumber", "bankSwift", "media", "Lcom/tawabsoft/taxi/common/models/Media;", "carMedia", "carPlate", "address", "gender", "Lcom/tawabsoft/taxi/common/models/Gender;", "rating", "", "firstName", "lastName", "carColor", "certificateNumber", "carProductionYear", "id", "", "mobileNumber", "car", "Lcom/tawabsoft/taxi/common/models/Car;", "email", "status", "Lcom/tawabsoft/taxi/common/models/Driver$Status;", "documentsNote", "wallet", "", "Lcom/tawabsoft/taxi/common/models/WalletItem;", "documents", "services", "Lcom/tawabsoft/taxi/common/models/Service;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Media;Lcom/tawabsoft/taxi/common/models/Media;Ljava/lang/String;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Gender;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/tawabsoft/taxi/common/models/Car;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Driver$Status;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getAddress", "setAddress", "getBankName", "setBankName", "getBankRoutingNumber", "setBankRoutingNumber", "getBankSwift", "setBankSwift", "getCar", "()Lcom/tawabsoft/taxi/common/models/Car;", "getCarColor", "setCarColor", "getCarMedia", "()Lcom/tawabsoft/taxi/common/models/Media;", "setCarMedia", "(Lcom/tawabsoft/taxi/common/models/Media;)V", "getCarPlate", "setCarPlate", "getCarProductionYear", "setCarProductionYear", "getCertificateNumber", "setCertificateNumber", "getDocuments", "()Ljava/util/List;", "getDocumentsNote", "getEmail", "setEmail", "getFirstName", "setFirstName", "getGender", "()Lcom/tawabsoft/taxi/common/models/Gender;", "setGender", "(Lcom/tawabsoft/taxi/common/models/Gender;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastName", "setLastName", "getMedia", "setMedia", "getMobileNumber", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServices", "setServices", "(Ljava/util/List;)V", "getStatus", "()Lcom/tawabsoft/taxi/common/models/Driver$Status;", "setStatus", "(Lcom/tawabsoft/taxi/common/models/Driver$Status;)V", "getWallet", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Media;Lcom/tawabsoft/taxi/common/models/Media;Ljava/lang/String;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Gender;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/tawabsoft/taxi/common/models/Car;Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Driver$Status;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/tawabsoft/taxi/common/models/Driver;", "equals", "", "other", "", "getAvatar", "getName", "hashCode", "toString", "Status", "common_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Driver implements com.stfalcon.chatkit.commons.models.IUser {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String accountNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bankName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bankRoutingNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bankSwift;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Media media;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Media carMedia;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String carPlate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Gender gender;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rating = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String carColor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String certificateNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String carProductionYear;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long mobileNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tawabsoft.taxi.common.models.Car car = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Driver.Status status;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String documentsNote = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.tawabsoft.taxi.common.models.WalletItem> wallet = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.tawabsoft.taxi.common.models.Media> documents = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.tawabsoft.taxi.common.models.Service> services;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountNumber() {
        return null;
    }
    
    public final void setAccountNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBankName() {
        return null;
    }
    
    public final void setBankName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBankRoutingNumber() {
        return null;
    }
    
    public final void setBankRoutingNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBankSwift() {
        return null;
    }
    
    public final void setBankSwift(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media getCarMedia() {
        return null;
    }
    
    public final void setCarMedia(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarPlate() {
        return null;
    }
    
    public final void setCarPlate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Gender getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Gender p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarColor() {
        return null;
    }
    
    public final void setCarColor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCertificateNumber() {
        return null;
    }
    
    public final void setCertificateNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarProductionYear() {
        return null;
    }
    
    public final void setCarProductionYear(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMobileNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Car getCar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Driver.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver.Status p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDocumentsNote() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.WalletItem> getWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.Media> getDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.Service> getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Service> p0) {
    }
    
    public Driver(@org.jetbrains.annotations.Nullable()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String bankName, @org.jetbrains.annotations.Nullable()
    java.lang.String bankRoutingNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String bankSwift, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media media, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media carMedia, @org.jetbrains.annotations.Nullable()
    java.lang.String carPlate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Gender gender, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String carColor, @org.jetbrains.annotations.Nullable()
    java.lang.String certificateNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String carProductionYear, @org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long mobileNumber, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Car car, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String documentsNote, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.WalletItem> wallet, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Media> documents, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Service> services) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Gender component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Car component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Driver.Status component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.WalletItem> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.Media> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.Service> component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Driver copy(@org.jetbrains.annotations.Nullable()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String bankName, @org.jetbrains.annotations.Nullable()
    java.lang.String bankRoutingNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String bankSwift, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media media, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media carMedia, @org.jetbrains.annotations.Nullable()
    java.lang.String carPlate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Gender gender, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String carColor, @org.jetbrains.annotations.Nullable()
    java.lang.String certificateNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String carProductionYear, @org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long mobileNumber, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Car car, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Driver.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String documentsNote, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.WalletItem> wallet, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Media> documents, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Service> services) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Driver$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Offline", "Online", "InService", "Blocked", "PendingApproval", "WaitingDocuments", "SoftReject", "HardReject", "Companion", "common_debug"})
    public static enum Status {
        @com.squareup.moshi.Json(name = "offline")
        /*public static final*/ Offline /* = new Offline(null) */,
        @com.squareup.moshi.Json(name = "online")
        /*public static final*/ Online /* = new Online(null) */,
        @com.squareup.moshi.Json(name = "in service")
        /*public static final*/ InService /* = new InService(null) */,
        @com.squareup.moshi.Json(name = "blocked")
        /*public static final*/ Blocked /* = new Blocked(null) */,
        @com.squareup.moshi.Json(name = "pending approval")
        /*public static final*/ PendingApproval /* = new PendingApproval(null) */,
        @com.squareup.moshi.Json(name = "waiting documents")
        /*public static final*/ WaitingDocuments /* = new WaitingDocuments(null) */,
        @com.squareup.moshi.Json(name = "soft reject")
        /*public static final*/ SoftReject /* = new SoftReject(null) */,
        @com.squareup.moshi.Json(name = "hard reject")
        /*public static final*/ HardReject /* = new HardReject(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        public static final com.tawabsoft.taxi.common.models.Driver.Status.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Status(java.lang.String value) {
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Driver$Status$Companion;", "", "()V", "get", "Lcom/tawabsoft/taxi/common/models/Driver$Status;", "code", "", "common_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.tawabsoft.taxi.common.models.Driver.Status get(@org.jetbrains.annotations.NotNull()
            java.lang.String code) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}