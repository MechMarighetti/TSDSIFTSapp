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
import com.example.tsdsapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedPreferences = requireActivity().getSharedPreferences("usuarioLogueado", Context.MODE_PRIVATE)

        // Obtener los datos guardados
        val nombre = sharedPreferences.getString("nombre_usuario", "Usuario no identificado")
        val dni = sharedPreferences.getString("dni_usuario", "DNI no disponible")

        // Mostrar en los TextView
        binding.tvNombre.text = "Bienvenido: $nombre"
        binding.tvDNI.text = "Tu DNI: $dni"
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}