package com.example.latestrepositories.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latestrepositories.R
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelProviders.of
import androidx.lifecycle.get
import com.example.latestrepositories.model.entity.Repositories
import com.example.latestrepositories.networks.ApiInterface
import com.example.latestrepositories.viewmodel.RepositoryViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var repositoryViewModel: RepositoryViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repositoryViewModel = ViewModelProviders.of(this)[RepositoryViewModel::class.java]
        networkCall()
    }

    fun networkCall(){
        val apiInterface = ApiInterface.create().getRepoList()
        apiInterface.enqueue(object : Callback<List<Repositories>> {
            override fun onResponse(call: Call<List<Repositories>>, response: Response<List<Repositories>>) {
                if (response.isSuccessful) {
//                    repository.insert(response.body())
                    Log.d("Response", "OnScuccess: " + response.message())
                    Log.d("Response", "OnScuccess: " + response.body().toString())
                    repositoryViewModel.insert(response.body()!!)
                }
            }

            override fun onFailure(call: Call<List<Repositories>>, t: Throwable) {
                Log.d("main", "onFailure: " + t.message)
            }
        })
    }
}