package com.example.contacts

import com.example.contacts.model.Contacts
import com.example.contacts.utils.CallBack
import okhttp3.ResponseBody

interface ApiWrapper {
    fun getAllContacts(callBack: CallBack<Contacts>)
    fun sendSMS(account_sid: String, base64EncodedCredentials: String, data: Map<String, String>, callBack: CallBack<ResponseBody>)
}