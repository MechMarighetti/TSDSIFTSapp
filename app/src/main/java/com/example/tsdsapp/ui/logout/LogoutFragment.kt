package com.example.tsdsapp.ui.logout

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tsdsapp.LoginActivity
import com.example.tsdsapp.databinding.FragmentGalleryBinding

import com.example.tsdsapp.databinding.FragmentLogoutBinding
import com.example.tsdsapp.ui.gallery.GalleryViewModel

class LogoutFragment : Fragment() {

private var _binding: FragmentLogoutBinding? = null
private val binding get() = _binding!!


override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View {

    val logoutViewModel =
        ViewModelProvider(this).get(LogoutViewModel::class.java)

    _binding = FragmentLogoutBinding.inflate(inflater, container, false)
    val root: View = binding.root


    return root
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.btnLogout.setOnClickListener{
        val intent = Intent(requireContext(), LoginActivity::class.java)
        startActivity(intent)

    }
}



override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}}