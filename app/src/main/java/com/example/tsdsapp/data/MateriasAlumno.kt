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
            ),
                    MateriaCompleta(
                    materia = "Técnicas de Programación",
            notas = listOf(
                Nota(nombreNota = "Examen Parcial", puntaje = 88),
                Nota(nombreNota = "Proyecto Final", puntaje = 92),
                Nota(nombreNota = "Ejercicios Semanales", puntaje = 85)
            ),
            porcentajeAsistencia = 98
        ),
        MateriaCompleta(
            materia = "Administración de Base de Datos",
            notas = listOf(
                Nota(nombreNota = "Consultas SQL", puntaje = 90),
                Nota(nombreNota = "Modelo Relacional", puntaje = 78)
            ),
            porcentajeAsistencia = 87
        ),
        MateriaCompleta(
            materia = "Elementos de Análisis Matemático",
            notas = listOf(
                Nota(nombreNota = "Teoría", puntaje = 82),
                Nota(nombreNota = "Prácticas", puntaje = 75)
            ),
            porcentajeAsistencia = 80
        ),
        MateriaCompleta(
            materia = "Lógica Computacional",
            notas = listOf(
                Nota(nombreNota = "Circuitos Lógicos", puntaje = 91),
                Nota(nombreNota = "Examen Final", puntaje = 85)
            ),
            porcentajeAsistencia = 93
        ),
        MateriaCompleta(
            materia = "Desarrollo de Sistemas Orientados a Objetos",
            notas = listOf(
                Nota(nombreNota = "Patrones de Diseño", puntaje = 89),
                Nota(nombreNota = "Proyecto UML", puntaje = 94)
            ),
            porcentajeAsistencia = 96
        ),
        MateriaCompleta(
            materia = "Modelado y Diseño de Software",
            notas = listOf(
                Nota(nombreNota = "Diagramas", puntaje = 87),
                Nota(nombreNota = "Caso de Estudio", puntaje = 90)
            ),
            porcentajeAsistencia = 91
        ),
        MateriaCompleta(
            materia = "Estadística y Probabilidad para el Desarrollo de Software",
            notas = listOf(
                Nota(nombreNota = "Análisis de Datos", puntaje = 83),
                Nota(nombreNota = "Examen Teórico", puntaje = 77)
            ),
            porcentajeAsistencia = 85
        ),
        MateriaCompleta(
            materia = "Inglés",
            notas = listOf(
                Nota(nombreNota = "Presentación Oral", puntaje = 95),
                Nota(nombreNota = "Examen Escrito", puntaje = 88)
            ),
            porcentajeAsistencia = 98
        ),
        MateriaCompleta(
            materia = "Práctica Profesional I",
            notas = listOf(
                Nota(nombreNota = "Informe Final", puntaje = 90),
                Nota(nombreNota = "Evaluación del Tutor", puntaje = 93)
            ),
            porcentajeAsistencia = 100
        ),
        MateriaCompleta(
            materia = "Desarrollo de Aplicaciones para Dispositivos Móviles",
            notas = listOf(
                Nota(nombreNota = "App Android", puntaje = 97),
                Nota(nombreNota = "Prototipo iOS", puntaje = 85)
            ),
            porcentajeAsistencia = 94
        ))
    }
}