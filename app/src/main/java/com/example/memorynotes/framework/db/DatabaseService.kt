package com.example.memorynotes.framework.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NoteEntity::class], version = 1)
abstract class DatabaseService : RoomDatabase() {
}