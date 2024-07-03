package com.catalinursu.boxingtimer.ui.screen.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun RoundsPickerDialog() {
    Dialog(onDismissRequest = { }) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Rounds",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )

                val rounds = remember { (1..99).map { it.toString() } }
                val roundsPickerState = rememberPickerState()

                Picker(
                    state = roundsPickerState,
                    items = rounds,
                    visibleItemsCount = 3,
                    textModifier = Modifier.padding(8.dp),
                    textStyle = TextStyle(fontSize = 32.sp)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Box(
                        modifier = Modifier.weight(0.5f),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(Icons.Default.Close, contentDescription = "Dismiss", modifier = Modifier.size(64.dp))
                        }
                    }

                    Box(
                        modifier = Modifier.weight(0.5f),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(
                            onClick = { },

                            ) {
                            Icon(Icons.Default.Done, contentDescription = "Confirm", modifier = Modifier.size(64.dp))
                        }
                    }
                }
            }
        }
    }
}