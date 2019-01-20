package com.example.contacts.network

import com.example.contacts.Constants
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.*


@JvmSuppressWildcards
interface Twilio {
    @FormUrlEncoded
    @POST(Constants.SEND_SMS)
    fun sendMessage(
        @Path("ACCOUNT_SID") accountSId: String,
        @Header("Authorization") signature: String,
        @FieldMap metadata: Map<String, String>
    ): Observable<ResponseBody>
}