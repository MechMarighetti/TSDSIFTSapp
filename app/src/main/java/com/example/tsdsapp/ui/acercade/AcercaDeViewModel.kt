package com.example.tsdsapp.ui.acercaDe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcercaDeViewModel : ViewModel() {
    private val _politicaUso = MutableLiveData<String>().apply {
        value = "Esta aplicación está destinada exclusivamente a estudiantes de IFTS 18 Su objetivo es brindar acceso seguro y personal a información académica como calificaciones y asistencia.\n" +
                "\n" +
                "El acceso requiere una cuenta personal. Está prohibido compartir credenciales o manipular datos. Toda la información mostrada es confidencial y debe ser utilizada únicamente con fines académicos.\n" +
                "\n" +
                "La institución se compromete a proteger la privacidad de los datos personales y no compartirá información con terceros sin consentimiento.\n" +
                "\n" +
                "El uso indebido de la app puede derivar en la suspensión de la cuenta. Al utilizar esta aplicación, el usuario acepta estos términos."
    }
    val politicaUso: LiveData<String> = _politicaUso

    private val _version = MutableLiveData<String>().apply {
        value = "Versión: 1.0.0"
    }
    val version: LiveData<String> = _version
}

