package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/DataBinder;", "", "()V", "setImageUrl", "", "imageView", "Landroid/widget/ImageView;", "address", "", "setMedia", "media", "Lcom/tawabsoft/taxi/common/models/Media;", "circleImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "common_debug"})
public final class DataBinder {
    public static final com.tawabsoft.taxi.common.utils.DataBinder INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"imgUrl"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"media"})
    public static final void setMedia(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media media) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"media"})
    public static final void setMedia(@org.jetbrains.annotations.NotNull()
    com.google.android.material.imageview.ShapeableImageView circleImageView, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Media media) {
    }
    
    private DataBinder() {
        super();
    }
}