package com.example.tsdsapp.data

object MateriasAlumno {
    fun generarMockData(): List<MateriaCompleta> {
        return listOf(
            MateriaCompleta(
                 "Matemáticas",
                "Carina Reynoso",
                 listOf(
                    Nota("Parcial 1", 5),
                    Nota("Parcial 2", 9),
                    Nota("Tarea Final", 9)
                ),
                92,
                "Tu examen final es el 08/07"


            ),
            MateriaCompleta(
                materia = "Desarrollo de Aplicaciones Móviles",
                "Alejandro Peña",
                notas = listOf(
                    Nota("Proyecto Android", puntaje = 7),
                    Nota("Parcial 1", puntaje = 8),
                    Nota("Trabajo Práctico", puntaje = 9)
                ),
                porcentajeAsistencia = 98,
                vencimientos = "tu entrega de MVVM final vence el 02/07"
                ),

            MateriaCompleta(
                materia = "Taller de Comunicación",
                "Carolina Ferrero",
                notas = listOf(
                    Nota("Exposición", puntaje = 4),
                    Nota("Ensayo", puntaje = 3)
                ),
                porcentajeAsistencia = 85,
                vencimientos = "tu tp de clase final vence el 01/07"
            ),
            MateriaCompleta(
                materia = "Programación en Kotlin",
                "Andrés Ferreyra",
                notas = listOf(
                    Nota(nombreNota = "Proyecto Android", puntaje = 6),
                    Nota(nombreNota = "Quiz Semanal", puntaje = 6),
                    Nota(nombreNota = "Práctica de Laboratorio", puntaje = 9)
                ),
                porcentajeAsistencia = 98,
                vencimientos = "tu exposicion  final es el 02/07"

            ),
            MateriaCompleta(
                    materia = "Técnicas de Programación",
                        "Pablo Perez",
                        notas = listOf(
                        Nota(nombreNota = "Examen Parcial", puntaje = 8),
                        Nota(nombreNota = "Proyecto Final", puntaje = 2),
                        Nota(nombreNota = "Ejercicios Semanales", puntaje = 10)
                    ),
                        porcentajeAsistencia = 98,
                        vencimientos = "tu examen final es el 04/07"
        ),
        MateriaCompleta(
            materia = "Administración de Base de Datos",
            "Emanuel Odstrcil",
            notas = listOf(
                Nota(nombreNota = "Consultas SQL", puntaje = 9),
                Nota(nombreNota = "Modelo Relacional", puntaje = 7)
            ),
            porcentajeAsistencia = 87,
            vencimientos = "tu examen final vence el 04/07"

        ),
        MateriaCompleta(
            materia = "Elementos de Análisis Matemático",
            "Carina Reynoso",
            notas = listOf(
                Nota(nombreNota = "Teoría", puntaje = 2),
                Nota(nombreNota = "Prácticas", puntaje = 5)
            ),
            porcentajeAsistencia = 80,
            vencimientos = "tu trabajo final vence el 25/06"

        ),
        MateriaCompleta(
            materia = "Lógica Computacional",
            "Horacio Duarte",
            notas = listOf(
                Nota(nombreNota = "Circuitos Lógicos", puntaje = 1),
                Nota(nombreNota = "Examen Final", puntaje = 5)
            ),
            porcentajeAsistencia = 93,
            vencimientos = "tu examen final es el 04/07"

        ),
        MateriaCompleta(
            materia = "Desarrollo de Sistemas Orientados a Objetos",
            "Eduardo Iberti",
            notas = listOf(
                Nota(nombreNota = "Patrones de Diseño", puntaje = 8),
                Nota(nombreNota = "Proyecto UML", puntaje = 9)
            ),
            porcentajeAsistencia = 23,
            vencimientos = "tu tp final es el 04/07"

        ),
        MateriaCompleta(
            materia = "Modelado y Diseño de Software",
            "Sabrina Colman",
            notas = listOf(
                Nota(nombreNota = "Diagramas", puntaje = 7),
                Nota(nombreNota = "Caso de Estudio", puntaje = 9)
            ),
            porcentajeAsistencia = 45,
            vencimientos = "tu nota final se entrega el  26/07"

        ),
        MateriaCompleta(
            materia = "Estadística y Probabilidad para el Desarrollo de Software",
            "Irene Gutierrez",
            notas = listOf(
                Nota(nombreNota = "Análisis de Datos", puntaje = 3),
                Nota(nombreNota = "Examen Teórico", puntaje = 7)
            ),
            porcentajeAsistencia = 14,
            vencimientos = "tu trabajo final integrador vence el 02/07"

        ),
        MateriaCompleta(
            materia = "Inglés",
            "Andrea Smith Frias",
            notas = listOf(
                Nota(nombreNota = "Presentación Oral", puntaje = 9),
                Nota(nombreNota = "Examen Escrito", puntaje = 8)
            ),
            porcentajeAsistencia = 98,
            vencimientos = "tu examen final vence el 01/07"

        ),
        MateriaCompleta(
            materia = "Práctica Profesional I",
            "Silvia Figueroa",
            notas = listOf(
                Nota(nombreNota = "Informe Final", puntaje = 9),
                Nota(nombreNota = "Evaluación del Tutor", puntaje = 3)
            ),
            porcentajeAsistencia = 100,
            vencimientos = "la exposion final es el dia  05/07"

        ),
        MateriaCompleta(
            materia = "Desarrollo de Aplicaciones para Dispositivos Móviles",
            "Javier Juarez Mansilla",
            notas = listOf(
                Nota(nombreNota = "App Android", puntaje = 7),
                Nota(nombreNota = "Prototipo iOS", puntaje = 5)
            ),
            porcentajeAsistencia = 58,
            vencimientos = "tu examen final vence el 04/07"

        ))
    }
}