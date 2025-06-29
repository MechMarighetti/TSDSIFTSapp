package com.example.tsdsapp.ui.home

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tsdsapp.data.MateriasAlumno
import com.example.tsdsapp.databinding.FragmentHomeBinding
import com.example.tsdsapp.ui.adapter.LinkAdapter
import com.example.tsdsapp.ui.materiacardfragment.MateriaCardAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var sharedPreferences: SharedPreferences
    data class QuickAccessItem(val title: String, val web: String)
    val quickAccessItems = listOf(
            QuickAccessItem("SIU Guaraní", "https://guarani-autogestionagencia.bue.edu.ar/"),
            QuickAccessItem("Plan de Estudios","https://www.ifts18.edu.ar/carreras/desarrollo-de-software"),
            QuickAccessItem("Certificados", "https://www.ifts18.edu.ar/alumnos/certificados"),
            QuickAccessItem("Inscripcion a Finales", "https://www.ifts18.edu.ar/carreras/desarrollo-de-software/finalestsds")
        )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        homeViewModel.text.observe(viewLifecycleOwner) {
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedPreferences = requireActivity().getSharedPreferences("usuarioLogueado", Context.MODE_PRIVATE)

        // Obtener los datos guardados
        val nombre = sharedPreferences.getString("nombre_usuario", "Usuario no identificado")
        val dni = sharedPreferences.getString("dni_usuario", "DNI no disponible")

        binding.textNombre.text = "Alumno: ${nombre} DNI: ${dni}"
        binding.bienvenidx.text = "Bienvenidx, ${nombre}!"

        binding.cardRv.layoutManager = LinearLayoutManager(requireContext())
        binding.cardRv.adapter = MateriaCardAdapter(MateriasAlumno.generarMockData())

        binding.rvLinks.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvLinks.adapter = LinkAdapter(quickAccessItems)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}