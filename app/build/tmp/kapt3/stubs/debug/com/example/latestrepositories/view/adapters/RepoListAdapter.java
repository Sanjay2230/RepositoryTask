package com.example.latestrepositories.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J1\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00162!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00180\u001bJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0016H\u0016J \u0010&\u001a\u00020\u00182\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`(H\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/example/latestrepositories/view/adapters/RepoListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/latestrepositories/view/viewHolders/RepoListViewHolder;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "filteredrepoList", "Ljava/util/ArrayList;", "Lcom/example/latestrepositories/model/entity/Repositories;", "getFilteredrepoList", "()Ljava/util/ArrayList;", "setFilteredrepoList", "(Ljava/util/ArrayList;)V", "repoList", "getRepoList", "setRepoList", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "getLastItem", "", "pos", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lastItemId", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class RepoListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.latestrepositories.view.viewHolders.RepoListViewHolder> implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> repoList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> filteredrepoList;
    
    public RepoListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> getRepoList() {
        return null;
    }
    
    public final void setRepoList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> getFilteredrepoList() {
        return null;
    }
    
    public final void setFilteredrepoList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.latestrepositories.view.viewHolders.RepoListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.latestrepositories.view.viewHolders.RepoListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.latestrepositories.model.entity.Repositories> list) {
    }
    
    public final void getLastItem(int pos, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
}