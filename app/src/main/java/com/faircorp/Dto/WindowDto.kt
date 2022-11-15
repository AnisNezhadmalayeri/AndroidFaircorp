package com.faircorp.Dto

data class WindowDto (
    val id: Long,
    val name: String? = null,
    val windowStatus: WindowStatus? = null,
    val roomId: Long? = null,
    val roomName: String? = null,
)
