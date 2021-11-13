package com.example.latestrepositories.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'\u00a8\u0006\r"}, d2 = {"Lcom/example/latestrepositories/model/dao/RepositoryDao;", "", "deleteAll", "", "getLastRecordId", "", "()Ljava/lang/Integer;", "getRepoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/latestrepositories/model/entity/Repositories;", "insert", "cats", "app_debug"})
public abstract interface RepositoryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.latestrepositories.model.entity.Repositories> cats);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RepositoryTable")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.latestrepositories.model.entity.Repositories>> getRepoList();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT ID FROM RepositoryTable ORDER BY ID DESC LIMIT 1")
    public abstract java.lang.Integer getLastRecordId();
    
    @androidx.room.Query(value = "DELETE FROM RepositoryTable")
    public abstract void deleteAll();
}