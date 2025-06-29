package com.example.tsdsapp.ui.materiacardfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriasAlumno
import com.example.tsdsapp.databinding.FragmentAsistenciaBinding
import com.example.tsdsapp.ui.asistencia.AsistenciaAdapter

class MateriaCardFragment : Fragment() {
    private var _binding: FragmentAsistenciaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view = inflater.inflate(R.layout.fragment_asistencia, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerMaterias)

        recyclerView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerView.adapter = AsistenciaAdapter(MateriasAlumno.generarMockData())


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