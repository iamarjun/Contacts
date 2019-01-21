package com.example.contacts.model

import com.google.gson.annotations.SerializedName

data class MessageX(
    @SerializedName("content")
    val content: String?,
    @SerializedName("num_parts")
    val numParts: Int?,
    @SerializedName("sender")
    val sender: String?
)