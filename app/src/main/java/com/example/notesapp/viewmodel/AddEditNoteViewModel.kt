package com.example.notesapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.notesapp.data.Note
import com.example.notesapp.data.NotesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.Date

class AddEditNoteViewModel(private val repository: NotesRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(AddEditNoteUiState())
    val uiState: StateFlow<AddEditNoteUiState> = _uiState.asStateFlow()

    fun onTitleChange(title: String) {
        _uiState.value = _uiState.value.copy(title = title)
    }

    fun onContentChange(content: String) {
        _uiState.value = _uiState.value.copy(content = content)
    }

    fun loadNote(noteId: Int) {
        viewModelScope.launch {
            val note = repository.getNoteById(noteId)
            note?.let {
                _uiState.value = _uiState.value.copy(
                    title = it.title,
                    content = it.content,
                    noteId = it.id
                )
            }
        }
    }

    fun saveNote() {
        val currentState = _uiState.value
        if (currentState.title.isBlank() && currentState.content.isBlank()) {
            return
        }

        viewModelScope.launch {
            val note = if (currentState.noteId == 0) {
                // Create new note
                Note(
                    title = currentState.title,
                    content = currentState.content,
                    dateCreated = Date(),
                    dateModified = Date()
                )
            } else {
                // Update existing note
                val existingNote = repository.getNoteById(currentState.noteId)
                existingNote?.copy(
                    title = currentState.title,
                    content = currentState.content,
                    dateModified = Date()
                ) ?: return@launch
            }

            if (currentState.noteId == 0) {
                repository.insertNote(note)
            } else {
                repository.updateNote(note)
            }

            _uiState.value = _uiState.value.copy(isNoteSaved = true)
        }
    }

    fun resetSaveState() {
        _uiState.value = _uiState.value.copy(isNoteSaved = false)
    }
}

data class AddEditNoteUiState(
    val title: String = "",
    val content: String = "",
    val noteId: Int = 0,
    val isNoteSaved: Boolean = false,
    val isLoading: Boolean = false
)

class AddEditNoteViewModelFactory(private val repository: NotesRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddEditNoteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AddEditNoteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
