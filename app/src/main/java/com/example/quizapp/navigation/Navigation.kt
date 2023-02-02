package com.example.quizapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.ui.screens.*

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
            MainPage(navController = navController)
        }
        composable(
            route = Screen.LoginPage.route
        ) {
            LoginPage(navController = navController)
        }
        composable(
            route = Screen.ChoseQuizPage.route
        ) {
            ChoseQuiz(navController = navController)
        }
        composable(
            route = Screen.QuestionPage1.route
        ) {
            QuestionPage1(navController = navController, counter = counter )
        }
       composable(
            route = Screen.QuestionPage2.route
        ) {
           QuestionPage2(navController = navController, counter = counter )
        }
       composable(
            route = Screen.QuestionPage3.route
        ) {
           QuestionPage3(navController = navController, counter = counter )
        }
       
        composable(
            route = Screen.ResultPage.route
        ) {
            ResultPage(navController = navController, counter = counter)
        }
    }
}