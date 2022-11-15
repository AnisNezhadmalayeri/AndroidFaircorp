package com.faircorp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.fairctorp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    companion object {
        const val ROOM_NAME_PARAM = "com.faircorp.roomname.attribute"
    }

    fun open_room(view: View) {
        val roomName = findViewById<EditText>(R.id.room_name).text.toString()
        val intent = Intent(this, RoomActivity::class.java).apply {
            putExtra(ROOM_NAME_PARAM, roomName)
        }
        startActivity(intent)
    }

}