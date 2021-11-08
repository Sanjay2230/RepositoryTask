package com.example.latestrepositories.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/latestrepositories/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "repoList", "Ljava/util/ArrayList;", "Lcom/example/latestrepositories/model/entity/Repositories;", "Lkotlin/collections/ArrayList;", "repoListAdapter", "Lcom/example/latestrepositories/view/adapters/RepoListAdapter;", "repositoryViewModel", "Lcom/example/latestrepositories/viewmodel/RepositoryViewModel;", "networkCall", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.latestrepositories.viewmodel.RepositoryViewModel repositoryViewModel;
    private com.example.latestrepositories.view.adapters.RepoListAdapter repoListAdapter;
    private java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> repoList;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void networkCall() {
    }
}