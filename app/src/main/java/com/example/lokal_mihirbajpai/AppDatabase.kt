package com.example.lokal_mihirbajpai

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lokal_mihirbajpai.data.db.JobDao
import com.example.lokal_mihirbajpai.data.model.JobEntity

@Database(entities = [JobEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun jobDao(): JobDao
}
