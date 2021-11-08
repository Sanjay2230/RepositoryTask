package com.example.latestrepositories.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latestrepositories.R
import android.util.Log
import androidx.lifecycle.ViewModelProviders.of
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latestrepositories.model.entity.Repositories
import com.example.latestrepositories.networks.ApiInterface
import com.example.latestrepositories.view.adapters.RepoListAdapter
import com.example.latestrepositories.viewmodel.RepositoryViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var repositoryViewModel: RepositoryViewModel
    private lateinit var repoListAdapter: RepoListAdapter
    private lateinit var repoList: ArrayList<Repositories>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        objectInitialization()
        showRepoList()
//        networkCall()
    }

    fun objectInitialization(){
        repositoryViewModel = of(this)[RepositoryViewModel::class.java]
        repoListAdapter = RepoListAdapter(this)
    }

    fun showRepoList(){
        repo_list.adapter = repoListAdapter
        repo_list.layoutManager = LinearLayoutManager(this)
        repo_list.addItemDecoration(DividerItemDecoration(this, VERTICAL))
        repoList = ArrayList()
        repositoryViewModel.getRepoList {
            it.observe(this, { v ->
                repoList = v as ArrayList<Repositories>
                repoListAdapter.setData(repoList)
            })
        }
    }

    fun networkCall(){
        val apiInterface = ApiInterface.create().getRepoList()
        apiInterface.enqueue(object : Callback<List<Repositories>> {
            override fun onResponse(call: Call<List<Repositories>>, response: Response<List<Repositories>>) {
                if (response.isSuccessful) {
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