package com.example.tsdsapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nombre = findViewById<EditText>(R.id.etUsuario)
        val dni = findViewById<EditText>(R.id.etDNI)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        sharedPreferences = getSharedPreferences("usuarioLogueado", MODE_PRIVATE)

        buttonLogin.setOnClickListener {

            val nombreUsuario = nombre.text.toString()
            val dniUsuario = dni.text.toString()

            if(nombreUsuario.isNotEmpty()&&dniUsuario.isNotEmpty()) {
            sharedPreferences.edit().apply {
                putString("nombre_usuario", nombreUsuario)
                putString("dni_usuario", dniUsuario)
                apply()
            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}}