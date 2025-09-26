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
import androidx.navigation.NavController
import com.example.myapp.ui.components.Background
import com.example.myapp.ui.components.CommonTextField
import com.example.myapp.ui.components.CustomButton
import com.example.myapp.ui.components.Social
import com.example.myapp.ui.theme.poppins


@Composable
fun LoginScreen(modifier: Modifier, navController: NavController) {
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
                text = "Login here",
                color = Color(0xFF1F41BB),
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                lineHeight = 45.sp,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(25.dp))

            // Subtitle
            Text(
                text = "Welcome back you've\nbeen missed",
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                lineHeight = 30.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(90.dp))

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

            Text(
                text = "Forgot your password?",
                fontFamily = poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color(0xFF1F41BB),
                textAlign = TextAlign.Right,
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(
                text = "Sign in",
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
                text = "Create New Account",
                width = 200.dp,
                height = 41.dp,
                bgColor = Color.White,
                textColor = Color(0xFF494949),
                fontSize = 14.sp,
                onClick = { navController.navigate(route = "register") },
                hasShadow = false
            )

            Spacer(modifier = Modifier.height(60.dp))

            Social()
        }
    }

}