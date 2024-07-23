package com.example.core.usecase

import com.example.core.data.Note
import com.example.core.repository.NoteRepositoryImpl

class RemoveNote (private val noteRepository: NoteRepositoryImpl) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}