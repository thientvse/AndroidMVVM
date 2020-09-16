package com.example.mvvmapplication.data.repository

import com.example.mvvmapplication.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}