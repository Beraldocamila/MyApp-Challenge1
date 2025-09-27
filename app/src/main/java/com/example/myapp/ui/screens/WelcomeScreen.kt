package com.example.myapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapp.R
import com.example.myapp.ui.components.Background
import com.example.myapp.ui.components.CustomButton
import com.example.myapp.ui.theme.poppins


@Composable
fun WelcomeScreen(modifier: Modifier, navController: NavController) {
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
                text = stringResource(R.string.welcome_screen_title),
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
                text = stringResource(R.string.welcome_screen_subtitle),
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
                    text = stringResource(R.string.btn_login),
                    width = 150.dp,
                    height = 50.dp,
                    bgColor = Color(0xFF1F41BB),
                    textColor = Color.White,
                    fontSize = 20.sp,
                    onClick = {
                        navController.navigate(route = "login") {
                            popUpTo("welcome") { inclusive = true }
                        }
                    },
                    hasShadow = true
                )

                Spacer(modifier = Modifier.width(20.dp))

                // Register Button
                CustomButton(
                    text = stringResource(R.string.btn_register),
                    width = 150.dp,
                    height = 50.dp,
                    bgColor = Color.White,
                    textColor = Color.Black,
                    fontSize = 20.sp,
                    onClick = {
                        navController.navigate(route = "register") {
                            popUpTo("welcome") { inclusive = true }
                        }
                    },
                    hasShadow = false
                )
            }
        }
    }
}
