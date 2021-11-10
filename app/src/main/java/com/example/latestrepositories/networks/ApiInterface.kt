package com.example.latestrepositories.networks

import android.app.Application
import com.example.latestrepositories.model.entity.Repositories
import okhttp3.Cache
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.io.File


interface ApiInterface {

    companion object{
        val Base_url = "https://api.github.com/"
        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Base_url)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
    @GET("repositories?q=q")
    fun getRepoList(@Query("since") lastId:Int): Call<List<Repositories>>
}