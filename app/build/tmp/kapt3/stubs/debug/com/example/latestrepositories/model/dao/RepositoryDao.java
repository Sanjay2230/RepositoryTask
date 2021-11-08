package com.example.latestrepositories.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\'J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/latestrepositories/model/dao/RepositoryDao;", "", "deleteAll", "", "getRepoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/latestrepositories/model/entity/Repositories;", "insert", "cats", "isRecordExists", "", "author", "", "name", "lang", "app_debug"})
public abstract interface RepositoryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.latestrepositories.model.entity.Repositories cats);
    
    @androidx.room.Query(value = "Select Count(*) From RepositoryTable Where Author=:author AND Name=:name AND Language=:lang")
    public abstract int isRecordExists(@org.jetbrains.annotations.NotNull()
    java.lang.String author, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RepositoryTable")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.latestrepositories.model.entity.Repositories>> getRepoList();
    
    @androidx.room.Query(value = "DELETE FROM RepositoryTable")
    public abstract void deleteAll();
}