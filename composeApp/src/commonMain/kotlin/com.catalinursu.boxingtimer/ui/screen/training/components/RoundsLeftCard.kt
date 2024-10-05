package com.catalinursu.boxingtimer.ui.screen.training.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun RoundsLeftCard(roundsLeft: Int, totalRounds: Int) {
    Card(
        modifier = Modifier
            .padding(16.dp) // Padding around the button
            .size(150.dp),
        shape = RoundedCornerShape(16.dp) // Rounded corners
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp), // Padding inside the card
            contentAlignment = Alignment.Center // Center content inside the card
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Rounds\n3 / 15",
                textAlign = TextAlign.Center, // Center the text
                style = MaterialTheme.typography.titleLarge // Style of the text
            )
        }
    }
}