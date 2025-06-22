package com.example.tsdsapp.ui.calificaciones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta
import com.example.tsdsapp.data.MateriasAlumno
import com.example.tsdsapp.databinding.FragmentCalificacionesBinding
import com.example.tsdsapp.databinding.FragmentGalleryBinding
import com.example.tsdsapp.ui.adapter.CalificacionesAdapter
import com.example.tsdsapp.ui.adapter.MateriaAdapter

class CalificacionesFragment : Fragment() {


    private var _binding: FragmentCalificacionesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calificaciones, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerMaterias)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CalificacionesAdapter(MateriasAlumno.generarMockData())


        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

