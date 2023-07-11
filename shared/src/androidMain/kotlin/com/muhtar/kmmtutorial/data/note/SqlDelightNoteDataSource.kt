package com.muhtar.kmmtutorial.data.note

import com.muhtar.kmmtutorial.database.NoteDatabase
import com.muhtar.kmmtutorial.domain.note.Note
import com.muhtar.kmmtutorial.domain.note.NoteDataSource
import com.muhtar.kmmtutorial.domain.time.DateTimeUtil

class SqlDelightNoteDataSource(db: NoteDatabase): NoteDataSource {
    private val queries = db.noteQueries

    override suspend fun insertNote(note: Note) {
        queries.insertNote(
            id = note.id,
            title = note.title,
            content = note.content,
            colorHex = note.colorHex,
            created = DateTimeUtil.toEpochMillis(note.created)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun getAllNotes(): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNoteById(id: Long) {
        TODO("Not yet implemented")
    }
}