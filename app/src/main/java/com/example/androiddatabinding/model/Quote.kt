package com.example.androiddatabinding.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Quote(
	val id: Int,
	val title: String,
	val body: String,
	val userId: Int
) : Parcelable{
	val BASE_URL= "http://jsonplaceholder.typicode.com/"
}

