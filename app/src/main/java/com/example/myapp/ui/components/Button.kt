package com.example.myapp.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    text: String,
    width: Dp,
    height: Dp,
    bgColor: Color,
    textColor: Color,
    fontSize: TextUnit,
    onClick: () -> Unit,
    hasShadow: Boolean = true
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = textColor
        ),
        modifier = Modifier
            .width(width)
            .height(height),
        shape = RoundedCornerShape(10.dp),
        elevation = if (hasShadow) {
            ButtonDefaults.buttonElevation( // con sombra
                defaultElevation = 10.dp,
                pressedElevation = 5.dp
            )
        } else {
            ButtonDefaults.buttonElevation( // sin sombra
                defaultElevation = 0.dp,
                pressedElevation = 0.dp
            )
        }
    ) {
        Text(
            text = text,
            fontSize = fontSize
        )
    }
}