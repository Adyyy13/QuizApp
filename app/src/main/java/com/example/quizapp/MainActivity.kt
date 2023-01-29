package com.example.quizapp


import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizapp.ui.composables.CircleButton
import com.example.quizapp.ui.composables.SquareButton
import com.example.quizapp.ui.theme.backgroundColor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
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
                text = "QUIZ APP",
                shape = RoundedCornerShape(40),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "START",
                shape = CircleShape,
                onClick = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Account",
                shape = CircleShape,
                onClick = null)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Create Quiz",
                shape = CircleShape,
                onClick = null)
        }
    }
}


val String.color
    get() = Color(parseColor(this))
