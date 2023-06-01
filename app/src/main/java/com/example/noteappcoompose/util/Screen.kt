package com.example.noteappcoompose.util

sealed class Screen(val route: String) {
    object NoteScreen : Screen("notes_screen")
    object AddEditeNoteScreen : Screen("add_edit_note_screen")
}
