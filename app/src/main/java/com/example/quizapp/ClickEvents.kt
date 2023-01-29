package com.example.quizapp

sealed class ClickEvents {

    data class QuizName(val quizName: String): ClickEvents()
    object Account: ClickEvents()
    object CreateQuiz: ClickEvents()
    object Start: ClickEvents()


}
