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
fun SignUpScreen(modifier: Modifier, navController: NavController){
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
                text = stringResource(R.string.sign_up_title),
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
                text = stringResource(R.string.sign_up_subtitle),
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
                placeholderText = stringResource(R.string.placeholder_email)
            )

            CommonTextField(
                value = "",
                onValueChange = {},
                placeholderText = stringResource(R.string.placeholder_password)
            )

            CommonTextField(
                value = "",
                onValueChange = {},
                placeholderText = stringResource(R.string.placeholder_confirm)
            )


            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(
                text = stringResource(R.string.btn_sign_up),
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
                text = stringResource(R.string.btn_have_account),
                width = 250.dp,
                height = 41.dp,
                bgColor = Color.White,
                textColor = Color(0xFF494949),
                fontSize = 14.sp,
                onClick = {
                    navController.navigate("login") {
                        popUpTo("register") { inclusive = true }
                    }
                },
                hasShadow = false
            )

            Spacer(modifier = Modifier.height(60.dp))
            Social()
        }
    }
}


