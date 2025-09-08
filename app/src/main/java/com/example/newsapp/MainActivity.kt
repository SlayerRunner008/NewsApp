package com.example.newsapp

import Items.NavegationText
import Items.NewsBoxList
import Items.NewsList
import Items.newsBoxList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomePage(innerPadding)
                }
            }
        }
    }
}


@Composable
fun HomePage(x: PaddingValues){

    Column {
        NavegationText()
        Text(
            text = "Ultimas noticias",
            fontSize = 35.sp
        )
        NewsBoxList()
        Text(
            text = "Alrededor del mundo",
            fontSize = 25.sp
        )
        NewsList()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewsAppTheme {
        HomePage(PaddingValues(1.dp))
    }
}