package com.example.core.usecase

import com.example.core.repository.NoteRepositoryImpl

class GetNote (private val noteRepository: NoteRepositoryImpl) {
    suspend operator fun invoke(id: Long) = noteRepository.getNote(id)
}