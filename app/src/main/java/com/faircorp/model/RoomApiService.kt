package com.faircorp.model

import com.faircorp.Dto.RoomDto
import retrofit2.Call
import retrofit2.http.*

interface RoomApiService {

    @GET("Room/{id}")
    fun findById(@Path("id") id: Long): Call<RoomDto>

    @GET("Room")
    fun findAll(@Query("sort") sort: String): Call<List<RoomDto>>

    @PUT("Room/{id}")
    fun updateWindow(@Path("id") id: Long, @Body window: RoomDto): Call<RoomDto>

}