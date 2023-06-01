package com.example.noteappcoompose.data.case

import com.example.noteappcoompose.data.model.NoteModel
import com.example.noteappcoompose.data.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(noteModel: NoteModel) {
        repository.deleteNote(noteModel)
    }
}