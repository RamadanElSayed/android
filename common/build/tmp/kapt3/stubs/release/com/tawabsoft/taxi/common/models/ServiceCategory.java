package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/tawabsoft/taxi/common/models/ServiceCategory;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "services", "", "Lcom/tawabsoft/taxi/common/models/Service;", "getServices", "()Ljava/util/List;", "setServices", "(Ljava/util/List;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "common_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ServiceCategory {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.tawabsoft.taxi.common.models.Service> services;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tawabsoft.taxi.common.models.Service> getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tawabsoft.taxi.common.models.Service> p0) {
    }
    
    public ServiceCategory() {
        super();
    }
}