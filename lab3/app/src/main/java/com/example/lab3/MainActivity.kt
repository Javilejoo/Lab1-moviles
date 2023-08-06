package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab3.ui.theme.Lab3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.padding(25.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Javier Prado",carnet= 21486)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,carnet: Int, modifier: Modifier = Modifier) {
    Surface(color = Color.Blue) {
        Text(
            text = "$name\n$carnet",
            style = TextStyle(fontSize = 24.sp, color = Color.DarkGray),
            modifier = modifier.padding(25.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab3Theme {
            Greeting("Javier Prado",carnet = 21486)
    }
}
