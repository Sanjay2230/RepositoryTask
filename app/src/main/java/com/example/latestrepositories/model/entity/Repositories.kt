package com.example.latestrepositories.model.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "RepositoryTable")
data class Repositories(
    @PrimaryKey
    @NonNull
    @SerializedName("id")
    @ColumnInfo(name = "ID") var id: Int? = null,
    @SerializedName("node_id")
    @ColumnInfo(name = "Node_Id") var node_id:String? = null,
    @SerializedName("name")
    @ColumnInfo(name = "Name") var name:String? = null,
    @SerializedName("full_name")
    @ColumnInfo(name = "Full_Name") var full_name:String? = null,
    @SerializedName("html_url")
    @ColumnInfo(name = "Html_Url") var html_url:String? = null,
    @SerializedName("description")
    @ColumnInfo(name = "Description") var description:String? = null,
    @SerializedName("fork")
    @ColumnInfo(name = "Fork") var fork:Boolean? = null,
    @SerializedName("url")
    @ColumnInfo(name = "Url") var url:String? = null,
    @SerializedName("statuses_url")
    @ColumnInfo(name = "Status_Url") var statuses_url:String? = null,
    @SerializedName("languages_url")
    @ColumnInfo(name = "Langugage_Url") var languages_url:String? = null,
    @SerializedName("stargazers_url")
    @ColumnInfo(name = "Stargazers_Url") var stargazers_url:String? = null,
    @SerializedName("downloads_url")
    @ColumnInfo(name = "Downloads_url") var downloads_url:String? = null
)
