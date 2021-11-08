package com.example.latestrepositories.networks

import com.example.latestrepositories.model.entity.Repositories
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiInterface {

    companion object{
        val Base_url = "https://private-anon-930362c58b-githubtrendingapi.apiary-mock.com/"
        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Base_url)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
    @GET("repositories?language=kotlin&since=daily&spoken_language_code=en")
    fun getRepoList(): Call<List<Repositories>>
}