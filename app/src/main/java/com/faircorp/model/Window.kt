package com.faircorp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.faircorp.Dto.WindowDto
import com.faircorp.Dto.WindowStatus


@Entity(tableName = "rwindow")
data class Window(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo val name: String,
    @ColumnInfo(name = "room_id") val roomId: Long,
    @ColumnInfo(name = "room_name") val roomName: String,
    @ColumnInfo(name = "window_status") val windowStatus: WindowStatus
){
    fun toDto(): WindowDto =
        WindowDto(id.toLong(), name, windowStatus , roomId, roomName)
}
