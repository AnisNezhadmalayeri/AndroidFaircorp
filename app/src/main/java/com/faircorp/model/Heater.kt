package com.faircorp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.faircorp.Dto.HeaterStatus
import com.faircorp.Dto.HeaterDto

@Entity
data class Heater(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo val name: String,
    @ColumnInfo(name = "window_status") val heaterStatus: HeaterStatus,
    @ColumnInfo(name = "power") val power: Int,
    @ColumnInfo(name = "room_name") val roomName: String,
    ){
    fun toDto(): HeaterDto =
        HeaterDto(id.toLong(), name, heaterStatus , power, roomName)
}
