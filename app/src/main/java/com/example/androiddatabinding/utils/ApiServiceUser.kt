package com.example.androiddatabinding.utils

import android.telecom.Call
import com.example.androiddatabinding.model.User
import retrofit2.http.GET

interface ApiServiceUser {
    @GET("users")
    fun ModelUser(): Call<User>

}