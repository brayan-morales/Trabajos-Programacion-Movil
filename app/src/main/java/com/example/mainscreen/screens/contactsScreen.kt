package com.example.mainscreen.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mainscreen.components.Contact

@Composable
fun ContactsScreen(navController: NavController) {

    val contacts = listOf(
        Pair(first = "Angel Luna", second = "612-123-4567")
    )

    val contactList = remember { mutableStateListOf<Pair<String, String>>() }

    LazyColumn {
        items(items = contacts) { contact ->
            Contact(
                name = contact.first,
                phone = contact.second
            )
            contactList.add(
                Pair(
                    first = contact.first,
                    second = contact.second
                )
            )
        }
    }
}

@Preview
@Composable
fun contactsScreenPreview() {
    val navController = rememberNavController()
    ContactsScreen(navController)
}