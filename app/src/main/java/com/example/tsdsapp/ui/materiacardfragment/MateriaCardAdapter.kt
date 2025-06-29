package com.example.tsdsapp.ui.materiacardfragment

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class MateriaCardAdapter(private val materias: List<MateriaCompleta>) :
    RecyclerView.Adapter<MateriaCardAdapter.MateriaViewHolder>() {

    class MateriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textMateria = itemView.findViewById<TextView>(R.id.textMateria)
            val textViewProfesor = itemView.findViewById<TextView>(R.id.textViewProfesor)
            val textMensaje = itemView.findViewById<TextView>(R.id.textMensaje)
            val linearHome = itemView.findViewById<LinearLayout>(R.id.linear_materia_home)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_materia, parent, false)
        return MateriaViewHolder(view)
    }


    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        val materia = materias[position]
        val estadoNota = estado(materia.notas[0].puntaje)
        val context = holder.itemView.context

        val gradientDrawable = GradientDrawable().apply {
            cornerRadius = 32f  // Bordes redondeados (en píxeles)
            colors = when (estadoNota) {
                "Promocionado" -> intArrayOf(
                    ContextCompat.getColor(holder.itemView.context, R.color.Promocionado_start),
                    ContextCompat.getColor(holder.itemView.context, R.color.Promocionado)
                )
                "Zona de promoción" -> intArrayOf(
                    ContextCompat.getColor(holder.itemView.context, R.color.Zona_Promo_start),
                    ContextCompat.getColor(holder.itemView.context, R.color.Zona_Promo)
                )
                "Regular" -> intArrayOf(
                    ContextCompat.getColor(holder.itemView.context, R.color.Regular_start),
                    ContextCompat.getColor(holder.itemView.context, R.color.Regular)
                )
                else -> intArrayOf(
                    ContextCompat.getColor(holder.itemView.context, R.color.Libre_start),
                    ContextCompat.getColor(holder.itemView.context, R.color.Libre)
                )
            }
            gradientType = GradientDrawable.LINEAR_GRADIENT
            orientation = GradientDrawable.Orientation.TL_BR
        }

        holder.linearHome.background = gradientDrawable
        holder.textMateria.setTextColor(ContextCompat.getColor(context, R.color.text_Promo))
        holder.textViewProfesor.setTextColor(ContextCompat.getColor(context, R.color.text_Promo))
        holder.textMensaje.setTextColor(ContextCompat.getColor(context, R.color.text_Promo))
        holder.textMateria.text = materia.materia

        holder.textViewProfesor.text = "Profe: ${materia.profesor}"
        holder.textMensaje.text = mensaje(materia.notas[0].puntaje)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Tu asistencia a la materia ${materia.materia} es ${materia.porcentajeAsistencia}%",Toast.LENGTH_SHORT)
                .show()
        }
    }
    override fun getItemCount(): Int  {
        return materias.size
    }


    private fun mensaje(nota: Int): String {
        return when {
            nota >= 7 -> "¡Seguí Así!"
            nota == 6 -> "¡Un esfuerzo más y llegás!"
            nota in 4..5 -> "¡Vas bien! ¡Seguí estudiando!"
            else -> "¡Un tropezón no es caída!"
        }}

        fun estado(nota: Int): String {
            return when {
                nota >= 7 -> "Promocionado"
                nota == 6 -> "Zona de promoción"
                nota in 4..5 -> "Regular"
                else -> "Libre"
            }}
}

