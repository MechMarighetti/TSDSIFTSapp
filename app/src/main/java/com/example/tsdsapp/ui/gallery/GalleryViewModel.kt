package com.example.tsdsapp.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tsdsapp.data.MateriaCompleta
import com.example.tsdsapp.data.MateriasAlumno.generarMockData

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val materias: LiveData<List<MateriaCompleta>> = liveData {
        emit(generarMockData()) // Usamos la función mock
    }


    val text: LiveData<String> = _text
}