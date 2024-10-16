package com.example.retrofitprueba.api

import com.google.gson.annotations.SerializedName

data class PostModel(
    @SerializedName("userID")
    var userId:Int,
    @SerializedName("id")
    var id:Int,
    @SerializedName("title")
    var title:String,
    @SerializedName("body")
    var body:String
)
