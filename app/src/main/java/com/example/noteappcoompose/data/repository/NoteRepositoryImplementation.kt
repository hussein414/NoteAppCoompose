package com.example.noteappcoompose.data.repository

import com.example.noteappcoompose.data.db.NoteDao
import com.example.noteappcoompose.data.model.NoteModel
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImplementation(private val noteDao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<NoteModel>> = noteDao.getNotes()

    override suspend fun getNoteById(id: Int): NoteModel? = noteDao.getNoteById(id)

    override suspend fun insertNote(note: NoteModel) = noteDao.insertNote(note)

    override suspend fun deleteNote(note: NoteModel) = noteDao.deleteNote(note)
}