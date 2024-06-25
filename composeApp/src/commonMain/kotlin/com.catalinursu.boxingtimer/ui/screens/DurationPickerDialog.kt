package com.catalinursu.boxingtimer.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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

                var state by remember { mutableStateOf<Minutes>(Minutes(0, 0)) }
                MinutesNumberPicker(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp), leadingZero = true,

                    dividersColor = MaterialTheme.colorScheme.error,
                    value = state,
                    onValueChange = {
                        state = it
                    },
                    hoursDivider = {
                        Text(
                            modifier = Modifier.size(24.dp),
                            textAlign = TextAlign.Center,
                            text = ":"
                        )
                    }
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    TextButton(
                        onClick = { },
                    ) {
                        Text("Dismiss", textAlign = TextAlign.Center)
                    }
                    TextButton(
                        onClick = { },
                    ) {
                        Text("Confirm", textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }
}