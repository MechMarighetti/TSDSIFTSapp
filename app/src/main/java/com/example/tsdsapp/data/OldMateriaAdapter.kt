package com.example.tsdsapp.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R

class OldMateriaAdapter(private val lista: List<MateriaCompleta>) :
    RecyclerView.Adapter<OldMateriaAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textMateria = view.findViewById<TextView>(R.id.textMateria)
        val textNota = view.findViewById<TextView>(R.id.textNota)
        val textEstado = view.findViewById<TextView>(R.id.textEstado)
        val textAsistencia = view.findViewById<TextView>(R.id.textAsistencia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_nota_materia_completa, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lista[position]

        holder.textMateria.text = item.materia
        holder.textNota.text = item.notas[position].puntaje.toString()
        holder.textEstado.text = estado(item.notas[position].puntaje)
        holder.textAsistencia.text = "Asistencia: ${item.porcentajeAsistencia}%"
    }

    override fun getItemCount(): Int = lista.size

    private fun estado(nota: Int): String {
        return when {
            nota >= 7 -> "Promocionado"
            nota == 6 -> "Zona de promoción"
            nota in 4..5 -> "Regular"
            else -> "Libre"
        }
    }
}