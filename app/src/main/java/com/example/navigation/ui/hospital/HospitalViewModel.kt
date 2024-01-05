package com.example.navigation.ui.hospital

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HospitalViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Hospital Fragment"
    }
    val text: LiveData<String> = _text
}