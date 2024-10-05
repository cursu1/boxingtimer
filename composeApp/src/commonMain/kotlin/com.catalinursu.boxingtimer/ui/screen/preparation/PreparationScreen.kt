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
import boxingtimer.composeapp.generated.resources.*
import boxingtimer.composeapp.generated.resources.Res
import boxingtimer.composeapp.generated.resources.preparation_time_text
import boxingtimer.composeapp.generated.resources.preparation_title_text
import boxingtimer.composeapp.generated.resources.round_time_text
import com.catalinursu.boxingtimer.ui.screen.preparation.components.*
import org.jetbrains.compose.resources.stringResource

@Composable
fun PreparationScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Scaffold(
            topBar = {
                TopBar(
                    title = stringResource(Res.string.preparation_title_text),
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

        TimeSelectionCard(title = stringResource(Res.string.preparation_time_text))
        TimeSelectionCard(title = stringResource(Res.string.round_time_text))
        TimeSelectionCard(title = stringResource(Res.string.rest_time_text))
        RoundsSelectionCard(title = stringResource(Res.string.rounds_text))

        Text(
            text = stringResource(Res.string.total_time_text),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        ActionButton(text = stringResource(Res.string.start_button_text)) {
            //TODO: Implement start button
        }
    }
}
