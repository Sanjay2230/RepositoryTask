package com.example.latestrepositories.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0006\u0010\u0013\u001a\u00020\rR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/latestrepositories/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "repoList", "Ljava/util/ArrayList;", "Lcom/example/latestrepositories/model/entity/Repositories;", "Lkotlin/collections/ArrayList;", "repoListAdapter", "Lcom/example/latestrepositories/view/adapters/RepoListAdapter;", "repositoryViewModel", "Lcom/example/latestrepositories/viewmodel/RepositoryViewModel;", "networkCall", "", "objectInitialization", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "showRepoList", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
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
    
    public final void objectInitialization() {
    }
    
    public final void showRepoList() {
    }
    
    public final void networkCall() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
}