package com.example.noteappcoompose.util.tool

import android.webkit.ConsoleMessage

sealed class UiEvent {
    data class ShowSnackBar(val message: String) : UiEvent()
    object SaveNote : UiEvent()
}
