package com.example.quizapp.navigation

sealed class Screen(val route: String) {
    object MainPage: Screen(route = "main_page")
    object ChoseQuizPage: Screen(route = "chose_quiz_page")
    object QuestionPage: Screen(route = "question_page")
    object LoginPage: Screen(route = "login_page")
    object ResultPage: Screen(route = "result_page")
}
