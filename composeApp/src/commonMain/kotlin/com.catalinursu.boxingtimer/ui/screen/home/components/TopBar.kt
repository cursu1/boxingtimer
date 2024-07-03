package com.catalinursu.boxingtimer.ui.screen.home.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text("Boxing Timer") },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Default.Settings, contentDescription = "Settings")
            }
        }
    )
}