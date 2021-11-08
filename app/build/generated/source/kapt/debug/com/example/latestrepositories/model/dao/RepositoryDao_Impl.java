package com.example.latestrepositories.model.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.latestrepositories.model.entity.Repositories;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RepositoryDao_Impl implements RepositoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Repositories> __insertionAdapterOfRepositories;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RepositoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRepositories = new EntityInsertionAdapter<Repositories>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RepositoryTable` (`id`,`Author`,`Name`,`Avatar`,`Url`,`Description`,`Language`,`LanguageColor`,`Stars`,`Forks`,`CurrentPeriodStars`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Repositories value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAvatar());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUrl());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanguage());
        }
        if (value.getLanguageColor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLanguageColor());
        }
        if (value.getStars() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getStars());
        }
        if (value.getForks() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getForks());
        }
        if (value.getCurrentPeriodStars() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getCurrentPeriodStars());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RepositoryTable";
        return _query;
      }
    };
  }

  @Override
  public void insert(final List<Repositories> cats) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepositories.insert(cats);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Repositories>> getRepoList() {
    final String _sql = "SELECT * FROM RepositoryTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"RepositoryTable"}, false, new Callable<List<Repositories>>() {
      @Override
      public List<Repositories> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "Author");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "Name");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "Avatar");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Url");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "Description");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "Language");
          final int _cursorIndexOfLanguageColor = CursorUtil.getColumnIndexOrThrow(_cursor, "LanguageColor");
          final int _cursorIndexOfStars = CursorUtil.getColumnIndexOrThrow(_cursor, "Stars");
          final int _cursorIndexOfForks = CursorUtil.getColumnIndexOrThrow(_cursor, "Forks");
          final int _cursorIndexOfCurrentPeriodStars = CursorUtil.getColumnIndexOrThrow(_cursor, "CurrentPeriodStars");
          final List<Repositories> _result = new ArrayList<Repositories>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Repositories _item;
            _item = new Repositories();
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            _item.setAuthor(_tmpAuthor);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            _item.setAvatar(_tmpAvatar);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item.setUrl(_tmpUrl);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            _item.setLanguage(_tmpLanguage);
            final String _tmpLanguageColor;
            if (_cursor.isNull(_cursorIndexOfLanguageColor)) {
              _tmpLanguageColor = null;
            } else {
              _tmpLanguageColor = _cursor.getString(_cursorIndexOfLanguageColor);
            }
            _item.setLanguageColor(_tmpLanguageColor);
            final Integer _tmpStars;
            if (_cursor.isNull(_cursorIndexOfStars)) {
              _tmpStars = null;
            } else {
              _tmpStars = _cursor.getInt(_cursorIndexOfStars);
            }
            _item.setStars(_tmpStars);
            final Integer _tmpForks;
            if (_cursor.isNull(_cursorIndexOfForks)) {
              _tmpForks = null;
            } else {
              _tmpForks = _cursor.getInt(_cursorIndexOfForks);
            }
            _item.setForks(_tmpForks);
            final Integer _tmpCurrentPeriodStars;
            if (_cursor.isNull(_cursorIndexOfCurrentPeriodStars)) {
              _tmpCurrentPeriodStars = null;
            } else {
              _tmpCurrentPeriodStars = _cursor.getInt(_cursorIndexOfCurrentPeriodStars);
            }
            _item.setCurrentPeriodStars(_tmpCurrentPeriodStars);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
