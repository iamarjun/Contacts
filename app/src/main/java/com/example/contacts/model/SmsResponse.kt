package com.example.contacts.model

import com.google.gson.annotations.SerializedName

data class SmsResponse(
    @SerializedName("balance")
    val balance: Int?,
    @SerializedName("batch_id")
    val batchId: Int?,
    @SerializedName("cost")
    val cost: Int?,
    @SerializedName("message")
    val message: Message?,
    @SerializedName("messages")
    val messages: List<Message?>?,
    @SerializedName("num_messages")
    val numMessages: Int?,
    @SerializedName("status")
    val status: String?
)