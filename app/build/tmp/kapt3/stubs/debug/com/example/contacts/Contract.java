package com.example.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/contacts/Contract;", "", "ContactsPresenter", "ContactsView", "app_debug"})
public abstract interface Contract {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/example/contacts/Contract$ContactsView;", "Lcom/example/contacts/BaseView;", "Lcom/example/contacts/Contract$ContactsPresenter;", "onErrorGettingContacts", "", "message", "", "onErrorSendingSMS", "onSuccessGettingAllContacts", "response", "Lcom/example/contacts/model/Contacts;", "onSuccessSendingSMS", "t", "Lcom/example/contacts/model/SmsResponse;", "setProgressBarVisibility", "visibility", "", "app_debug"})
    public static abstract interface ContactsView extends com.example.contacts.BaseView<com.example.contacts.Contract.ContactsPresenter> {
        
        public abstract void onSuccessGettingAllContacts(@org.jetbrains.annotations.NotNull()
        com.example.contacts.model.Contacts response);
        
        public abstract void onErrorGettingContacts(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void setProgressBarVisibility(boolean visibility);
        
        public abstract void onSuccessSendingSMS(@org.jetbrains.annotations.NotNull()
        com.example.contacts.model.SmsResponse t);
        
        public abstract void onErrorSendingSMS(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/example/contacts/Contract$ContactsPresenter;", "Lcom/example/contacts/BasePresenter;", "getAllContacts", "", "sendSMS", "firstName", "", "lastName", "number", "message", "app_debug"})
    public static abstract interface ContactsPresenter extends com.example.contacts.BasePresenter {
        
        public abstract void getAllContacts();
        
        public abstract void sendSMS(@org.jetbrains.annotations.NotNull()
        java.lang.String firstName, @org.jetbrains.annotations.NotNull()
        java.lang.String lastName, @org.jetbrains.annotations.NotNull()
        java.lang.String number, @org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
}