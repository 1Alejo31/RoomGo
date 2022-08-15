package com.example.roominsert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.example.roominsert.data.AppDatabase
import com.example.roominsert.model.BookEntity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database =
            Room.databaseBuilder(application, AppDatabase::class.java, AppDatabase.DATABASE_NAME)
                .allowMainThreadQueries().build()

        sabeBooks(database)

        val btnConsulta = findViewById<Button>(R.id.btnConsultar)
        btnConsulta.setOnClickListener {
            val books = database.bookDao.getAllBooks()
            val tvListBooks = findViewById<TextView>(R.id.tvListBooks)
            books.forEach{ book ->
                tvListBooks.append("${book.id}, ${book.titulo}, ${book.author}, ${book.pubData}\n")
            }
        }
    }

    private fun sabeBooks(database: AppDatabase){
        val book1 = BookEntity(titulo = "Mobby Dick", author = "Herman Melville", pubData = "1851")
        val book2 = BookEntity(titulo = "Mobby Dick2", author = "Herman Melville2", pubData = "1851")
        val book3 = BookEntity(titulo = "Mobby Dick3", author = "Herman Melville3", pubData = "1851")

        database.bookDao.insert(book1)
        database.bookDao.insert(book2)
        database.bookDao.insert(book3)

    }
}