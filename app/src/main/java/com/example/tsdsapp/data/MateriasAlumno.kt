package com.example.tsdsapp.data

object MateriasAlumno {
    fun generarMockData(): List<MateriaCompleta> {
        return listOf(
            MateriaCompleta(
                 "Matemáticas",
                 listOf(
                    Nota("Parcial 1", 85),
                    Nota("Parcial 2", 90),
                    Nota("Tarea Final", 95)
                ),
                92
            ),
            MateriaCompleta(
                materia = "Desarrollo de Aplicaciones Móviles",
                notas = listOf(
                    Nota("Proyecto Android", puntaje = 95),
                    Nota("Parcial 1", puntaje = 80),
                    Nota("Trabajo Práctico", puntaje = 90)
                ),
                porcentajeAsistencia = 98
                ),

            MateriaCompleta(
                materia = "Historia",
                notas = listOf(
                    Nota("Exposición", puntaje = 75),
                    Nota("Ensayo", puntaje = 88)
                ),
                porcentajeAsistencia = 85
            ),
            MateriaCompleta(
                materia = "Programación en Kotlin",
                notas = listOf(
                    Nota(nombreNota = "Proyecto Android", puntaje = 95),
                    Nota(nombreNota = "Quiz Semanal", puntaje = 80),
                    Nota(nombreNota = "Práctica de Laboratorio", puntaje = 90)
                ),
                porcentajeAsistencia = 98
            )
        )
    }
}