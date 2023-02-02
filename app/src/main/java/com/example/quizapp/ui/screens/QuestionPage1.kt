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
fun QuestionPage1(
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
                text = "Jaką wartość przechowuje String?",
                shape = RoundedCornerShape(40),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Ciąg znaków",
                shape = CircleShape,
                onClick = {
                    navController.navigate(route = Screen.QuestionPage2.route)
                    counter.value++}
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Liczbę",
                shape = CircleShape,
                onClick = { navController.navigate(route = Screen.QuestionPage2.route) }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Boolean",
                shape = CircleShape,
                onClick = {navController.navigate(route = Screen.QuestionPage2.route) }
            )
        }
    }
}