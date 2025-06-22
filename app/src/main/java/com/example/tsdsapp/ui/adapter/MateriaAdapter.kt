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
        val tvMateria: TextView = itemView.findViewById(R.id.tvMateria)
        val tvNota: TextView = itemView.findViewById(R.id.tvNota)
        val tvAsistencia: TextView = itemView.findViewById(R.id.tvAsistencia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_materia, parent, false)
        return MateriaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        val materia = materias[position]
        holder.tvMateria.text = materia.materia
        holder.tvNota.text = "${materia.nombreNota}: ${materia.puntaje}"
        holder.tvAsistencia.text = "Asistencia: ${materia.porcentajeAsistencia}%"
    }

    override fun getItemCount(): Int = materias.size
}

