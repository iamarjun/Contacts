package com.example.contacts.network

import com.example.contacts.Constants
import com.example.contacts.model.Contacts
import io.reactivex.Observable
import retrofit2.http.GET

@JvmSuppressWildcards
interface Client {

    @GET(Constants.GET_ALL_CONTACTS)
    fun getAllContacts(): Observable<Contacts>
}