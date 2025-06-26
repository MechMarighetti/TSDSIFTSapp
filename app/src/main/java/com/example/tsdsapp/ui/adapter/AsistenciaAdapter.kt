package com.example.tsdsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class AsistenciaAdapter(private val materias: List<MateriaCompleta>) :

    RecyclerView.Adapter<AsistenciaAdapter.AsistenciaViewHolder>() {

    class AsistenciaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMateria = itemView.findViewById<TextView>(R.id.tvMateria)
        val tvAsistencia = itemView.findViewById<TextView>(R.id.tvAsistencia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsistenciaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_asistencia2, parent, false)
        return AsistenciaViewHolder(view)
    }

    override fun onBindViewHolder(holder: AsistenciaViewHolder, position: Int) {

        val materia = materias[position]
        holder.tvMateria.text = materia.materia
        holder.tvAsistencia.text = materia.porcentajeAsistencia.toString()

    }

    override fun getItemCount(): Int = materias.size



}