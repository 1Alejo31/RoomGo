package com.example.roominsert.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roominsert.model.BookEntity

@Dao
interface BockDao {

    @Insert
    fun insert(book: BookEntity)

    @Query("SELECT * FROM Libros")
    fun getAllBooks(): List<BookEntity>

}