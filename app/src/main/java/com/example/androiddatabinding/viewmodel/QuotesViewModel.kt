package com.example.androiddatabinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddatabinding.model.Quote

class QuotesViewModel : ViewModel() {
    private val _data = MutableLiveData<List<Quote>>()
    val data : LiveData<List<Quote>>
        get() = _data

    private val _response = MutableLiveData<String>()
    val response : LiveData<String>
        get() = _response
}