package com.example.notesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notesapp.data.NotesDatabase
import com.example.notesapp.data.NotesRepository
import com.example.notesapp.ui.screens.AddEditNoteScreen
import com.example.notesapp.ui.screens.NotesScreen
import com.example.notesapp.viewmodel.AddEditNoteViewModel
import com.example.notesapp.viewmodel.AddEditNoteViewModelFactory
import com.example.notesapp.viewmodel.NotesViewModel
import com.example.notesapp.viewmodel.NotesViewModelFactory

@Composable
fun NotesNavigation(
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current
    val database = NotesDatabase.getDatabase(context)
    val repository = NotesRepository(database.noteDao())

    NavHost(
        navController = navController,
        startDestination = "notes_list"
    ) {
        composable("notes_list") {
            val notesViewModel: NotesViewModel = viewModel(
                factory = NotesViewModelFactory(repository)
            )

            NotesScreen(
                onNavigateToAddNote = {
                    navController.navigate("add_edit_note/0")
                },
                onNavigateToEditNote = { noteId ->
                    navController.navigate("add_edit_note/$noteId")
                },
                notesViewModel = notesViewModel
            )
        }

        composable("add_edit_note/{noteId}") { backStackEntry ->
            val noteId = backStackEntry.arguments?.getString("noteId")?.toIntOrNull() ?: 0
            val addEditViewModel: AddEditNoteViewModel = viewModel(
                factory = AddEditNoteViewModelFactory(repository)
            )

            AddEditNoteScreen(
                noteId = noteId,
                onNavigateBack = {
                    navController.popBackStack()
                },
                addEditNoteViewModel = addEditViewModel
            )
        }
    }
}
