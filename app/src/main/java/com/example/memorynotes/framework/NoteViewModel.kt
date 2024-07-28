package com.example.memorynotes.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.core.data.Note
import com.example.core.repository.NoteRepositoryImpl
import com.example.core.usecase.AddNote
import com.example.core.usecase.GetAllNotes
import com.example.core.usecase.GetNote
import com.example.core.usecase.RemoveNote
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private val coroutinesScope = CoroutineScope(Dispatchers.IO)

    val repository = NoteRepositoryImpl(RoomNoteDataSource(application))

    val useCases = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository)
    )

    val saved = MutableLiveData<Boolean>()
    val currentNote = MutableLiveData<Note?>()

    fun save(note: Note) {
        coroutinesScope.launch {
            useCases.addNote(note)
            saved.postValue(true)
        }
    }

    fun getNote(note: Long) {
        coroutinesScope.launch {
            val note = useCases.getNote(note)
            currentNote.postValue(note)
        }
    }

    fun deleteNote(note: Note) {
        coroutinesScope.launch {
            useCases.removeNote(note)
            saved.postValue(true)
        }
    }
}