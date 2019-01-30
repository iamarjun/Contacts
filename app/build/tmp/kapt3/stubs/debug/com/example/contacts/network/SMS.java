package com.example.contacts.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/contacts/network/SMS;", "", "sendSMS", "Lio/reactivex/Observable;", "Lcom/example/contacts/model/SmsResponse;", "apiKey", "", "number", "message", "sender", "app_debug"})
public abstract interface SMS {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "https://api.textlocal.in/send/")
    public abstract io.reactivex.Observable<com.example.contacts.model.SmsResponse> sendSMS(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "numbers")
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "message")
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sender")
    java.lang.String sender);
}