package com.example.roominsert.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Libros")
data class BookEntity(

    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "titulo") @NonNull val titulo: String,
    @ColumnInfo(name = "author") @NonNull val author: String,
    @ColumnInfo(name = "pubData") @NonNull val pubData: String

)
