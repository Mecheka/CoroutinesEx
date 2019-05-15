package com.traning.suriya.coroutinesex.repository

import com.traning.suriya.coroutinesex.model.Post
import com.traning.suriya.coroutinesex.service.RetrofitClient
import retrofit2.Response

class MainRepositoryImp : MainRepository {
    override suspend fun getPost(): Response<List<Post>> {
        return RetrofitClient.makeRetrofitService().getPosts().await()
    }
}