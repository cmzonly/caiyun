package com.heheguoji.caiyundemo.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.heheguoji.caiyundemo.R
import com.heheguoji.caiyundemo.logic.model.Place

class PlaceAdapter(private val list: List<Place>) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTop: TextView = view.findViewById(R.id.tv_top)
        val tvBottom: TextView = view.findViewById(R.id.tv_bottom)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun getItemCount() = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = list[position]
        holder.tvTop.text=place.name
        holder.tvBottom.text=place.address

    }
}