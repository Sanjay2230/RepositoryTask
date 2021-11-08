package com.example.latestrepositories.networks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/latestrepositories/networks/ApiInterface;", "", "getRepoList", "Lretrofit2/Call;", "", "Lcom/example/latestrepositories/model/entity/Repositories;", "Companion", "app_debug"})
public abstract interface ApiInterface {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.latestrepositories.networks.ApiInterface.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repositories?language=kotlin&since=daily&spoken_language_code=en")
    public abstract retrofit2.Call<java.util.List<com.example.latestrepositories.model.entity.Repositories>> getRepoList();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/latestrepositories/networks/ApiInterface$Companion;", "", "()V", "Base_url", "", "getBase_url", "()Ljava/lang/String;", "create", "Lcom/example/latestrepositories/networks/ApiInterface;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String Base_url = "https://private-anon-930362c58b-githubtrendingapi.apiary-mock.com/";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBase_url() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.latestrepositories.networks.ApiInterface create() {
            return null;
        }
    }
}