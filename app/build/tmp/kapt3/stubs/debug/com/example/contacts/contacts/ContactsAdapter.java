package com.example.contacts.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/contacts/contacts/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/contacts/contacts/ContactsAdapter$ContactsViewHolder;", "listener", "Lcom/example/contacts/contacts/ContactsAdapter$ItemClickListener;", "contactsList", "", "Lcom/example/contacts/model/Contact;", "(Lcom/example/contacts/contacts/ContactsAdapter$ItemClickListener;Ljava/util/List;)V", "colorHolder", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "initial", "", "Ljava/lang/Character;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactsViewHolder", "ItemClickListener", "app_debug"})
public final class ContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.contacts.contacts.ContactsAdapter.ContactsViewHolder> {
    private java.lang.Character initial;
    private java.util.ArrayList<java.lang.Integer> colorHolder;
    private final com.example.contacts.contacts.ContactsAdapter.ItemClickListener listener = null;
    private final java.util.List<com.example.contacts.model.Contact> contactsList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.contacts.contacts.ContactsAdapter.ContactsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.contacts.contacts.ContactsAdapter.ContactsViewHolder holder, int position) {
    }
    
    public ContactsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.contacts.contacts.ContactsAdapter.ItemClickListener listener, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.contacts.model.Contact> contactsList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/contacts/contacts/ContactsAdapter$ItemClickListener;", "", "onItemClick", "", "position", "", "colorHolder", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> colorHolder);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/contacts/contacts/ContactsAdapter$ContactsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/example/contacts/contacts/ContactsAdapter$ItemClickListener;", "view", "Landroid/view/View;", "(Lcom/example/contacts/contacts/ContactsAdapter;Lcom/example/contacts/contacts/ContactsAdapter$ItemClickListener;Landroid/view/View;)V", "mDP", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getMDP", "()Landroid/widget/ImageView;", "mName", "Landroid/widget/TextView;", "getMName", "()Landroid/widget/TextView;", "app_debug"})
    public final class ContactsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView mDP = null;
        private final android.widget.TextView mName = null;
        private final com.example.contacts.contacts.ContactsAdapter.ItemClickListener listener = null;
        private final android.view.View view = null;
        
        public final android.widget.ImageView getMDP() {
            return null;
        }
        
        public final android.widget.TextView getMName() {
            return null;
        }
        
        public ContactsViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.contacts.contacts.ContactsAdapter.ItemClickListener listener, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}