package com.faircorp.model

import com.faircorp.Dto.WindowDto
import retrofit2.Call
import retrofit2.http.*

interface WindowApiService {

    @GET("windows/{id}")
    fun findById(@Path("id") id: Long): Call<WindowDto>

    @GET("windows")
    fun findAll(@Query("sort") sort: String): Call<List<WindowDto>>

    @PUT("windows/{id}")
    fun updateWindow(@Path("id") id: Long, @Body window: WindowDto): Call<WindowDto>
}