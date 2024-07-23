package com.example.core.usecase

import com.example.core.repository.NoteRepositoryImpl

class GetAllNotes (private val noteRepository: NoteRepositoryImpl) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}