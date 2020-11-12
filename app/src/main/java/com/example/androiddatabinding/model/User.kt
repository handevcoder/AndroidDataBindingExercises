package com.example.androiddatabinding.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
	val lastName: String,
	val id: Int,
	val avatar: String,
	val firstName: String,
	val email: String
) : Parcelable{
	val baseUrl get() = "https://reqres.in/api/"
}
