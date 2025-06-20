package com.example.tsdsapp.data


data class MateriaCompleta(
    val materia: String,
    val notas: List<Nota>,
    val porcentajeAsistencia: Int
)
