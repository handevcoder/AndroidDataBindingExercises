package com.example.androiddatabinding.model

import com.google.gson.annotations.SerializedName

data class Users(

	@SerializedName("last_name")
	val lastName: String? = null,

	@SerializedName("id")
	val id: Int? = null,

	@SerializedName("avatar")
	val avatar: String? = null,

	@SerializedName("first_name")
	val firstName: String? = null,

	@SerializedName("email")
	val email: String? = null
)
