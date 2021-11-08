package com.example.latestrepositories.model.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "BuiltByTable")
data class BuiltBy(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "ID") var id:Int? = null,
    @SerializedName("href")
    @ColumnInfo(name = "Link") var href:String? = null,
    @SerializedName("avatar")
    @ColumnInfo(name = "avatar") var avatar:String? = null,
    @SerializedName("username")
    @ColumnInfo(name = "UserName") var username:String? = null
)
