package com.example.latestrepositories.model.dao

import androidx.room.Dao

import androidx.lifecycle.LiveData
import androidx.room.Insert

import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.latestrepositories.model.entity.Repositories


@Dao
interface RepositoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(cats: List<Repositories>)

    @Query("SELECT * FROM RepositoryTable ORDER BY ID DESC")
    fun getRepoList(): LiveData<List<Repositories>>

    @Query("SELECT ID FROM RepositoryTable ORDER BY ID DESC LIMIT 1")
    fun getLastRecordId(): Int?

    @Query("DELETE FROM RepositoryTable")
    fun deleteAll()
}