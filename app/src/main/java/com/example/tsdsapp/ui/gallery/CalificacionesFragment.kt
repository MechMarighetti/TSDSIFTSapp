package com.example.tsdsapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta
import com.example.tsdsapp.data.MateriasAlumno
import com.example.tsdsapp.ui.adapter.MateriaAdapter

class CalificacionesFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MateriaAdapter
    private lateinit var materiasList: List<MateriaCompleta>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calificaciones, container, false)

        recyclerView = view.findViewById(R.id.recyclerMaterias)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        materiasList = MateriasAlumno.getNotasMateriasCompletas()
        adapter = MateriaAdapter(materiasList)
        recyclerView.adapter = adapter

        return view
    }
}
