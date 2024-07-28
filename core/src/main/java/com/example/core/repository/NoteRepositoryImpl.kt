package com.example.core.repository

import com.example.core.data.Note

class NoteRepositoryImpl (private val dataSource: NoteDataSource) {

    suspend fun add(note: Note) {
        dataSource.add(note)
    }

    suspend fun getNote(id: Long) : Note? {
        return dataSource.get(id)
    }

    suspend fun getAllNotes() : List<Note> {
         return dataSource.getAll()
    }

    suspend fun removeNote(note: Note) : Int {
        return dataSource.remove(note)
    }
}