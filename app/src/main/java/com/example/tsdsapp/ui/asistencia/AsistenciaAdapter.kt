package com.example.tsdsapp.ui.asistencia

import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.data.MateriaCompleta

class AsistenciaAdapter(private var lista: List<MateriaCompleta>) :
    RecyclerView.Adapter<AsistenciaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
   /*     val nombre: TextView = itemView.findViewById(R.id.textNombre)
        val porcentaje: TextView = itemView.findViewById(R.id.textPorcentaje)
        val barra: ProgressBar = itemView.findViewById(R.id.progressBar)*/
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_asistencia, parent, false) // <-- acá el cambio
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       /* val materia = lista[position]
        holder.nombre.text = materia.nombre
        holder.porcentaje.text = if (materia.porcentaje == 0)
            "Aún no se cargó la asistencia" else "${materia.porcentaje}%"
        holder.barra.progress = materia.porcentaje

        val color = when {
            materia.porcentaje <= 30 -> Color.RED
            materia.porcentaje <= 70 -> Color.parseColor("#FFA500")
            else -> Color.GREEN
        }
        holder.barra.progressDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
    }



    fun filtrar(nuevaLista: List<Materia>) {
        lista = nuevaLista
        notifyDataSetChanged()*/
    }
    override fun getItemCount(): Int = lista.size
}