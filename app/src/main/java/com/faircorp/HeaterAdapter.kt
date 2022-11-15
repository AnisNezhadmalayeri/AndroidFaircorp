package com.faircorp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faircorp.Dto.HeaterDto
import com.fairctorp.R

class HeaterAdapter : RecyclerView.Adapter<HeaterAdapter.HeaterViewHolder>() {

    inner class HeaterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val heater_name: TextView = view.findViewById(R.id.heater_name)
        val heater_status: TextView = view.findViewById(R.id.heater_status)
        val heater_room: TextView = view.findViewById(R.id.heater_room)
        val heater_power: TextView = view.findViewById(R.id.heater_power)
    }

    private val items = mutableListOf<HeaterDto>()

    fun update(heaters: List<HeaterDto>) {
        items.clear()
        items.addAll(heaters)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaterAdapter.HeaterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.heaters_list_items, parent, false)
        return HeaterViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeaterAdapter.HeaterViewHolder, position: Int) {
        val heaters = items[position]
        holder.apply {
            heater_name.text = heaters.name
            heater_status.text = heaters.heaterStatus.toString()
            heater_room.text = heaters.roomName
            heater_power.text = heaters.power.toString()
        }
    }
}