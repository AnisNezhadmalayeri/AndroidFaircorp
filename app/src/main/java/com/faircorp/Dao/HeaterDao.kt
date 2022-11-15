package com.faircorp.Dao

import androidx.room.*
import com.faircorp.model.Heater

@Dao
interface HeaterDao {
    @Query("select * from heater order by name")
    fun findAll(): List<Heater>

    @Query("select * from rwindow where id = :heaterId")
    fun findById(heaterId: Int): Heater

    @Insert
    suspend fun create(heater: Heater)

    @Update
    suspend fun update(heater: Heater): Int

    @Delete
    suspend fun delete(heater: Heater)

    @Query("delete from heater")
    suspend fun clearAll()

}