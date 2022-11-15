package com.faircorp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.faircorp.Dto.HeaterStatus
import com.faircorp.Dto.RoomDto
import com.faircorp.Dto.WindowDto

@Entity
data class Room(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "floor") val floor: Int,
    @ColumnInfo val name: String,
    @ColumnInfo(name = "current_temperature") val current_temperature: Double,
    @ColumnInfo(name = "target_temperature") val target_temperature: Double,
    ){
    fun toDto(): RoomDto =
        RoomDto(id.toLong(), floor, name, current_temperature , target_temperature)
}
