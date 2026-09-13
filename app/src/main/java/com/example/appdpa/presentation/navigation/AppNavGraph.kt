package com.example.appdpa.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.appdpa.presentation.auth.LoginScreen
import com.example.appdpa.presentation.auth.RegisterScreen
import com.example.appdpa.presentation.home.HomeScreen

@Composable
fun AppNavGraph() {
    // Aquí puedes definir tu gráfico de navegación utilizando NavHost y NavController
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = "register")
    {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("home") { HomeScreen() }
    }
}