package com.catalinursu.boxingtimer

import androidx.compose.runtime.Composable
import com.catalinursu.boxingtimer.ui.screen.preparation.PreparationScreen
import com.catalinursu.boxingtimer.ui.screen.training.TrainingScreen
import com.catalinursu.boxingtimer.ui.theme.AppTheme

@Composable
fun App() {
    AppTheme(darkTheme = true) {
        TrainingScreen()
    }
}