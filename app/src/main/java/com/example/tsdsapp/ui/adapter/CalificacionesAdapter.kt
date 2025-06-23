package com.example.tsdsapp.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class CalificacionesAdapter(private val materias: List<MateriaCompleta>) :

    RecyclerView.Adapter<CalificacionesAdapter.CalificacionesViewHolder>() {

        class CalificacionesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textMateria = itemView.findViewById<TextView>(R.id.tvMateria)
            val notasLayout = itemView.findViewById<ViewGroup>(R.id.notasLayout)
            val textProfesor = itemView.findViewById<TextView>(R.id.tvProfesor)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalificacionesViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_materia, parent, false)
            return CalificacionesViewHolder(view)
        }

        override fun onBindViewHolder(holder: CalificacionesViewHolder, position: Int) {

            val materia = materias[position]
            holder.textMateria.text = materia.materia
            holder.textProfesor.text = materia.profesor

            holder.notasLayout.removeAllViews()

            for (nota in materia.notas) {
                val textView = TextView(holder.itemView.context).apply {
                    text = "${nota.nombreNota}: ${nota.puntaje}"
                    textSize = 16f

                    // Obtener el estado según el puntaje
                    val estadoNota = estado(nota.puntaje)

                    // Establecer el color de fondo según el estado
                    background = when (estadoNota) {
                        "Promocionado" -> ContextCompat.getDrawable(context, R.color.Promocionado)
                        "Zona de promoción" -> ContextCompat.getDrawable(context, R.color.Zona_Promo)
                        "Regular" -> ContextCompat.getDrawable(context, R.color.Regular)
                        else -> ContextCompat.getDrawable(context, R.color.Libre)
                    }

                    // Opcional: agregar padding para mejor visualización
                    setPadding(16, 8, 16, 8)
                }
                holder.notasLayout.addView(textView)
            }

        }

        override fun getItemCount(): Int = materias.size

    fun estado(nota: Int): String {
        return when {
            nota >= 7 -> "Promocionado"
            nota == 6 -> "Zona de promoción"
            nota in 4..5 -> "Regular"
            else -> "Libre"
    }}



        }