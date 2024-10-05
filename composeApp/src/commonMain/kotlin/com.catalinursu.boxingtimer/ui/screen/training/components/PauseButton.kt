package com.catalinursu.boxingtimer.ui.screen.training.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import boxingtimer.composeapp.generated.resources.Res
import boxingtimer.composeapp.generated.resources.pause_button_text
import org.jetbrains.compose.resources.stringResource

@Composable
fun PauseButton(
    modifier: Modifier = Modifier,
    onPauseClick: () -> Unit
) {
    Button(
        onClick = onPauseClick,
        modifier = modifier,
        shape = RoundedCornerShape(16.dp) // Rounded corners for the square button
    ) {
       Text(text = stringResource(Res.string.pause_button_text))
    }
}