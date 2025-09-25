package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.poppins

@Composable
fun CommonTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholderText: String,
    fontSize: TextUnit = 16.sp,
    width: Float = 357f,
    height: Float = 55f,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholderText,
                fontFamily = poppins,
                fontWeight = FontWeight.Medium,
                fontSize = fontSize,
                color = Color(0xFF626262),
            )
        },
        singleLine = true,
        modifier = Modifier
            .width(width.dp)
            .height(height.dp),
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFF1F4FF),
            unfocusedContainerColor = Color(0xFFF1F4FF),
            focusedIndicatorColor = Color(0xFF1F41BB),
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        )
    )
    Spacer(modifier = Modifier.height(25.dp))
}