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
fun QuestionPage(
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
                text = "Question",
                shape = RoundedCornerShape(40),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Answer1",
                shape = CircleShape,
                onClick = {  }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Answer2",
                shape = CircleShape,
                onClick = {  }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Answer3",
                shape = CircleShape,
                onClick = { }
            )
        }
    }
}