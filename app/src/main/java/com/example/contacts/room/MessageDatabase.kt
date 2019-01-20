package com.example.contacts.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(MessageData::class), version = 1)
abstract class MessageDatabase : RoomDatabase() {

    abstract fun messageDao(): MessageDAO

    companion object {
        private var INSTANCE: MessageDatabase? = null

        fun getInstance(context: Context): MessageDatabase? {
            if (INSTANCE == null) {
                synchronized(MessageDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        MessageDatabase::class.java, "messages.db"
                    )
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}