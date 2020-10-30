package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010+\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001a\u0010.\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eR\u001a\u00101\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\b\u00a8\u00067"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Coupon;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "daysLeft", "", "getDaysLeft", "()I", "setDaysLeft", "(I)V", "description", "getDescription", "setDescription", "discountPercent", "getDiscountPercent", "setDiscountPercent", "expirationTimestamp", "", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "flatDiscount", "", "getFlatDiscount", "()D", "setFlatDiscount", "(D)V", "id", "getId", "setId", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "isFirstTravelOnly", "setFirstTravelOnly", "manyTimesUserCanUse", "getManyTimesUserCanUse", "setManyTimesUserCanUse", "manyUsersCanUse", "getManyUsersCanUse", "setManyUsersCanUse", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "title", "getTitle", "setTitle", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Coupon implements java.io.Serializable {
    private boolean isEnabled = true;
    private int manyUsersCanUse = 0;
    private int manyTimesUserCanUse = 0;
    private double flatDiscount = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String code;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private long startTimestamp = 0L;
    private long expirationTimestamp = 0L;
    private int discountPercent = 0;
    private boolean isFirstTravelOnly = false;
    private int daysLeft = 0;
    
    public final boolean isEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    public final int getManyUsersCanUse() {
        return 0;
    }
    
    public final void setManyUsersCanUse(int p0) {
    }
    
    public final int getManyTimesUserCanUse() {
        return 0;
    }
    
    public final void setManyTimesUserCanUse(int p0) {
    }
    
    public final double getFlatDiscount() {
        return 0.0;
    }
    
    public final void setFlatDiscount(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getStartTimestamp() {
        return 0L;
    }
    
    public final void setStartTimestamp(long p0) {
    }
    
    public final long getExpirationTimestamp() {
        return 0L;
    }
    
    public final void setExpirationTimestamp(long p0) {
    }
    
    public final int getDiscountPercent() {
        return 0;
    }
    
    public final void setDiscountPercent(int p0) {
    }
    
    public final boolean isFirstTravelOnly() {
        return false;
    }
    
    public final void setFirstTravelOnly(boolean p0) {
    }
    
    public final int getDaysLeft() {
        return 0;
    }
    
    public final void setDaysLeft(int p0) {
    }
    
    public Coupon() {
        super();
    }
}