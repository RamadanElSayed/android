package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Media;", "Ljava/io/Serializable;", "address", "", "pathType", "Lcom/tawabsoft/taxi/common/models/Media$PathType;", "(Ljava/lang/String;Lcom/tawabsoft/taxi/common/models/Media$PathType;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getPathType", "()Lcom/tawabsoft/taxi/common/models/Media$PathType;", "setPathType", "(Lcom/tawabsoft/taxi/common/models/Media$PathType;)V", "privacyLevel", "getPrivacyLevel", "setPrivacyLevel", "title", "getTitle", "setTitle", "PathType", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Media implements java.io.Serializable {
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String privacyLevel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private com.tawabsoft.taxi.common.models.Media.PathType pathType;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrivacyLevel() {
        return null;
    }
    
    public final void setPrivacyLevel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Media.PathType getPathType() {
        return null;
    }
    
    public final void setPathType(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Media.PathType p0) {
    }
    
    public Media(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Media.PathType pathType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Media$PathType;", "", "(Ljava/lang/String;I)V", "relative", "absolute", "common_release"})
    public static enum PathType {
        @com.squareup.moshi.Json(name = "relative")
        /*public static final*/ relative /* = new relative() */,
        @com.squareup.moshi.Json(name = "absolute")
        /*public static final*/ absolute /* = new absolute() */;
        
        PathType() {
        }
    }
}