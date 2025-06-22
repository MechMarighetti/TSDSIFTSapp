package com.example.tsdsapp.ui.asistencia

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.data.MateriaCompleta
import com.example.tsdsapp.data.MateriasAlumno
import com.example.tsdsapp.databinding.FragmentAsistenciaBinding
import com.example.tsdsapp.ui.adapter.MateriaAdapter

class AsistenciaFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    private var _binding: FragmentAsistenciaBinding? = null
    private val binding get() = _binding!!
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAsistenciaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = binding.recyclerAsistencia
        recyclerView.adapter = MateriaAdapter(MateriasAlumno.generarMockData())
        return root
    }

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    sharedPreferences = requireActivity().getSharedPreferences("usuarioLogueado", Context.MODE_PRIVATE)

    // Obtener los datos guardados
    val nombre = sharedPreferences.getString("nombre_usuario", "Usuario no identificado")
    val dni = sharedPreferences.getString("dni_usuario", "DNI no disponible")


}
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    }