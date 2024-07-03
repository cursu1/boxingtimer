package com.catalinursu.boxingtimer.ui.screen.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.catalinursu.boxingtimer.ui.screen.settings.components.TopBar

@Composable
fun SettingsScreen () {
        Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Scaffold(
            topBar = {
                TopBar()
            },
            content = { paddingValues ->
                SettingsScreenContent(paddingValues)
            },
        )
    }
}

@Composable
fun SettingsScreenContent(
    paddingValues: PaddingValues
) {
    Column(
        modifier = Modifier.padding(paddingValues).fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Settings",
            modifier = Modifier.fillMaxWidth(),
        )
    }
}