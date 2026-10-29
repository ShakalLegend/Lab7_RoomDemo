package com.example.lab7_roomdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab7_roomdemo.ui.theme.Lab7_RoomDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab7_RoomDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ScreenSetup(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScrenn(modifier: Modifier = Modifier){

}

@Composable
fun ScreenSetup(modifier: Modifier = Modifier) {
    MainScrenn(modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab7_RoomDemoTheme {
        ScreenSetup()
    }
}