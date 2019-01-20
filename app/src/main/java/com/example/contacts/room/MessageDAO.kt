package com.example.contacts.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface MessageDAO {

    @Query("SELECT * FROM messageData")
    fun getAllMessages(): List<MessageData>

    @Insert(onConflict = REPLACE)
    fun insert(messageData: MessageData)
}