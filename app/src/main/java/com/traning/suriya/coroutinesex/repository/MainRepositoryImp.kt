package com.traning.suriya.coroutinesex.repository

import com.traning.suriya.coroutinesex.model.Post
import com.traning.suriya.coroutinesex.service.RetrofitClient
import kotlinx.coroutines.Deferred
import retrofit2.Response

class MainRepositoryImp : MainRepository {
    override suspend fun getPost(): Deferred<Response<List<Post>>> {
        return RetrofitClient.jsonHolderService.getPosts()
    }
}