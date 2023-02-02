package com.example.quizapp.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
fun SquareButton(
    text: String,
    shape: RoundedCornerShape
) {
    Button(
        onClick = {
            //
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.buttonColor),
        modifier = Modifier
            .width(300.dp)
            .height(80.dp),
        shape = shape,
        contentPadding = PaddingValues(0.dp),
        border = BorderStroke(6.dp, Color(android.graphics.Color.BLACK))
    )
    {
        Text(
            modifier = Modifier.width(250.dp),
            text = text,
            color = Color.Black,
            fontSize = 20.sp
        )
    }
}

