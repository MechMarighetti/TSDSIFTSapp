package com.example.tsdsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class MateriaAdapter(private val materias: List<MateriaCompleta>) :
    RecyclerView.Adapter<MateriaAdapter.MateriaViewHolder>() {

    class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textMateria = itemView.findViewById<TextView>(R.id.textMateria)
            val textNota = itemView.findViewById<TextView>(R.id.textNota)
            val textEstado = itemView.findViewById<TextView>(R.id.textEstado)
            val textAsistencia = itemView.findViewById<TextView>(R.id.textAsistencia)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_nota_materia_completa, parent, false)
        return MateriaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        val materia = materias[position]
        holder.textMateria.text = materia.materia

        holder.textNota.text = materia.notas[position].puntaje.toString()
        holder.textEstado.text = estado(materia.notas[position].puntaje)
        holder.textAsistencia.text = "Asistencia: ${materia.porcentajeAsistencia}%"
    }
    override fun getItemCount(): Int  {
        return materias.size
    }

    private fun estado(nota: Int): String {
        return when {
            nota >= 7 -> "Promocionado"
            nota == 6 -> "Zona de promoción"
            nota in 4..5 -> "Regular"
            else -> "Libre"
        }


}}

