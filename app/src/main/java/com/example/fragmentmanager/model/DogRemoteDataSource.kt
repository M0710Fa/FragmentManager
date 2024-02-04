package com.example.fragmentmanager.model

import retrofit2.HttpException
import retrofit2.Response

class DogRemoteDataSource {
    suspend fun getRandomDog() {
        runCatching {
            apiParse(dogsApiService.getRandomDog())
        }.onSuccess {
            Result.success(it)
        }.onFailure {
            throw it
        }
    }
}
//
//sealed interface DogResult(T) {
//    data class Success(val data: T): DogResult<T>
//}

fun <T> apiParse(response : Response<T>): T?{
    return when(response.isSuccessful) {
        true -> {
            response.body()
        }
        false -> {
            throw HttpException(response)
        }
    }
}