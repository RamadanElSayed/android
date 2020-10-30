package com.tawabsoft.taxi.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/AlertDialogBuilder;", "", "()V", "show", "", "context", "Landroid/content/Context;", "message", "", "button", "Lcom/tawabsoft/taxi/common/utils/AlertDialogBuilder$DialogButton;", "event", "Lcom/tawabsoft/taxi/common/interfaces/AlertDialogEvent;", "title", "DialogButton", "DialogResult", "common_release"})
public final class AlertDialogBuilder {
    public static final com.tawabsoft.taxi.common.utils.AlertDialogBuilder INSTANCE = null;
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.utils.AlertDialogBuilder.DialogButton button, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.interfaces.AlertDialogEvent event) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.interfaces.AlertDialogEvent event) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.interfaces.AlertDialogEvent event) {
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.utils.AlertDialogBuilder.DialogButton button, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.interfaces.AlertDialogEvent event) {
    }
    
    private AlertDialogBuilder() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/AlertDialogBuilder$DialogButton;", "", "(Ljava/lang/String;I)V", "OK_CANCEL", "OK", "CANCEL_RETRY", "common_release"})
    public static enum DialogButton {
        /*public static final*/ OK_CANCEL /* = new OK_CANCEL() */,
        /*public static final*/ OK /* = new OK() */,
        /*public static final*/ CANCEL_RETRY /* = new CANCEL_RETRY() */;
        
        DialogButton() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tawabsoft/taxi/common/utils/AlertDialogBuilder$DialogResult;", "", "(Ljava/lang/String;I)V", "CANCEL", "OK", "RETRY", "common_release"})
    public static enum DialogResult {
        /*public static final*/ CANCEL /* = new CANCEL() */,
        /*public static final*/ OK /* = new OK() */,
        /*public static final*/ RETRY /* = new RETRY() */;
        
        DialogResult() {
        }
    }
}