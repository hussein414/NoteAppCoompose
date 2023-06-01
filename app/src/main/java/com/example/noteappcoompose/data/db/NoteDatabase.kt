package com.example.noteappcoompose.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteappcoompose.data.model.NoteModel

@Database(entities = [NoteModel::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao
}