package com.example.tsdsapp.ui.asistencia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriasAlumno

class AsistenciaFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AsistenciaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_asistencia, container, false)

        recyclerView = view.findViewById(R.id.recyclerMaterias)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = AsistenciaAdapter(MateriasAlumno.generarMockData())
        recyclerView.adapter = adapter

        return view
    }
}