package com.example.core.repository

import com.example.core.data.Note

class NoteRepositoryImpl (private val dataSource: NoteDataSource) {

    suspend fun add(note: Note) {
        dataSource.add(note)
    }

    suspend fun getNote(id: Long) {
        dataSource.get(id)
    }

    suspend fun getAllNotes() {
        dataSource.getAll()
    }

    suspend fun removeNote(note: Note) {
        dataSource.remove(note)
    }
}