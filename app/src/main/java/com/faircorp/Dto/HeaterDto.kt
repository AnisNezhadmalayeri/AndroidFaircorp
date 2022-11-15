package com.faircorp.Dto

data class HeaterDto (
    val id: Long,
    val name: String? = null,
    val heaterStatus: HeaterStatus? = null,
    val power: Int? = null,
    val roomName: String? = null,
)