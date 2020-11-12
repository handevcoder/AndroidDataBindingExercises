package com.example.androiddatabinding.utils

import android.telecom.Call
import com.example.androiddatabinding.model.Quote
import retrofit2.http.GET

interface ApiServiceQuotes {
    @GET("posts")
    fun ModelQuotes(): Call<Quote>
}