package com.faircorp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faircorp.Dto.RoomDto
import com.fairctorp.R

class RoomAdapter : RecyclerView.Adapter<RoomAdapter.RoomViewHolder>() {

    inner class RoomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val room: TextView = view.findViewById(R.id.room_name_activity)
        val floor: TextView = view.findViewById(R.id.room_floor)
        val current_temperature: TextView = view.findViewById(R.id.current_temperature_room)
        val target_temperature: TextView = view.findViewById(R.id.target_temperature_room)

    }

    private val items = mutableListOf<RoomDto>()

    fun update(rooms: List<RoomDto>) {
        items.clear()
        items.addAll(rooms)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rooms_list_items, parent, false)
        return RoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        val rooms = items[position]
        holder.apply {
            room.text = rooms.name
            floor.text = rooms.floor.toString()
            current_temperature.text = rooms.current_temperature.toString()
            target_temperature.text = rooms.target_temperature.toString()
        }
    }
}
