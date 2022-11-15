package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiServices {

    val windowsApiService : WindowApiService by lazy {

        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("http://faircorp-client-for-android.cleverapps.io/api/")
            .build()
            .create(WindowApiService::class.java)
    }

    val heaterApiService : HeaterApiService by lazy {

        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("http://faircorp-client-for-android.cleverapps.io/api/")
            .build()
            .create(HeaterApiService::class.java)

    }

    val roomApiService : RoomApiService by lazy {

        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("http://faircorp-client-for-android.cleverapps.io/api/")
            .build()
            .create(RoomApiService::class.java)

    }
}

