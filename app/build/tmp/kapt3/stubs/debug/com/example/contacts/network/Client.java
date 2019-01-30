package com.example.contacts.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/contacts/network/Client;", "", "getAllContacts", "Lio/reactivex/Observable;", "Lcom/example/contacts/model/Contacts;", "app_debug"})
public abstract interface Client {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/get_all_contacts")
    public abstract io.reactivex.Observable<com.example.contacts.model.Contacts> getAllContacts();
}