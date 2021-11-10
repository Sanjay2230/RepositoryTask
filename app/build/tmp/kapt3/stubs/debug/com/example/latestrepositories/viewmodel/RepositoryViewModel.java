package com.example.latestrepositories.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J5\u0010\u0007\u001a\u00020\b2-\u0010\t\u001a)\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\nJ\u0014\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/latestrepositories/viewmodel/RepositoryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lcom/example/latestrepositories/database/RoomDB;", "getRepoList", "", "onSuccess", "Lkotlin/Function1;", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/latestrepositories/model/entity/Repositories;", "Lkotlin/ParameterName;", "name", "listRepo", "insert", "list", "app_debug"})
public final class RepositoryViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.latestrepositories.database.RoomDB db = null;
    
    public RepositoryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.latestrepositories.model.entity.Repositories> list) {
    }
    
    public final void getRepoList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.lifecycle.LiveData<java.util.List<com.example.latestrepositories.model.entity.Repositories>>, kotlin.Unit> onSuccess) {
    }
}