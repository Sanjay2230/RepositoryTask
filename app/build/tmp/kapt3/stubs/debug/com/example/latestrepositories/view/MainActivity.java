package com.example.latestrepositories.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0003J\u0006\u0010\"\u001a\u00020\u0010R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/latestrepositories/view/MainActivity;", "Lcom/example/latestrepositories/utils/Utils;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Landroid/view/View$OnClickListener;", "()V", "repoList", "Ljava/util/ArrayList;", "Lcom/example/latestrepositories/model/entity/Repositories;", "Lkotlin/collections/ArrayList;", "repoListAdapter", "Lcom/example/latestrepositories/view/adapters/RepoListAdapter;", "repositoryViewModel", "Lcom/example/latestrepositories/viewmodel/RepositoryViewModel;", "searchView", "Landroidx/appcompat/widget/SearchView;", "networkCall", "", "objectInitialization", "onBackPressed", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRefresh", "setSearchViewSetting", "showRepoList", "app_debug"})
public final class MainActivity extends com.example.latestrepositories.utils.Utils implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener, android.view.View.OnClickListener {
    private com.example.latestrepositories.viewmodel.RepositoryViewModel repositoryViewModel;
    private com.example.latestrepositories.view.adapters.RepoListAdapter repoListAdapter;
    private java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> repoList;
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
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
    
    @java.lang.Override()
    public void onBackPressed() {
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