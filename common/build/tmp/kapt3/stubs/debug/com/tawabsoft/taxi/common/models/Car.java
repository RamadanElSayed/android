package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/tawabsoft/taxi/common/models/Car;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "media", "Lcom/tawabsoft/taxi/common/models/Media;", "getMedia", "()Lcom/tawabsoft/taxi/common/models/Media;", "setMedia", "(Lcom/tawabsoft/taxi/common/models/Media;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "common_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Car {
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.common.models.Media media;
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    
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
    
    public Car() {
        super();
    }
}