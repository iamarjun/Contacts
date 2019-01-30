package com.example.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J6\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/example/contacts/ApiWrapper;", "", "getAllContacts", "", "callBack", "Lcom/example/contacts/utils/CallBack;", "Lcom/example/contacts/model/Contacts;", "sendSMS", "apiKey", "", "number", "message", "sender", "Lcom/example/contacts/model/SmsResponse;", "app_debug"})
public abstract interface ApiWrapper {
    
    public abstract void getAllContacts(@org.jetbrains.annotations.NotNull()
    com.example.contacts.utils.CallBack<? super com.example.contacts.model.Contacts> callBack);
    
    public abstract void sendSMS(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String sender, @org.jetbrains.annotations.NotNull()
    com.example.contacts.utils.CallBack<? super com.example.contacts.model.SmsResponse> callBack);
}