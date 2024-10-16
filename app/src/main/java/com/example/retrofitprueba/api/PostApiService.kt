package com.example.retrofitprueba.api

import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getUserPost():ArrayList<PostModel>
}