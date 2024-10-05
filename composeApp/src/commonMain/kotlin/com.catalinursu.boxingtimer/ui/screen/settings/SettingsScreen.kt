package com.catalinursu.boxingtimer.ui.screen.settings

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import boxingtimer.composeapp.generated.resources.Res
import boxingtimer.composeapp.generated.resources.settings_title_text
import com.catalinursu.boxingtimer.ui.screen.settings.components.SettingItem
import com.catalinursu.boxingtimer.ui.screen.settings.components.TopBar
import org.jetbrains.compose.resources.stringResource

@Composable
fun SettingsScreen () {
        Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Scaffold(
            topBar = {
                TopBar(
                    title = stringResource(Res.string.settings_title_text),
                    onBackClick = { /* Handle back click */ }
                )
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
    // Sample settings data
    val settings = listOf(
        Setting("Start of round sound", listOf("Sound 1", "Sound 2", "Sound 3")),
        Setting("Half of round sound", listOf("Sound 1", "Sound 2", "Sound 3")),
        Setting("End of round sound", listOf("Sound 1", "Sound 2", "Sound 3")),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        // Settings list
        LazyColumn(
            modifier = Modifier.weight(1f) // Take available space
        ) {
            items(settings) { setting ->
                SettingItem(setting)
            }
        }

        // Spacer to push the version text to the bottom
        Spacer(modifier = Modifier.height(16.dp))

        // Version number text
        Text(
            text = "Version 1.0.0", // Change this to your actual version number
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), // Padding around the text
            textAlign = TextAlign.Center // Center the text
        )
    }
}

data class Setting(
    val name: String,
    val options: List<String>
)