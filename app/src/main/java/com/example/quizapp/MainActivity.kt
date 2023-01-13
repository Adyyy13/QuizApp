package com.example.quizapp


import android.graphics.Color.BLACK
import android.graphics.Color.parseColor
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.ui.theme.backgroundColor
import com.example.quizapp.ui.theme.buttonColor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    CircleButton(
                        text = "Account",
                        shape = CircleShape,)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    CircleButton(
                        text = "Create Quiz",
                        shape = CircleShape)
                }
            }
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
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Account",
                shape = CircleShape,)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircleButton(
                text = "Create Quiz",
                shape = CircleShape)
        }
    }
}


@Composable
fun CircleButton(
    text: String,
    shape: RoundedCornerShape,
){
    Button(
        onClick= {
            // onclick code
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.buttonColor),
        modifier = Modifier.size(180.dp),
        shape = shape,
        contentPadding = PaddingValues(0.dp),
        border = BorderStroke(3.dp, Color(BLACK))
    )
    {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 20.sp)
    }
}

@Composable
fun SquareButton(
    text: String,
    shape: RoundedCornerShape,
) {
    Button(
        onClick = {
            // onclick code
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.buttonColor),
        modifier = Modifier
            .width(300.dp)
            .height(80.dp),
        shape = shape,
        contentPadding = PaddingValues(0.dp),
        border = BorderStroke(6.dp, Color(BLACK))
    )
    {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 20.sp
        )
    }
}

val String.color
    get() = Color(parseColor(this))
