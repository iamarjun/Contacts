package com.example.contacts

import com.example.contacts.model.Contacts
import com.example.contacts.utils.CallBack

interface ApiWrapper {
    fun getAllContacts(callBack: CallBack<Contacts>)
}