package com.faircorp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faircorp.model.ApiServices
import com.fairctorp.R

class RoomActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val param = intent.getStringExtra(MainActivity.ROOM_NAME_PARAM)
        val roomName = findViewById<TextView>(R.id.room_name)
        roomName.text = param

        val recyclerView = findViewById<RecyclerView>(R.id.rooms_list)
        val adapter = RoomAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        runCatching { ApiServices.roomApiService.findAll(roomName.toString()).execute() }
            .onSuccess { adapter.update(it.body() ?: emptyList()) }
            .onFailure {
                Toast.makeText(this, "Error on windows loading $it", Toast.LENGTH_LONG).show()
            }

    }

    companion object {
        const val WINDOW_NAME_PARAM = "com.faircorp.windowname.attribute"
        const val HEATER_NAME_PARAM = "com.faircorp.heatername.attribute"
    }

    fun open_window(view: View) {
        val windowName = findViewById<EditText>(R.id.window_status).text.toString()
        val intent = Intent(this, WindowActivity::class.java).apply {
            putExtra(WINDOW_NAME_PARAM, windowName)
        }
        startActivity(intent)
    }

    fun open_heater(view: View) {
        val heaterName = findViewById<EditText>(R.id.heater_name).text.toString()
        val intent = Intent(this, HeaterActivity::class.java).apply {
            putExtra(HEATER_NAME_PARAM, heaterName)
        }
        startActivity(intent)
    }
}