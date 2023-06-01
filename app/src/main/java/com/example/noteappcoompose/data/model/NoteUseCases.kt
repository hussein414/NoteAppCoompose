package com.example.noteappcoompose.data.model

import com.example.noteappcoompose.data.case.AddNote
import com.example.noteappcoompose.data.case.DeleteNote
import com.example.noteappcoompose.data.case.GetNote
import com.example.noteappcoompose.data.case.GetNoteUi

data class NoteUseCases(
    val getNote: GetNote,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNoteUi: GetNoteUi,
)
