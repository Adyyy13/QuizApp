package com.example.quizapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.quizapp.navigation.Screen
import com.example.quizapp.ui.composables.CircleButton
import com.example.quizapp.ui.composables.SquareButton
import com.example.quizapp.ui.theme.backgroundColor

@Composable
fun QuestionPage3(
    navController: NavController,
    counter: MutableState<Int>
){

    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            SquareButton(
                text = "Poprawna deklaracja zmiennej zmiennoprzecinkowej to",
                shape = RoundedCornerShape(40),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "int variable = 0;",
                shape = CircleShape,
                onClick = { navController.navigate(route = Screen.ResultPage.route) }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "float variable = 0",
                shape = CircleShape,
                onClick = { navController.navigate(route = Screen.ResultPage.route) }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "float double = 0;",
                shape = CircleShape,
                onClick = { navController.navigate(route = Screen.ResultPage.route)
                counter.value++}
            )
        }
    }
}