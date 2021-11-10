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

    @Query("SELECT * FROM RepositoryTable")
    fun getRepoList(): LiveData<List<Repositories>>

    @Query("DELETE FROM RepositoryTable")
    fun deleteAll()
}