package com.example.AgungSeptiana203040102.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.AgungSeptiana203040102.model.PendaftaranAwal

@Database(entities = [PendaftaranAwal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pendaftaranAwalDao(): PendaftaranAwalDao
}