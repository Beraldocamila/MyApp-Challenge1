package com.example.myapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.R
import com.example.myapp.ui.components.Background
import com.example.myapp.ui.components.CustomButton
import com.example.myapp.ui.theme.MyAppTheme
import com.example.myapp.ui.theme.poppins



@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Background {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Image
            Image(
                painter = painterResource(id = R.drawable.welcomeimage),
                contentDescription = "Welcome Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Title
            Text(
                text = "Discover your\nDream Job Here",
                color = Color(0xFF1F41BB),
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                lineHeight = 45.sp,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Subtitle
            Text(
                text = "Explore all the existing job roles based on your\ninterest and study major",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                lineHeight = 20.sp,
                modifier = Modifier.width(323.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Buttons
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Login Button
                CustomButton(
                    text = "Login",
                    width = 150.dp,
                    height = 50.dp,
                    bgColor = Color(0xFF1F41BB),
                    textColor = Color.White,
                    fontSize = 20.sp,
                    onClick = { /* action */ },
                    hasShadow = true
                )

                Spacer(modifier = Modifier.width(20.dp))

                // Register Button
                CustomButton(
                    text = "Register",
                    width = 150.dp,
                    height = 50.dp,
                    bgColor = Color.White,
                    textColor = Color.Black,
                    fontSize = 20.sp,
                    onClick = { /* action */ },
                    hasShadow = false
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    MyAppTheme {
        WelcomeScreen()
    }
}