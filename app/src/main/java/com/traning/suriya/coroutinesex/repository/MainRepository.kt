package com.traning.suriya.coroutinesex.repository

import com.traning.suriya.coroutinesex.model.Post
import kotlinx.coroutines.Deferred
import retrofit2.Response

interface MainRepository {
    suspend fun getPost(): Deferred<Response<List<Post>>>
}