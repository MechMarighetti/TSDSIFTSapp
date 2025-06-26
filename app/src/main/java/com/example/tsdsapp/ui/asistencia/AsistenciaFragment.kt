package com.example.tsdsapp.ui.asistencia

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.Materia

class AsistenciaFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AsistenciaAdapter

    private val listaMaterias = listOf(
        Materia("Lógica Computacional", 70),
        Materia("Inglés", 0),
        Materia("Análisis Matemático", 10),
        Materia("Base de Datos", 40),
        Materia("Programación", 90)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_asistencia, container, false)

        recyclerView = view.findViewById(R.id.recyclerMaterias)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = AsistenciaAdapter(listaMaterias)
        recyclerView.adapter = adapter

        view.findViewById<Button>(R.id.btnBajo).setOnClickListener {
            filtrarPorRango(0, 30)
        }

        view.findViewById<Button>(R.id.btnMedio).setOnClickListener {
            filtrarPorRango(31, 70)
        }

        view.findViewById<Button>(R.id.btnAlto).setOnClickListener {
            filtrarPorRango(71, 100)
        }

        return view
    }

    private fun filtrarPorRango(min: Int, max: Int) {
        val filtradas = listaMaterias.filter { it.porcentaje in min..max }
        adapter.filtrar(filtradas)
    }
}