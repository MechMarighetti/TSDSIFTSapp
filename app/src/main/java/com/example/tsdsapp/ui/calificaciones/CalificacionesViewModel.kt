package com.example.tsdsapp.ui.calificaciones

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalificacionesViewModel  : ViewModel()  {

    private val _text = MutableLiveData<String>().apply {
        value = "Aca esta Calificaciones Fragment"
    }


    val text: LiveData<String> = _text
}