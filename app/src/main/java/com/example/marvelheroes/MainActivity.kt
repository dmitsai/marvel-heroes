package com.example.marvelheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.marvelheroes.presentation.components.HeroCard
import com.example.marvelheroes.ui.theme.MarvelHeroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarvelHeroesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(color = Color.Gray)
                            .wrapContentSize(Alignment.Center)
                    ) {
                        HeroCard(
                            name = "Iron man",
                            imageModel = "https://www.specfictionshop.com/cdn/shop/products/315455127_2253071438203857_6311282012262232749_n_2000x.jpg?v=1669836598"
                        )

                    }
                }
            }
        }
    }
}