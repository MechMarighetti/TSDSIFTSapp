package com.example.tsdsapp.data

import com.google.type.Date

object MateriasAlumno {
    fun getNotasMateriasCompletas(): List<MateriaCompleta> {
        return listOf(
            MateriaCompleta("Matemática", "TP1", 9, 92),
            MateriaCompleta("Matemática", "Parcial 1", 7,  92),
            MateriaCompleta("Programación", "TP2", 4,75),
            MateriaCompleta("Inglés", "TP Final", 6, porcentajeAsistencia = 80),
            MateriaCompleta("Historia", "Parcial 2", 3, 60)
        )
    }
}