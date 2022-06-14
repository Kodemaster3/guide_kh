package com.example.guide_app_kh

import retrofit2.Call
import retrofit2.http.GET

interface ApiMessages {

    @GET("messages1.json")
    fun messages(): Call<List<Message>>
}