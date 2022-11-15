package com.faircorp.model

import com.faircorp.Dto.HeaterDto
import retrofit2.Call
import retrofit2.http.*

interface HeaterApiService {
    @GET("heater/{id}")
    fun findById(@Path("id") id: Long): Call<HeaterDto>

    @GET("heater")
    fun findAll(@Query("sort") sort: String): Call<List<HeaterDto>>

    @PUT("heater/{id}")
    fun updateHeater(@Path("id") id: Long, @Body heater: HeaterDto): Call<HeaterDto>
}