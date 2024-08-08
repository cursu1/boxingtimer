package com.catalinursu.boxingtimer.ui.screen.preparation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.catalinursu.boxingtimer.ui.screen.preparation.components.*

@Composable
fun PreparationScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Scaffold(
            topBar = {
                TopBar(
                    title = "Preparation",
                    onSettingsClick = { /* Handle back click */ }
                )
            },
            content = { paddingValues ->
                PreparationScreenContent(paddingValues)
            },
        )
    }
}

@Composable
fun PreparationScreenContent(
    paddingValues: PaddingValues
) {
    Column(
        modifier = Modifier.padding(paddingValues).fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Modifier.padding(16.dp).fillMaxWidth(), // Add padding around the row
            horizontalArrangement = Arrangement.SpaceEvenly // Space the buttons evenly
        ) {
            PresetButton(onClick = { /* Handle click for button 1 */ })
            PresetButton(onClick = { /* Handle click for button 2 */ })
            PresetButton(onClick = { /* Handle click for button 3 */ })
        }

        TimeSelectionCard(title = "Preparation Time")
        TimeSelectionCard(title = "Round Time")
        TimeSelectionCard(title = "Rest Time")
        RoundsSelectionCard(title = "Rounds")

        Text(
            text = "Total Time: 00:00",
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        ActionButton(text = "Start") {
            //TODO: Implement start button
        }
    }
}
