package com.example.quizapp


import androidx.lifecycle.ViewModel


class QuizViewModel: ViewModel() {

    fun onAction(action: ClickEvents) {
        when (action) {
            is ClickEvents.Start -> StartQuiz()
            is ClickEvents.Account -> Login()
            is ClickEvents.CreateQuiz -> CreateQuiz()
            is ClickEvents.QuizName -> ChoseQuiz(action.quizName)
        }
    }

    private fun ChoseQuiz(quizName: String) {
        TODO("Not yet implemented")
    }

    private fun CreateQuiz() {
        TODO("Not yet implemented")
    }

    private fun Login() {
        TODO("Not yet implemented")
    }

    private fun StartQuiz() {
        TODO("Not yet implemented")
    }

}