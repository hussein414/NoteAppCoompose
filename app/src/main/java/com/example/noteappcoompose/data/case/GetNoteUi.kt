package com.example.noteappcoompose.data.case

import com.example.noteappcoompose.data.model.NoteModel
import com.example.noteappcoompose.data.repository.NoteRepository

class GetNoteUi(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int):
            NoteModel? = repository.getNoteById(id)
}