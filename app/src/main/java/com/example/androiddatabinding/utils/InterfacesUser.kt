package com.example.androiddatabinding.utils

import com.example.androiddatabinding.model.User
import com.example.androiddatabinding.model.Users
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface InterfacesUser {
    @GET("users")
     fun showList(@Query ("id") id: Int): Call<Users>
}