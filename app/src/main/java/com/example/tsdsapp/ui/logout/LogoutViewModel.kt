package com.example.tsdsapp.ui.logout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogoutViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenidx a la app"
    }

    val text: LiveData<String> = _text
}