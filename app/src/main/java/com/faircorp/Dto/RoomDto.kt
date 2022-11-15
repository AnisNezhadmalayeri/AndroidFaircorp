package com.faircorp.Dto

data class RoomDto (
    val id: Long,
    val floor: Int? = null,
    val name: String? = null,
    val current_temperature: Double? = null,
    val target_temperature: Double? = null,
)