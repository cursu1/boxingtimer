package com.catalinursu.boxingtimer.ui.screen.preparation.components

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
fun DurationPickerDialog() {
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
                    text = "Duration",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )

                val minutes = remember { (1..99).map { it.toString() } }
                val minutesPickerState = rememberPickerState()
                val seconds = remember { (1..59).map { it.toString() } }
                val secondsPickerState = rememberPickerState()
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text("Minutes", textAlign = TextAlign.Center, modifier = Modifier.weight(0.5f))
                        Text("Seconds", textAlign = TextAlign.Center, modifier = Modifier.weight(0.5f))
                    }
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Picker(
                            state = minutesPickerState,
                            items = minutes,
                            visibleItemsCount = 3,
                            modifier = Modifier.weight(0.5f),
                            textModifier = Modifier.padding(8.dp),
                            textStyle = TextStyle(fontSize = 32.sp)
                        )
                        Picker(
                            state = secondsPickerState,
                            items = seconds,
                            visibleItemsCount = 3,
                            modifier = Modifier.weight(0.5f),
                            textModifier = Modifier.padding(8.dp),
                            textStyle = TextStyle(fontSize = 32.sp)
                        )
                    }

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
}