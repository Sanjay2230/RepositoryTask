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
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RepositoryTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `Author` TEXT, `Name` TEXT, `Avatar` TEXT, `Url` TEXT, `Description` TEXT, `Language` TEXT, `LanguageColor` TEXT, `Stars` INTEGER, `Forks` INTEGER, `CurrentPeriodStars` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86f93d4d082e1be5a08ca33deda5e666')");
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
        final HashMap<String, TableInfo.Column> _columnsRepositoryTable = new HashMap<String, TableInfo.Column>(11);
        _columnsRepositoryTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Author", new TableInfo.Column("Author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Name", new TableInfo.Column("Name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Avatar", new TableInfo.Column("Avatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Url", new TableInfo.Column("Url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Description", new TableInfo.Column("Description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Language", new TableInfo.Column("Language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("LanguageColor", new TableInfo.Column("LanguageColor", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Stars", new TableInfo.Column("Stars", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("Forks", new TableInfo.Column("Forks", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepositoryTable.put("CurrentPeriodStars", new TableInfo.Column("CurrentPeriodStars", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
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
    }, "86f93d4d082e1be5a08ca33deda5e666", "20f0c76aeab75b4b2438e518f0f43fed");
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
