package com.catalinursu.boxingtimer.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import kotlin.math.abs

data class Minutes (
    val minutes: Int,
    val seconds: Int
)


@Composable
fun MinutesNumberPicker(
    modifier: Modifier = Modifier,
    value: Minutes,
    leadingZero: Boolean = true,
    minutesRange: Iterable<Int> = (0..59),
    secondsRange: Iterable<Int> = (0..59),
    hoursDivider: (@Composable () -> Unit)? = null,
    minutesDivider: (@Composable () -> Unit)? = null,
    onValueChange: (Minutes) -> Unit,
    dividersColor: Color = MaterialTheme.colorScheme.primary,
    textStyle: TextStyle = LocalTextStyle.current,
) {
 Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        NumberPicker(
            modifier = Modifier.weight(1f),
            label = {
                "${if (leadingZero && abs(it) < 10) "0" else ""}$it"
            },
            value = value.minutes,
            onValueChange = {
                onValueChange(value.copy(minutes = it))
            },
            dividersColor = dividersColor,
            textStyle = textStyle,
            range = minutesRange
        )

        hoursDivider?.invoke()

        NumberPicker(
            modifier = Modifier.weight(1f),
            label = {
                "${if (leadingZero && abs(it) < 10) "0" else ""}$it"
            },
            value = value.seconds,
            onValueChange = {
                onValueChange(value.copy(seconds = it))
            },
            dividersColor = dividersColor,
            textStyle = textStyle,
            range = secondsRange
        )

        minutesDivider?.invoke()
    }
}