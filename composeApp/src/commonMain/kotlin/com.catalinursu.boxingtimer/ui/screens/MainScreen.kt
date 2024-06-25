package com.catalinursu.boxingtimer.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
//        Row(
//            modifier = Modifier.padding(16.dp).fillMaxWidth(), // Add padding around the row
//            horizontalArrangement = Arrangement.SpaceEvenly // Space the buttons evenly
//        ) {
//            PressetButton(onClick = { /* Handle click for button 1 */ })
//            PressetButton(onClick = { /* Handle click for button 2 */ })
//            PressetButton(onClick = { /* Handle click for button 3 */ })
//        }
//
//        TimeSelectionCard(title = "Preparation Time")
//        TimeSelectionCard(title = "Round Time")
//        TimeSelectionCard(title = "Rest Time")
//        TimeSelectionCard(title = "Rounds")
//
//        Text(
//            text = "Total Time: 00:00",
//            modifier = Modifier
//                .fillMaxWidth(),
//            textAlign = TextAlign.Center,
//        )
//
//        ActionButton(text = "Start") {
//            //TODO: Implement start button
//        }
        DurationPickerDialog()
    }
}