package com.example.fragmentmanager.model

interface DogRepository {
    suspend fun getRandomDog(): String
}

class DogsRepositoryImpl: DogRepository {
    override suspend fun getRandomDog() =
}