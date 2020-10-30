package com.tawabsoft.taxi.common.activities.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0015J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tawabsoft/taxi/common/activities/chat/ChatActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "()V", "adapter", "Lcom/stfalcon/chatkit/messages/MessagesListAdapter;", "Lcom/tawabsoft/taxi/common/models/ChatMessage;", "application", "", "getApplication", "()Ljava/lang/String;", "setApplication", "(Ljava/lang/String;)V", "messageInput", "Lcom/stfalcon/chatkit/messages/MessageInput;", "messagesList", "Lcom/stfalcon/chatkit/messages/MessagesList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "common_release"})
public final class ChatActivity extends com.tawabsoft.taxi.common.components.BaseActivity {
    private com.stfalcon.chatkit.messages.MessagesList messagesList;
    private com.stfalcon.chatkit.messages.MessageInput messageInput;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String application;
    private com.stfalcon.chatkit.messages.MessagesListAdapter<com.tawabsoft.taxi.common.models.ChatMessage> adapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public ChatActivity() {
        super();
    }
}