package com.example.roominsert.data

import androidx.room.Database
import com.example.roominsert.dao.BockDao
import com.example.roominsert.model.BookEntity


@Database(

    entities = [BookEntity::class],
    version = 1,
    exportSchema = false

)

abstract class AppDatabase {

    abstract val booksDao: BockDao

    companion object {

        const val DATABASE_NAME = "db_recodigo"

    }

}