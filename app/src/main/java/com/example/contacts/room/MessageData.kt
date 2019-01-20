package com.example.contacts.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "messageData")
data class MessageData(
    @ColumnInfo(name = "first_name") var firstName: String,
    @ColumnInfo(name = "last_name") var lastName: String,
    @PrimaryKey@ColumnInfo(name = "number") var number: String,
    @ColumnInfo(name = "otp") var otp: String,
    @ColumnInfo(name = "time_stamp") var dateTime: String
)