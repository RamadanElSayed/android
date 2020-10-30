package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Promotion;", "", "()V", "daysLeft", "", "getDaysLeft", "()I", "setDaysLeft", "(I)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "expirationTimestamp", "", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "id", "getId", "setId", "media", "Lcom/tawabsoft/taxi/common/models/Media;", "getMedia", "()Lcom/tawabsoft/taxi/common/models/Media;", "setMedia", "(Lcom/tawabsoft/taxi/common/models/Media;)V", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "title", "getTitle", "setTitle", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Promotion {
    private long startTimestamp = 0L;
    private long expirationTimestamp = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Media media;
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private int daysLeft = 0;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.common.models.Media getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media p0) {
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
    
    public final int getDaysLeft() {
        return 0;
    }
    
    public final void setDaysLeft(int p0) {
    }
    
    public Promotion() {
        super();
    }
}