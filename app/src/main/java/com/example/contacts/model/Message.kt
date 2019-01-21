package com.example.contacts.model

import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("id")
    val id: String?,
    @SerializedName("recipient")
    val recipient: Long?
)