package com.example.contacts.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class MessageDatabase_Impl extends MessageDatabase {
  private volatile MessageDAO _messageDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `messageData` (`first_name` TEXT NOT NULL, `last_name` TEXT NOT NULL, `number` TEXT NOT NULL, `otp` TEXT NOT NULL, `time_stamp` TEXT NOT NULL, PRIMARY KEY(`number`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"80555a3e5a476f3e04a800aacf3e2f97\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `messageData`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMessageData = new HashMap<String, TableInfo.Column>(5);
        _columnsMessageData.put("first_name", new TableInfo.Column("first_name", "TEXT", true, 0));
        _columnsMessageData.put("last_name", new TableInfo.Column("last_name", "TEXT", true, 0));
        _columnsMessageData.put("number", new TableInfo.Column("number", "TEXT", true, 1));
        _columnsMessageData.put("otp", new TableInfo.Column("otp", "TEXT", true, 0));
        _columnsMessageData.put("time_stamp", new TableInfo.Column("time_stamp", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMessageData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMessageData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMessageData = new TableInfo("messageData", _columnsMessageData, _foreignKeysMessageData, _indicesMessageData);
        final TableInfo _existingMessageData = TableInfo.read(_db, "messageData");
        if (! _infoMessageData.equals(_existingMessageData)) {
          throw new IllegalStateException("Migration didn't properly handle messageData(com.example.contacts.room.MessageData).\n"
                  + " Expected:\n" + _infoMessageData + "\n"
                  + " Found:\n" + _existingMessageData);
        }
      }
    }, "80555a3e5a476f3e04a800aacf3e2f97", "ccf547bc24328b2cdf813fe98d1b7498");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "messageData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `messageData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MessageDAO messageDao() {
    if (_messageDAO != null) {
      return _messageDAO;
    } else {
      synchronized(this) {
        if(_messageDAO == null) {
          _messageDAO = new MessageDAO_Impl(this);
        }
        return _messageDAO;
      }
    }
  }
}
