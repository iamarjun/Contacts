package com.example.contacts.network

import com.example.contacts.Constants
import com.example.contacts.model.SmsResponse
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

@JvmSuppressWildcards
interface SMS {

    @POST(Constants.BASE_URL_SMS)
    fun sendSMS(
        @Query("apiKey") apiKey: String,
        @Query("numbers") number: String,
        @Query("message") message: String,
        @Query("sender") sender: String
    ): Observable<SmsResponse>
}