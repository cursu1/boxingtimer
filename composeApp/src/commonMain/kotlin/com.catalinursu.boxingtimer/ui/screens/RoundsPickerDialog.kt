package com.catalinursu.boxingtimer.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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

                var state by remember { mutableIntStateOf(0) }
                NumberPicker(
//                    modifier = Modifier.align(Alignment.CenterHorizontally).wrapContentWidth(),
                    value = state,
                    range = 0..99,
                    onValueChange = {
                        state = it
                    }
                )

                 Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    TextButton(
                        onClick = {  },
                    ) {
                        Text("Dismiss", textAlign = TextAlign.Center)
                    }
                    TextButton(
                        onClick = {  },
                    ) {
                        Text("Confirm", textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }
}