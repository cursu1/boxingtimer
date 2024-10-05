package com.catalinursu.boxingtimer.ui.screen.training

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.catalinursu.boxingtimer.ui.screen.training.components.PauseButton
import com.catalinursu.boxingtimer.ui.screen.training.components.RoundsLeftCard
import com.catalinursu.boxingtimer.ui.screen.training.components.TopBar
import com.catalinursu.boxingtimer.ui.screen.training.components.TrainingDurationText

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
    // Column to position the Text in the center and the Button at the bottom
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.TopCenter) // Align the button at the top center
                .fillMaxWidth()
                .padding(16.dp), // Padding around the button
            horizontalArrangement = Arrangement.Center // Center the button horizontally
        ) {
            RoundsLeftCard(roundsLeft = 3, totalRounds = 15)
        }

        // Text centered vertically and horizontally
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center, // Center the text vertically
            horizontalAlignment = Alignment.CenterHorizontally // Center the text horizontally
        ) {
            TrainingDurationText()
        }

        // Center the button at the bottom
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter) // Align the button at the bottom center
                .padding(16.dp) // Padding around the button
                .size(150.dp) // Set the size of the button (can be adjusted)
        ) {
            PauseButton(
                modifier = Modifier.fillMaxSize(),
                onPauseClick = { /* Handle pause click */ }
            )
        }
    }
}