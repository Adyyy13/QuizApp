package com.example.quizapp

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.quizapp.navigation.Navigation
import com.example.quizapp.ui.theme.QuizAppTheme



class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setContent {
               QuizAppTheme {

                   navController = rememberNavController()

                   val counter = remember {mutableStateOf(0)}

                   Navigation(
                       navController = navController,
                       counter = counter
                   )
               }
           }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
}

val String.color
    get() = Color(parseColor(this))


