package com.traning.suriya.coroutinesex.service

import com.traning.suriya.coroutinesex.model.Post
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface JsonHolderService {
    @GET("/posts")
    fun getPosts(): Deferred<Response<List<Post>>>
}