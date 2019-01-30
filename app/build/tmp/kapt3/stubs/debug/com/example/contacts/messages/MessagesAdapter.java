package com.example.contacts.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/contacts/messages/MessagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/contacts/messages/MessagesAdapter$MessagesViewHolder;", "messages", "", "Lcom/example/contacts/room/MessageData;", "(Ljava/util/List;)V", "colorHolder", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "initial", "", "Ljava/lang/Character;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MessagesViewHolder", "app_debug"})
public final class MessagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.contacts.messages.MessagesAdapter.MessagesViewHolder> {
    private java.lang.Character initial;
    private java.util.ArrayList<java.lang.Integer> colorHolder;
    private final java.util.List<com.example.contacts.room.MessageData> messages = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.contacts.messages.MessagesAdapter.MessagesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.contacts.messages.MessagesAdapter.MessagesViewHolder holder, int position) {
    }
    
    public MessagesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.contacts.room.MessageData> messages) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/contacts/messages/MessagesAdapter$MessagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/contacts/messages/MessagesAdapter;Landroid/view/View;)V", "mDP", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getMDP", "()Landroid/widget/ImageView;", "mName", "Landroid/widget/TextView;", "getMName", "()Landroid/widget/TextView;", "mNumber", "getMNumber", "mOTP", "getMOTP", "mTimeStamp", "getMTimeStamp", "app_debug"})
    public final class MessagesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView mDP = null;
        private final android.widget.TextView mName = null;
        private final android.widget.TextView mNumber = null;
        private final android.widget.TextView mOTP = null;
        private final android.widget.TextView mTimeStamp = null;
        private final android.view.View view = null;
        
        public final android.widget.ImageView getMDP() {
            return null;
        }
        
        public final android.widget.TextView getMName() {
            return null;
        }
        
        public final android.widget.TextView getMNumber() {
            return null;
        }
        
        public final android.widget.TextView getMOTP() {
            return null;
        }
        
        public final android.widget.TextView getMTimeStamp() {
            return null;
        }
        
        public MessagesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}