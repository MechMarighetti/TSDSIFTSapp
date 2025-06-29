package com.example.tsdsapp.ui.asistencia

import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class AsistenciaAdapter(private var lista: List<MateriaCompleta>) :
    RecyclerView.Adapter<AsistenciaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.textNombre)
        val porcentaje: TextView = itemView.findViewById(R.id.textPorcentaje)
        val barra: ProgressBar = itemView.findViewById(R.id.progressBar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_asistencia, parent, false) // <-- acá el cambio
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val materia = lista[position]
        holder.nombre.text = materia.materia
        holder.porcentaje.text = if (materia.porcentajeAsistencia == 0)
            "Aún no se cargó la asistencia" else "${materia.porcentajeAsistencia}%"
        materia.porcentajeAsistencia.also { holder.barra.progress = it }
        val context = holder.itemView.context


        val color = when {
            materia.porcentajeAsistencia <= 30 -> ContextCompat.getDrawable(context, R.color.Libre)
            materia.porcentajeAsistencia <= 60 -> ContextCompat.getDrawable(context, R.color.Regular)
            materia.porcentajeAsistencia <= 70 -> ContextCompat.getDrawable(context, R.color.Zona_Promo)
            else ->  ContextCompat.getDrawable(context, R.color.Promocionado)

        }
        holder.barra.progressDrawable = color
    }

    override fun getItemCount(): Int = lista.size

}