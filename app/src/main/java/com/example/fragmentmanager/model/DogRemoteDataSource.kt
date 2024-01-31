package com.example.fragmentmanager.model

import retrofit2.Response

class DogRemoteDataSource {
    suspend fun getRandomDog(): Result<Dog> {
    }
}

fun <T> apiParse(data : Response<T>): T{
}