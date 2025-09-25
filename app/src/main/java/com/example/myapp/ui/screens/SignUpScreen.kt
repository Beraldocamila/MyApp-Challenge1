package com.example.myapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.components.Background
import com.example.myapp.ui.components.CommonTextField
import com.example.myapp.ui.components.CustomButton
import com.example.myapp.ui.components.Social
import com.example.myapp.ui.theme.poppins


@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Background {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title
            Text(
                text = "Create Account",
                color = Color(0xFF1F41BB),
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                lineHeight = 45.sp,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))

            // Subtitle
            Text(
                text = "Create an account so you can explore all the\nexisting jobs",
                fontFamily = poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                lineHeight = 25.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(60.dp))

            CommonTextField(
                value = "",
                onValueChange = {},
                placeholderText = "Email"
            )

            CommonTextField(
                value = "",
                onValueChange = {},
                placeholderText = "Password"
            )

            CommonTextField(
                value = "",
                onValueChange = {},
                placeholderText = "Confirm Password"
            )


            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(
                text = "Sign up",
                width = 357.dp,
                height = 50.dp,
                bgColor = Color(0xFF1F41BB),
                textColor = Color.White,
                fontSize = 20.sp,
                onClick = { /* action */ },
                hasShadow = true
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(
                text = "Already have an account",
                width = 250.dp,
                height = 41.dp,
                bgColor = Color.White,
                textColor = Color(0xFF494949),
                fontSize = 14.sp,
                onClick = { /* action */ },
                hasShadow = false
            )

            Spacer(modifier = Modifier.height(60.dp))
            Social()
        }
    }
}


