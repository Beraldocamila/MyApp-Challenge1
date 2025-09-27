package com.example.myapp.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
            .height(height)
            .then(
                if (hasShadow) {
                    Modifier.shadow(
                        elevation = 10.dp,
                        shape = RoundedCornerShape(10.dp),
                        ambientColor = Color(0xFFCBD6FF),
                        spotColor = Color(0xFFCBD6FF)
                    )
                } else {
                    Modifier
                }
            ),
        shape = RoundedCornerShape(10.dp),
        elevation = null
    ) {
        Text(
            text = text,
            fontSize = fontSize
        )
    }
}