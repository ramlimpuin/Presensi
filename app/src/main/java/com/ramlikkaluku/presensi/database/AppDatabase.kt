package com.ramlikkaluku.presensi.database

import androidx.room.Database
import com.ramlikkaluku.presensi.model.ModelDatabase
import androidx.room.RoomDatabase
import com.ramlikkaluku.presensi.database.dao.DatabaseDao


@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}