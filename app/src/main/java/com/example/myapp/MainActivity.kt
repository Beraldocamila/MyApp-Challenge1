package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.myapp.ui.screens.LoginScreen
import com.example.myapp.ui.screens.SignUpScreen
import com.example.myapp.ui.screens.WelcomeScreen
import com.example.myapp.ui.theme.MyAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppTheme(darkTheme = false) {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                     WelcomeScreen(modifier = Modifier.padding(it))
                    // LoginScreen(modifier = Modifier.padding(it))
                    // SignUpScreen(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

