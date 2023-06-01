package com.example.noteappcoompose.util.tool.note

import com.example.noteappcoompose.data.model.NoteModel

sealed class NoteEvent {
    data class Order(val noteOrder: NoteOrder) : NoteEvent()
    data class DeleteNote(val noteModel: NoteModel) : NoteEvent()
    object RestoreNote : NoteEvent()
    object ToggleOrderSection : NoteEvent()
}
