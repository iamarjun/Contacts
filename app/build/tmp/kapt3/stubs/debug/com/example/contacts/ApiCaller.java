package com.example.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J6\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/example/contacts/ApiCaller;", "Lcom/example/contacts/ApiWrapper;", "()V", "client", "Lcom/example/contacts/network/Client;", "getClient$app_debug", "()Lcom/example/contacts/network/Client;", "setClient$app_debug", "(Lcom/example/contacts/network/Client;)V", "sms", "Lcom/example/contacts/network/SMS;", "getSms$app_debug", "()Lcom/example/contacts/network/SMS;", "setSms$app_debug", "(Lcom/example/contacts/network/SMS;)V", "getAllContacts", "", "callBack", "Lcom/example/contacts/utils/CallBack;", "Lcom/example/contacts/model/Contacts;", "sendSMS", "apiKey", "", "number", "message", "sender", "Lcom/example/contacts/model/SmsResponse;", "Companion", "app_debug"})
public final class ApiCaller implements com.example.contacts.ApiWrapper {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.contacts.network.Client client;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.contacts.network.SMS sms;
    private static final java.lang.String ERROR_LOADING_RESULT = "Error Loading Result";
    private static final java.lang.String ERROR_SENDING_SMS = "Error Sending SMS";
    public static final com.example.contacts.ApiCaller.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.contacts.network.Client getClient$app_debug() {
        return null;
    }
    
    public final void setClient$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.contacts.network.Client p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.contacts.network.SMS getSms$app_debug() {
        return null;
    }
    
    public final void setSms$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.contacts.network.SMS p0) {
    }
    
    @java.lang.Override()
    public void getAllContacts(@org.jetbrains.annotations.NotNull()
    com.example.contacts.utils.CallBack<? super com.example.contacts.model.Contacts> callBack) {
    }
    
    @java.lang.Override()
    public void sendSMS(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String sender, @org.jetbrains.annotations.NotNull()
    com.example.contacts.utils.CallBack<? super com.example.contacts.model.SmsResponse> callBack) {
    }
    
    public ApiCaller() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/contacts/ApiCaller$Companion;", "", "()V", "ERROR_LOADING_RESULT", "", "ERROR_SENDING_SMS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}