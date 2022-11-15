package com.faircorp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faircorp.model.ApiServices
import com.fairctorp.R

class WindowActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)

        val param = intent.getStringExtra(RoomActivity.WINDOW_NAME_PARAM)
        val windowName = findViewById<TextView>(R.id.window_status)
        windowName.text = param

        val recyclerView = findViewById<RecyclerView>(R.id.windows_list)
        val adapter = WindowAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        runCatching { ApiServices.windowsApiService.findAll(windowName.toString()).execute() }
            .onSuccess { adapter.update(it.body() ?: emptyList()) }
            .onFailure {
                Toast.makeText(this, "Error on windows loading $it", Toast.LENGTH_LONG).show()
            }
    }
}
