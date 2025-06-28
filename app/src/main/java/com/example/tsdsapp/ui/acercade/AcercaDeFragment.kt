package com.example.tsdsapp.ui.acercaDe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tsdsapp.databinding.FragmentAcercadeBinding

class AcercaDeFragment : Fragment() {

    private var _binding: FragmentAcercadeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val acercaDeViewModel =
            ViewModelProvider(this).get(AcercaDeViewModel::class.java)

        _binding = FragmentAcercadeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textPoliticaUso: TextView = binding.textPoliticaUso
        val textVersion: TextView = binding.textVersion

        acercaDeViewModel.politicaUso.observe(viewLifecycleOwner) {
            textPoliticaUso.text = it
        }

        acercaDeViewModel.version.observe(viewLifecycleOwner) {
            textVersion.text = it
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
