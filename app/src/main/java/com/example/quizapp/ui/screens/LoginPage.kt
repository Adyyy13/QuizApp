package com.example.quizapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizapp.ui.composables.SquareButton
import com.example.quizapp.ui.theme.backgroundColor
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.quizapp.navigation.Screen
import com.example.quizapp.ui.composables.LoginField
import com.example.quizapp.ui.composables.PasswordField
import com.example.quizapp.ui.composables.SignInButton

@Composable
fun LoginPage(
    navController: NavController
) {

    val loginCheck = "admin"
    val passwordCheck = "password"

    val login = remember {mutableStateOf("")}
    val password = remember {mutableStateOf("")}

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
                text = "ACCOUNT",
                shape = RoundedCornerShape(40),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            LoginField(login = login)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            SignInButton(
                onClick = {
                    if (password.value == passwordCheck && login.value == loginCheck) {
                              navController.navigate(Screen.MainPage.route)
                          }})
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            PasswordField(password = password)
        }
        }
    }


@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {

}