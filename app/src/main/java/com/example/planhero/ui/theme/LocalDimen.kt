package com.example.planhero.ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val LocalDimen = compositionLocalOf {
    Dimensions()
}

data class Dimensions(
    val horizontalPadding: Dp = 12.dp,
    val columnSpaceBy: Dp = 16.dp
)