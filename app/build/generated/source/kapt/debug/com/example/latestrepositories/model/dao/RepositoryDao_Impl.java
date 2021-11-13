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
import java.lang.Boolean;
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
        return "INSERT OR REPLACE INTO `RepositoryTable` (`ID`,`Node_Id`,`Name`,`Full_Name`,`Html_Url`,`Description`,`Fork`,`Url`,`Status_Url`,`Langugage_Url`,`Stargazers_Url`,`Downloads_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Repositories value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getNode_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNode_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getFull_name() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFull_name());
        }
        if (value.getHtml_url() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHtml_url());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        final Integer _tmp;
        _tmp = value.getFork() == null ? null : (value.getFork() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrl());
        }
        if (value.getStatuses_url() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStatuses_url());
        }
        if (value.getLanguages_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLanguages_url());
        }
        if (value.getStargazers_url() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStargazers_url());
        }
        if (value.getDownloads_url() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDownloads_url());
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
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "ID");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "Node_Id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "Name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "Full_Name");
          final int _cursorIndexOfHtmlUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Html_Url");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "Description");
          final int _cursorIndexOfFork = CursorUtil.getColumnIndexOrThrow(_cursor, "Fork");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Url");
          final int _cursorIndexOfStatusesUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Status_Url");
          final int _cursorIndexOfLanguagesUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Langugage_Url");
          final int _cursorIndexOfStargazersUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Stargazers_Url");
          final int _cursorIndexOfDownloadsUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "Downloads_url");
          final List<Repositories> _result = new ArrayList<Repositories>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Repositories _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpNode_id;
            if (_cursor.isNull(_cursorIndexOfNodeId)) {
              _tmpNode_id = null;
            } else {
              _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpHtml_url;
            if (_cursor.isNull(_cursorIndexOfHtmlUrl)) {
              _tmpHtml_url = null;
            } else {
              _tmpHtml_url = _cursor.getString(_cursorIndexOfHtmlUrl);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Boolean _tmpFork;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfFork)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfFork);
            }
            _tmpFork = _tmp == null ? null : _tmp != 0;
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpStatuses_url;
            if (_cursor.isNull(_cursorIndexOfStatusesUrl)) {
              _tmpStatuses_url = null;
            } else {
              _tmpStatuses_url = _cursor.getString(_cursorIndexOfStatusesUrl);
            }
            final String _tmpLanguages_url;
            if (_cursor.isNull(_cursorIndexOfLanguagesUrl)) {
              _tmpLanguages_url = null;
            } else {
              _tmpLanguages_url = _cursor.getString(_cursorIndexOfLanguagesUrl);
            }
            final String _tmpStargazers_url;
            if (_cursor.isNull(_cursorIndexOfStargazersUrl)) {
              _tmpStargazers_url = null;
            } else {
              _tmpStargazers_url = _cursor.getString(_cursorIndexOfStargazersUrl);
            }
            final String _tmpDownloads_url;
            if (_cursor.isNull(_cursorIndexOfDownloadsUrl)) {
              _tmpDownloads_url = null;
            } else {
              _tmpDownloads_url = _cursor.getString(_cursorIndexOfDownloadsUrl);
            }
            _item = new Repositories(_tmpId,_tmpNode_id,_tmpName,_tmpFull_name,_tmpHtml_url,_tmpDescription,_tmpFork,_tmpUrl,_tmpStatuses_url,_tmpLanguages_url,_tmpStargazers_url,_tmpDownloads_url);
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

  @Override
  public Integer getLastRecordId() {
    final String _sql = "SELECT ID FROM RepositoryTable ORDER BY ID DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Integer _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getInt(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
