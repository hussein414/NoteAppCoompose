package com.example.noteappcoompose.util.tool.note

import com.example.noteappcoompose.data.model.NoteModel
import com.example.noteappcoompose.util.tool.OrderType

data class NoteState(
    val notes: List<NoteModel> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
