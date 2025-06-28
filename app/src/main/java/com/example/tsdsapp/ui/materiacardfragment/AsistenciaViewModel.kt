package com.example.tsdsapp.ui.materiacardfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AsistenciaViewModel  : ViewModel()  {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Asistencia Fragment"
    }

    val text: LiveData<String> = _text
}