package com.example.quizapp

import androidx.lifecycle.viewmodel.compose.viewModel

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizapp.ui.theme.QuizAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizAppTheme {
                val viewModel = viewModel<QuizViewModel>()


            }
            }

        }
    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
// MainPage()
}


val String.color
    get() = Color(parseColor(this))
