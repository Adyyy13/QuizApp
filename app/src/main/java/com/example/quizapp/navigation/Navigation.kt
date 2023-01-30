package com.example.quizapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quizapp.ui.screens.MainPage
import com.example.quizapp.ui.screens.ChoseQuiz

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "main_page"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("main_page") {
            MainPage(
                onNavigateToChoseQuiz = { navController.navigate("chose_quiz_page")}
        ) }
        composable("chose_quiz_page") { ChoseQuiz() }
    }
}