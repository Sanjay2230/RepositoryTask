package com.example.latestrepositories.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.latestrepositories.model.dao.RepositoryDao
import com.example.latestrepositories.model.entity.Repositories

@Database(
    entities = [Repositories::class], version = 1, exportSchema = true
)
abstract class RoomDB : RoomDatabase() {
    abstract fun repositoryDao(): RepositoryDao
    companion object{
        private var INSTANSE: RoomDB? = null
        fun getInstance(context: Context):RoomDB{
            if (INSTANSE == null) {
                INSTANSE = Room.databaseBuilder(context, RoomDB::class.java, "Zoho_Task")
                    .allowMainThreadQueries()
                    .addMigrations(
                        MIGRATION_1_2
                    )
                    .build()
            }
            return INSTANSE as RoomDB
        }

        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE IF NOT EXISTS 'RepositoryTable' ('ID' INTEGER, 'Node_Id' TEXT, 'Name' TEXT, 'Full_Name' TEXT, 'Html_Url' TEXT, 'Fork' INTEGER, 'Url' TEXT,'Status_Url' TEXT,'Langugage_Url' TEXT,'Stargazers_Url' TEXT,'Downloads_url' TEXT)")
            }
        }
    }
}