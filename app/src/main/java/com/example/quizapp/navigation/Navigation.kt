package com.example.quizapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.ui.screens.ChoseQuiz
import com.example.quizapp.ui.screens.LoginPage
import com.example.quizapp.ui.screens.MainPage

@Composable
fun Navigation(
    navController: NavHostController,
    counter: MutableState<Int>
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainPage.route
    ) {
        composable(
            route = Screen.MainPage.route
        ) {
            MainPage(navController = navController, counter = counter)
        }
        composable(
            route = Screen.ChoseQuizPage.route
        ) {
            ChoseQuiz(navController = navController)
        }
        composable(
            route = Screen.QuestionPage.route
        ) {
            // TODO
        }
        composable(
            route = Screen.LoginPage.route
        ) {
            LoginPage(navController = navController)
        }
        composable(
            route = Screen.ResultPage.route
        ) {
            // TODO
        }
    }
}