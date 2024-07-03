package com.catalinursu.boxingtimer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.catalinursu.boxingtimer.ui.screen.home.MainScreen
import com.catalinursu.boxingtimer.ui.screen.home.components.DurationPickerDialog
import com.catalinursu.boxingtimer.ui.screen.home.components.RoundsPickerDialog
import com.catalinursu.boxingtimer.ui.screen.home.components.TopBar
import com.catalinursu.boxingtimer.ui.screen.settings.SettingsScreen
import com.catalinursu.boxingtimer.ui.theme.AppTheme

@Composable
fun App() {
    AppTheme(darkTheme = true) {
        RoundsPickerDialog()
    }
}