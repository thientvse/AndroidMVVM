package com.example.mvvmapplication.data.api

import com.example.mvvmapplication.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("user")
    suspend fun getUsers(): List<User>
}