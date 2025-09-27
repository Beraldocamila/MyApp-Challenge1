package com.example.myapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapp.R
import com.example.myapp.ui.components.Background
import com.example.myapp.ui.components.CommonTextField
import com.example.myapp.ui.components.CustomButton
import com.example.myapp.ui.components.Social
import com.example.myapp.ui.theme.poppins


@Composable
fun LoginScreen(modifier: Modifier, navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var emailError by remember { mutableStateOf(false) }
    var passwordError by remember { mutableStateOf(false) }

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
                text = stringResource(R.string.login_title),
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
                text = stringResource(R.string.login_subtitle),
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                lineHeight = 30.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(90.dp))

            CommonTextField(
                value = email,
                onValueChange = {
                    email = it
                    emailError = false
                },
                placeholderText = stringResource(R.string.placeholder_email),
                isError = emailError,
                errorMessage = stringResource(R.string.error_email)
            )

            CommonTextField(
                value = password,
                onValueChange = {
                    password = it
                    passwordError = false
                },
                placeholderText = stringResource(R.string.placeholder_password),
                isError = passwordError,
                errorMessage = stringResource(R.string.error_password)
            )

            Text(
                text = stringResource(R.string.forgot_password),
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
                text = stringResource(R.string.btn_sign_in),
                width = 357.dp,
                height = 50.dp,
                bgColor = Color(0xFF1F41BB),
                textColor = Color.White,
                fontSize = 20.sp,
                onClick = {
                    var hasError = false
                    if (email.isBlank()) {
                        emailError = true
                        hasError = true
                    }
                    if (password.isBlank()) {
                        passwordError = true
                        hasError = true
                    }

                    if (!hasError) {
                        /* action */
                    }
                },
                hasShadow = true
            )

            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(
                text = stringResource(R.string.btn_create_account),
                width = 200.dp,
                height = 41.dp,
                bgColor = Color.White,
                textColor = Color(0xFF494949),
                fontSize = 14.sp,
                onClick = {
                    navController.navigate(route = "register") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                hasShadow = false
            )

            Spacer(modifier = Modifier.height(60.dp))

            Social()
        }
    }

}