package com.example.mainscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mainscreen.screens.LoginScreen
import com.example.mainscreen.screens.MainScreen
import com.example.mainscreen.screens.SignUpScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ){
        composable("welcome"){
            MainScreen(navController)
        }
        composable("login"){
            LoginScreen(navController)
        }
        composable("signup"){
            SignUpScreen(navController)
        }
    }
}