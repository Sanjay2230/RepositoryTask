package com.example.latestrepositories.model.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "RepositoryTable")
data class Repositories(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    var id: Int? = null,
    @SerializedName("author")
    @ColumnInfo(name = "Author") var author:String? = null,
    @SerializedName("name")
    @ColumnInfo(name = "Name") var name:String? = null,
    @SerializedName("avatar")
    @ColumnInfo(name = "Avatar") var avatar:String? = null,
    @SerializedName("url")
    @ColumnInfo(name = "Url") var url:String? = null,
    @SerializedName("description")
    @ColumnInfo(name = "Description") var description:String? = null,
    @SerializedName("language")
    @ColumnInfo(name = "Language") var language:String? = null,
    @SerializedName("languageColor")
    @ColumnInfo(name = "LanguageColor") var languageColor:String? = null,
    @SerializedName("stars")
    @ColumnInfo(name = "Stars") var stars:Int? = null,
    @SerializedName("forks")
    @ColumnInfo(name = "Forks") var forks:Int? = null,
    @SerializedName("currentPeriodStars")
    @ColumnInfo(name = "CurrentPeriodStars") var currentPeriodStars:Int? = null,
    @SerializedName("builtBy")
//    @ColumnInfo(name = "BuiltUserId") val builtUserId:Int? = null,

    @Ignore var builtBy: List<BuiltBy>? = null
)
