package com.catalinursu.boxingtimer.ui.screen.training.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun TrainingDurationText() {
    // Create a state for the remaining time
    val totalTime = 15000L // 15 seconds
    var remainingTime by remember { mutableStateOf(totalTime) }

    // Animation for the progress (shrinking circle)
    val progress by animateFloatAsState(
        targetValue = remainingTime.toFloat() / totalTime.toFloat(),
        animationSpec = tween(durationMillis = 1000, easing = LinearEasing), label = ""
    )

    // Timer countdown using LaunchedEffect
    LaunchedEffect(remainingTime) {
        if (remainingTime > 0) {
            delay(1000L) // 1 second delay
            remainingTime -= 1000L
        } else {
            // Reset the timer when it reaches 0
            remainingTime = totalTime
        }
    }

    // Draw the circle and timer
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(200.dp) // Set size for the circle
    ) {
        val color = MaterialTheme.colorScheme.primary

        // Use Canvas to draw the circular progress
        Canvas(modifier = Modifier.size(200.dp)) {
            // Draw the circle outline based on the remaining progress
            drawArc(
                color = color,
                startAngle = 270f, // Start from the top
                sweepAngle = 360 * progress, // Adjust the arc based on progress
                useCenter = false,
                style = Stroke(8.dp.toPx(), cap = StrokeCap.Round) // Stroke style for the outline
            )
        }

        // Display the text in the center
        Text(
            text = "Training: ${remainingTime / 1000} s",
            style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.primary),
            textAlign = TextAlign.Center,
        )
    }
}