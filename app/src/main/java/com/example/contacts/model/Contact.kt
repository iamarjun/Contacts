package com.example.contacts.model

import com.google.gson.annotations.SerializedName

data class Contact(
    @SerializedName("contact_number")
    val contactNumber: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("last_name")
    val lastName: String?
)