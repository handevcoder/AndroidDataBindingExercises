package com.example.androiddatabinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddatabinding.model.User
import com.example.androiddatabinding.model.Users
import com.example.androiddatabinding.utils.ApiServiceUser
import retrofit2.Call
import retrofit2.Response

class UserViewModel : ViewModel() {
    private val _data = MutableLiveData<List<User>>()
    val data : LiveData<List<User>>
        get() = _data

    private val _response = MutableLiveData<String>()
    val response : LiveData<String>
        get() = _response

    fun getAllUser(){
        ApiServiceUser().api().showList(1).enqueue(object: retrofit2.Callback<Users>{
            override fun onResponse(call: Call<Users>, response: Response<Users>) {
                var data = response.body()
            }

            override fun onFailure(call: Call<Users>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}