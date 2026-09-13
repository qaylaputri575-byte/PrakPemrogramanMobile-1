package com.example.H1D024133

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.H1D024133.ui.screen.BasicInfoScreen
import com.example.H1D024133.ui.screen.HubungiKamiScreen
import com.example.H1D024133.ui.theme.JualanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "info_screen"
    ) {
        composable("info_screen") {
            BasicInfoScreen(navController = navController)
        }
        composable("form_screen") {
            HubungiKamiScreen(navController = navController)
        }
    }
}