package com.traning.suriya.coroutinesex.repository

import com.traning.suriya.coroutinesex.model.Post
import retrofit2.Response

interface MainRepository {
    suspend fun getPost(): Response<List<Post>>
}