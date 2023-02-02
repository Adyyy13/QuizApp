package com.example.quizapp.navigation

sealed class Screen(val route: String) {
    object MainPage: Screen(route = "main_page")
    object ChoseQuizPage: Screen(route = "chose_quiz_page")
    object QuestionPage1: Screen(route = "question_page1")
    object QuestionPage2: Screen(route = "question_page2")
    object QuestionPage3: Screen(route = "question_page3")
    object LoginPage: Screen(route = "login_page")
    object ResultPage: Screen(route = "result_page")
}
