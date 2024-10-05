package com.catalinursu.boxingtimer.ui.screen.settings.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.catalinursu.boxingtimer.ui.screen.settings.Setting

@Composable
fun SettingItem(setting: Setting) {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(setting.options.first()) }

    // Using Row to align the Text, IconButton, and Dropdown button in a single line
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically // Align items vertically centered
    ) {
        // Setting name
        Text(
            text = setting.name,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f) // Allow the text to take up available space
        )

        // Play Arrow IconButton
        IconButton(
            onClick = { /* Handle play action here */ },
            modifier = Modifier.padding(start = 8.dp) // Space between text and icon
        ) {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = "Play",
                tint = MaterialTheme.colorScheme.primary // Set the tint color if needed
            )
        }

        // Dropdown Button
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.padding(start = 8.dp) // Space between icon and button
        ) {
            Text(text = selectedOption)
        }

        // Dropdown Menu
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            setting.options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        selectedOption = option
                        expanded = false // Close the dropdown after selection
                    }
                )
            }
        }
    }
}