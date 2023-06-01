package com.example.noteappcoompose.di

import android.app.Application
import androidx.room.Room
import com.example.noteappcoompose.data.case.AddNote
import com.example.noteappcoompose.data.case.DeleteNote
import com.example.noteappcoompose.data.case.GetNote
import com.example.noteappcoompose.data.case.GetNoteUi
import com.example.noteappcoompose.data.db.NoteDatabase
import com.example.noteappcoompose.data.model.NoteUseCases
import com.example.noteappcoompose.data.repository.NoteRepository
import com.example.noteappcoompose.data.repository.NoteRepositoryImplementation
import com.example.noteappcoompose.util.tool.Constance.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNoteDatabase(app: Application): NoteDatabase =
        Room.databaseBuilder(app, NoteDatabase::class.java, DATABASE_NAME).build()


    @Provides
    @Singleton
    fun providesNoteRepository(db: NoteDatabase): NoteRepository =
        NoteRepositoryImplementation(db.noteDao)


    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository): NoteUseCases =
        NoteUseCases(
            getNote = GetNote(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNoteUi = GetNoteUi(repository)
        )
}