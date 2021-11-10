package com.example.latestrepositories.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.latestrepositories.database.RoomDB
import com.example.latestrepositories.model.entity.Repositories
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RepositoryViewModel(application: Application):AndroidViewModel(application) {
    private val db: RoomDB = RoomDB.getInstance(application)

    fun insert(list:List<Repositories>){
        return db.repositoryDao().insert(list)
    }

    fun getRepoList(onSuccess:(listRepo:LiveData<List<Repositories>>) -> Unit){
        viewModelScope.launch {
            val list = db.repositoryDao().getRepoList()
            withContext(Dispatchers.Main){
                onSuccess(list)
            }
        }
    }
}