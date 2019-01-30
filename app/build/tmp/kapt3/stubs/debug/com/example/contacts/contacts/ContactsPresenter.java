package com.example.contacts.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J(\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/contacts/contacts/ContactsPresenter;", "Lcom/example/contacts/Contract$ContactsPresenter;", "view", "Lcom/example/contacts/Contract$ContactsView;", "(Lcom/example/contacts/Contract$ContactsView;)V", "apiCaller", "Lcom/example/contacts/ApiCaller;", "getApiCaller$app_debug", "()Lcom/example/contacts/ApiCaller;", "setApiCaller$app_debug", "(Lcom/example/contacts/ApiCaller;)V", "mDb", "Lcom/example/contacts/room/MessageDatabase;", "mDbWorkerThread", "Lcom/example/contacts/utils/DbWorkerThread;", "getAllContacts", "", "insertDataIntoDB", "firstName", "", "lastName", "number", "message", "timeStamp", "onAttach", "onDetach", "sendSMS", "app_debug"})
public final class ContactsPresenter implements com.example.contacts.Contract.ContactsPresenter {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.contacts.ApiCaller apiCaller;
    private com.example.contacts.utils.DbWorkerThread mDbWorkerThread;
    private com.example.contacts.room.MessageDatabase mDb;
    private final com.example.contacts.Contract.ContactsView view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.contacts.ApiCaller getApiCaller$app_debug() {
        return null;
    }
    
    public final void setApiCaller$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.contacts.ApiCaller p0) {
    }
    
    @java.lang.Override()
    public void getAllContacts() {
    }
    
    @java.lang.Override()
    public void sendSMS(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void insertDataIntoDB(java.lang.String firstName, java.lang.String lastName, java.lang.String number, java.lang.String message, java.lang.String timeStamp) {
    }
    
    @java.lang.Override()
    public void onAttach() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public ContactsPresenter(@org.jetbrains.annotations.NotNull()
    com.example.contacts.Contract.ContactsView view) {
        super();
    }
}