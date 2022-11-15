package com.faircorp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faircorp.Dto.WindowDto
import com.fairctorp.R

class WindowAdapter : RecyclerView.Adapter<WindowAdapter.WindowViewHolder>() {

    inner class WindowViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val window_name: TextView = view.findViewById(R.id.window_name)
        val window_status: TextView = view.findViewById(R.id.window_status)
        val window_room: TextView = view.findViewById(R.id.window_room)
    }

    private val items = mutableListOf<WindowDto>()

    fun update(windows: List<WindowDto>) {
        items.clear()
        items.addAll(windows)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WindowViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.windows_list_item, parent, false)
        return WindowViewHolder(view)
    }

    override fun onBindViewHolder(holder: WindowViewHolder, position: Int) {
        val windows = items[position]
        holder.apply {
            window_name.text = windows.name
            window_status.text = windows.windowStatus.toString()
            window_room.text = windows.roomName
        }
    }
}