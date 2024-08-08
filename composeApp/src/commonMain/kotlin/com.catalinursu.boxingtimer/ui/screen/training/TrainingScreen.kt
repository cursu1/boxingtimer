package com.catalinursu.boxingtimer.ui.screen.training

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.catalinursu.boxingtimer.ui.screen.training.components.RoundsCard
import com.catalinursu.boxingtimer.ui.screen.training.components.TimeCard
import com.catalinursu.boxingtimer.ui.screen.training.components.TopBar

@Composable
fun TrainingScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Scaffold(
            topBar = {
                TopBar(
                    title = "Training",
                    onBackClick = { /* Handle back click */ }
                )
            },
            content = { paddingValues ->
                TrainingScreenContent(paddingValues)
            },
        )
    }
}

@Composable
fun TrainingScreenContent(
    paddingValues: PaddingValues
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
         Row(
            modifier = Modifier
                .fillMaxWidth(), // Add padding around the row
            horizontalArrangement = Arrangement.SpaceEvenly, // Space the buttons evenly
        ) {
             RoundsCard(numberOfRounds = 5, remainingRounds = 15)
             TimeCard(time = "15:00", onPauseClick = { /* Handle pause click */ })
             RoundsCard(numberOfRounds = 5, remainingRounds = 15)
         }
    }
}