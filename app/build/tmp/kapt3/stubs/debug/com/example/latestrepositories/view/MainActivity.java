package com.example.latestrepositories.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u0012\u0010&\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0003J\u0006\u0010\'\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/latestrepositories/view/MainActivity;", "Lcom/example/latestrepositories/utils/Utils;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Landroid/view/View$OnClickListener;", "()V", "currentInt", "", "getCurrentInt", "()I", "setCurrentInt", "(I)V", "repoList", "Ljava/util/ArrayList;", "Lcom/example/latestrepositories/model/entity/Repositories;", "Lkotlin/collections/ArrayList;", "repoListAdapter", "Lcom/example/latestrepositories/view/adapters/RepoListAdapter;", "repositoryViewModel", "Lcom/example/latestrepositories/viewmodel/RepositoryViewModel;", "searchView", "Landroidx/appcompat/widget/SearchView;", "networkCall", "", "objectInitialization", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRefresh", "setSearchViewSetting", "showRepoList", "app_debug"})
public final class MainActivity extends com.example.latestrepositories.utils.Utils implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener, android.view.View.OnClickListener {
    private com.example.latestrepositories.viewmodel.RepositoryViewModel repositoryViewModel;
    private com.example.latestrepositories.view.adapters.RepoListAdapter repoListAdapter;
    private java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> repoList;
    private androidx.appcompat.widget.SearchView searchView;
    private int currentInt = 0;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    public final int getCurrentInt() {
        return 0;
    }
    
    public final void setCurrentInt(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void objectInitialization() {
    }
    
    public final void showRepoList() {
    }
    
    private final void networkCall() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN)
    @android.annotation.SuppressLint(value = {"NewApi", "SoonBlockedPrivateApi"})
    private final void setSearchViewSetting(android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}