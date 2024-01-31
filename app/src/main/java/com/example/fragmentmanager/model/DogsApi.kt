package com.example.fragmentmanager.model

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET


private val baseURL = "https://dog.ceo/api/breeds/image/random"

private val retrofit = Retrofit.Builder()
    .baseUrl(baseURL)
    .build()

val dogsApiService = retrofit.create(DogsApi::class.java)

interface DogsApi {
    @GET("/")
    suspend fun getRandomDog(): Response<Dog>
}