package com.example.latestrepositories.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.latestrepositories.model.dao.RepositoryDao;
import com.example.latestrepositories.model.dao.RepositoryDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoomDB_Impl extends RoomDB {
  private volatile RepositoryDao _repositoryDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RepositoryTable` (`ID` INTEGER, `Node_Id` TEXT, `Name` TEXT, `Full_Name` TEXT, `Html_Url` TEXT, `Description` TEXT, `Fork` INTEGER, `Url` TEXT, `Status_Url` TEXT, `Langugage_Url` TEXT, `Stargazers_Url` TEXT, `Downloads_url` TEXT, PRIMARY KEY(`ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2988cf0694b7ec52f70fc519e7325cec')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `RepositoryTable`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRepositoryTable = new HashMap<String, TableInfo.Column>(12);
        _columnsRepositoryTable.put("ID", new TableInfo.Column("ID", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Node_Id", new TableInfo.Column("Node_Id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Name", new TableInfo.Column("Name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Full_Name", new TableInfo.Column("Full_Name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Html_Url", new TableInfo.Column("Html_Url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Description", new TableInfo.Column("Description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Fork", new TableInfo.Column("Fork", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Url", new TableInfo.Column("Url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Status_Url", new TableInfo.Column("Status_Url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Langugage_Url", new TableInfo.Column("Langugage_Url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Stargazers_Url", new TableInfo.Column("Stargazers_Url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Downloads_url", new TableInfo.Column("Downloads_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRepositoryTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRepositoryTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRepositoryTable = new TableInfo("RepositoryTable", _columnsRepositoryTable, _foreignKeysRepositoryTable, _indicesRepositoryTable);
        final TableInfo _existingRepositoryTable = TableInfo.read(_db, "RepositoryTable");
        if (! _infoRepositoryTable.equals(_existingRepositoryTable)) {
          return new RoomOpenHelper.ValidationResult(false, "RepositoryTable(com.example.latestrepositories.model.entity.Repositories).\n"
                  + " Expected:\n" + _infoRepositoryTable + "\n"
                  + " Found:\n" + _existingRepositoryTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2988cf0694b7ec52f70fc519e7325cec", "18d59e92371206e06f48ebf52c124cd5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "RepositoryTable");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `RepositoryTable`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RepositoryDao.class, RepositoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public RepositoryDao repositoryDao() {
    if (_repositoryDao != null) {
      return _repositoryDao;
    } else {
      synchronized(this) {
        if(_repositoryDao == null) {
          _repositoryDao = new RepositoryDao_Impl(this);
        }
        return _repositoryDao;
      }
    }
  }
}
