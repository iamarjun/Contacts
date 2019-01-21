package com.example.contacts

import com.example.contacts.model.Contacts
import com.example.contacts.model.SmsResponse
import com.example.contacts.utils.CallBack

interface ApiWrapper {
    fun getAllContacts(callBack: CallBack<Contacts>)
    fun sendSMS(apiKey: String, number: String, message: String, sender: String, callBack: CallBack<SmsResponse>)
}