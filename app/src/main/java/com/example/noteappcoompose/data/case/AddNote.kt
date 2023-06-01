package com.example.noteappcoompose.data.case

import com.example.noteappcoompose.data.model.NoteModel
import com.example.noteappcoompose.data.repository.NoteRepository
import com.example.noteappcoompose.util.tool.InvalidNoteException

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(noteModel: NoteModel) {
        if (noteModel.title.isBlank()) {
            throw InvalidNoteException("the title of the note cant be empty")
        }
        if (noteModel.content.isBlank()) {
            throw InvalidNoteException("the content of the note cant be empty")
        }
        repository.insertNote(noteModel)
    }
}