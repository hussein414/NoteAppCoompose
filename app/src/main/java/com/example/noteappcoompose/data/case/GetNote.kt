package com.example.noteappcoompose.data.case

import com.example.noteappcoompose.data.model.NoteModel
import com.example.noteappcoompose.data.repository.NoteRepository
import com.example.noteappcoompose.util.tool.note.NoteOrder
import com.example.noteappcoompose.util.tool.note.NoteOrder.*
import com.example.noteappcoompose.util.tool.OrderType.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNote(private val repository: NoteRepository) {
    operator fun invoke(noteOrder: NoteOrder = Date(Descending)): Flow<List<NoteModel>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.orderType) {
                is Ascending -> {
                    when (noteOrder) {
                        is Title -> notes.sortedBy { it.title.lowercase() }
                        is Date -> notes.sortedBy { it.timestamp }
                        is Color -> notes.sortedBy { it.color }
                    }
                }

                is Descending -> {
                    when (noteOrder) {
                        is Title -> notes.sortedByDescending { it.title.lowercase() }
                        is Date -> notes.sortedByDescending { it.timestamp }
                        is Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}