package com.example.AgungSeptiana203040102.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.AgungSeptiana203040102.model.PendaftaranAwal

@Dao
interface PendaftaranAwalDao {
    @Query("SELECT * FROM PendaftaranAwal")
    fun loadAll(): LiveData<List<PendaftaranAwal>>
    @Query("SELECT * FROM PendaftaranAwal WHERE id = :id")
    fun find(id: String): PendaftaranAwal?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: PendaftaranAwal)
    @Delete
    fun delete(item: PendaftaranAwal)
}