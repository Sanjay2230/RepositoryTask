package com.example.latestrepositories.model.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "BuiltByTable")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/example/latestrepositories/model/entity/BuiltBy;", "", "id", "", "href", "", "avatar", "username", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getHref", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsername", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/latestrepositories/model/entity/BuiltBy;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class BuiltBy {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ID")
    @androidx.room.PrimaryKey()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Link")
    @com.google.gson.annotations.SerializedName(value = "href")
    private final java.lang.String href = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "avatar")
    @com.google.gson.annotations.SerializedName(value = "avatar")
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UserName")
    @com.google.gson.annotations.SerializedName(value = "username")
    private final java.lang.String username = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.latestrepositories.model.entity.BuiltBy copy(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.NonNull()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String href, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BuiltBy() {
        super();
    }
    
    public BuiltBy(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.NonNull()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String href, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHref() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
}