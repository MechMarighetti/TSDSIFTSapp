package com.example.tsdsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsdsapp.R
import com.example.tsdsapp.ui.home.HomeFragment

class LinkAdapter(private var quickaccess: List<HomeFragment.QuickAccessItem>)    :
    RecyclerView.Adapter<LinkAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val nombre: TextView = itemView.findViewById(R.id.texto_link)
            val url: TextView = itemView.findViewById(R.id.URLtext)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val vista = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_link, parent, false) // <-- acá el cambio
            return ViewHolder(vista)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
             val quick = quickaccess[position]
             holder.nombre.text = quick.title
             holder.url.text = quick.web}

        override fun getItemCount(): Int = quickaccess.size
    }
