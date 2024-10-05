package com.catalinursu.boxingtimer

import androidx.compose.runtime.Composable
import com.catalinursu.boxingtimer.ui.screen.settings.SettingsScreen
import com.catalinursu.boxingtimer.ui.theme.AppTheme

@Composable
fun App() {
    AppTheme(darkTheme = true) {
        SettingsScreen()
    }
}