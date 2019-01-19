package com.example.contacts.model

import com.google.gson.annotations.SerializedName

data class Contacts(
    @SerializedName("contacts")
    val contacts: List<Contact?>?
)