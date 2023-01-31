package com.example.quizapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.ui.screens.ChoseQuiz
import com.example.quizapp.ui.screens.MainPage

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainPage.route
    ) {
        composable(
            route = Screen.MainPage.route
        ) {
            MainPage(navController = navController)
        }
        composable(
            route = Screen.ChoseQuizPage.route
        ) {
            ChoseQuiz(navController = navController)
        }
    }
}