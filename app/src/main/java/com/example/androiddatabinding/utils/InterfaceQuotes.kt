package com.example.androiddatabinding.utils

import com.example.androiddatabinding.model.User
import retrofit2.http.GET

interface InterfaceQuotes {
    @GET("posts")
    suspend fun showList(): List<User>
}