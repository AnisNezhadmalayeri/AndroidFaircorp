package com.faircorp.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.faircorp.model.Room

@Dao
interface RoomDao {
    @Query("select * from room order by name")
    fun findAll(): List<Room>

    @Query("select * from rwindow where id = :roomId")
    fun findById(roomId: Int): Room

    @Insert
    suspend fun create(room: Room)

    @Update
    suspend fun update(room: Room): Int

    @Delete
    suspend fun delete(room: Room)

    @Query("delete from room")
    suspend fun clearAll()

}