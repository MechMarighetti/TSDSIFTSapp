package com.example.tsdsapp.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class CalificacionesAdapter(private val materias: List<MateriaCompleta>) :

    RecyclerView.Adapter<CalificacionesAdapter.CalificacionesViewHolder>() {

        class CalificacionesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textMateria = itemView.findViewById<TextView>(R.id.tvMateria)
            val notasLayout = itemView.findViewById<ViewGroup>(R.id.notasLayout)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalificacionesViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_materia, parent, false)
            return CalificacionesViewHolder(view)
        }

        override fun onBindViewHolder(holder: CalificacionesViewHolder, position: Int) {

            val materia = materias[position]
            holder.textMateria.text = materia.materia

            holder.notasLayout.removeAllViews()

            for (nota in materia.notas) {
                val textView = TextView(holder.itemView.context).apply {
                    text = "${nota.nombreNota}: ${nota.puntaje}"
                    textSize = 16f
                }
                    holder.notasLayout.addView(textView)
            }

        }

        override fun getItemCount(): Int = materias.size



        }