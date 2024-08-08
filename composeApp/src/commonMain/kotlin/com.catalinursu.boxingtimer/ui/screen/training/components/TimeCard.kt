package com.catalinursu.boxingtimer.ui.screen.training.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.sharp.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TimeCard(
    time: String,
    onPauseClick: () -> Unit
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(150.dp)  // Fixed width for all cards
            .height(150.dp) // Fixed height for all cards
            .padding(start = 8.dp, end = 8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Time",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,

            )

            Text(
                text = time,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,

            )

            IconButton(
                onClick = onPauseClick,
                modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Sharp.PlayArrow,
                    contentDescription = "Pause",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}