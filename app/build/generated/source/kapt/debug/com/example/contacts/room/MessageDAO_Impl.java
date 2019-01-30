package com.example.contacts.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class MessageDAO_Impl implements MessageDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMessageData;

  public MessageDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMessageData = new EntityInsertionAdapter<MessageData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `messageData`(`first_name`,`last_name`,`number`,`otp`,`time_stamp`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MessageData value) {
        if (value.getFirstName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLastName());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNumber());
        }
        if (value.getOtp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOtp());
        }
        if (value.getDateTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDateTime());
        }
      }
    };
  }

  @Override
  public void insert(MessageData messageData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMessageData.insert(messageData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MessageData> getAllMessages() {
    final String _sql = "SELECT * FROM messageData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfFirstName = _cursor.getColumnIndexOrThrow("first_name");
      final int _cursorIndexOfLastName = _cursor.getColumnIndexOrThrow("last_name");
      final int _cursorIndexOfNumber = _cursor.getColumnIndexOrThrow("number");
      final int _cursorIndexOfOtp = _cursor.getColumnIndexOrThrow("otp");
      final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("time_stamp");
      final List<MessageData> _result = new ArrayList<MessageData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MessageData _item;
        final String _tmpFirstName;
        _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        final String _tmpLastName;
        _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
        final String _tmpNumber;
        _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
        final String _tmpOtp;
        _tmpOtp = _cursor.getString(_cursorIndexOfOtp);
        final String _tmpDateTime;
        _tmpDateTime = _cursor.getString(_cursorIndexOfDateTime);
        _item = new MessageData(_tmpFirstName,_tmpLastName,_tmpNumber,_tmpOtp,_tmpDateTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
