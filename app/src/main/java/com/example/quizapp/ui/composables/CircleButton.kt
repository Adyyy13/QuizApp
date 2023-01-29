package com.example.quizapp.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.ui.theme.buttonColor


@Composable
fun CircleButton(
    text: String,
    shape: RoundedCornerShape,
    onClick: () -> Unit
){
    Button(
        onClick= {
            onClick
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.buttonColor),
        modifier = Modifier
            .size(180.dp),
        shape = shape,
        contentPadding = PaddingValues(0.dp),
        border = BorderStroke(3.dp, Color(android.graphics.Color.BLACK))
    )
    {
        Text(
            text = text,
            color = androidx.compose.ui.graphics.Color.Black,
            fontSize = 20.sp)
    }
}