package com.example.quizapp.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.ui.theme.buttonColor
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@Composable
fun LoginField(){

    val login = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(color = MaterialTheme.colors.buttonColor, shape = CircleShape)
            .size(180.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

        ) {
            Text(
                text = "LOGIN",
                color = androidx.compose.ui.graphics.Color.Black,
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

        ) {
            Text(
                text = "---------------------------",
                color = androidx.compose.ui.graphics.Color.Black,
                fontSize = 20.sp
            )
        }
            Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

        ) {


            TextField(
                modifier = Modifier
                    .width(130.dp)
                    .height(55.dp),
                value = login.value,
                onValueChange = { login.value = it },
                placeholder = { Text(text = "Type here", modifier = Modifier.fillMaxSize())}
            )
        }
    }
}

@Composable
fun PasswordField(){

    val password = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .background(color = MaterialTheme.colors.buttonColor, shape = CircleShape)
            .size(180.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "PASSWORD",
                color = androidx.compose.ui.graphics.Color.Black,
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "---------------------------",
                color = androidx.compose.ui.graphics.Color.Black,
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,

            ) {


            TextField(
                modifier = Modifier
                    .width(130.dp)
                    .height(55.dp),
                value = password.value,
                onValueChange = { password.value = it },
                placeholder = { Text(text = "Type here", modifier = Modifier.fillMaxSize())}
            )
        }
    }


}

@Composable
fun SignInButton(
    onClick: () -> Unit,
    navController: NavController
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .size(180.dp)
    ) {
        Text(
            text = "SIGN IN",
            color = Color.Black,
            fontSize = 20.sp)
    }
}