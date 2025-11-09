package com.example.questnavigasitugas_046

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas_046.ui.theme.QuestNavigasiTugas_046Theme
import com.example.questnavigasitugas_046.view.WelcomeScreen
import com.example.questnavigasitugas_046.view.Page2
import com.example.questnavigasitugas_046.view.Page3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestNavigasiTugas_046Theme {
                NavigasiApp()
            }
        }
    }
}

@Composable
fun NavigasiApp() {
    val navController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Welcome.name,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(route = Navigasi.Welcome.name) {
                WelcomeScreen(
                    onNavigateToPage2 = {
                        navController.navigate(Navigasi.Page2.name)
                    }
                )
            }
            composable(route = Navigasi.Page2.name) {
                Page2(
                    onNavigateToBeranda = {
                        navController.navigate(Navigasi.Welcome.name) {
                            popUpTo(Navigasi.Welcome.name) { inclusive = true }
                        }
                    },
                    onNavigateToForm = {
                        navController.navigate(Navigasi.Page3.name)
                    }
                )
            }
            composable(route = Navigasi.Page3.name) {
                Page3(
                    onNavigateBack = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}