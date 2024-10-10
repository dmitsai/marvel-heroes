package com.example.marvelheroes.presentation.list_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.example.marvelheroes.ui.theme.ListScreenTitle
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marvelheroes.data.heroData
import com.example.marvelheroes.presentation.components.HeroCard
import com.example.marvelheroes.ui.theme.BackGroundColor


@Composable
fun ListScreen(navController: NavHostController) {
    Scaffold() { innerPadding ->
        val lazyListState = rememberLazyListState();
        val snapBehavior = rememberSnapFlingBehavior(lazyListState = lazyListState)
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = BackGroundColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center)
                    .padding(20.dp)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .width(150.dp)
                        .align(Alignment.CenterHorizontally),
                    model = "https://effectiveband.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2Fab5510e9-0d2f-404e-9f55-374c7a36d382%2F014c0cb6-64d9-45bd-a3e1-a3cf608257e3%2FUntitled.png?table=block&id=47c3f47d-d604-431d-aa05-6728c63df83d&spaceId=ab5510e9-0d2f-404e-9f55-374c7a36d382&width=1420&userId=&cache=v2",
                    contentDescription = null,
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 25.dp),
                    text = ListScreenTitle,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 32.sp,
                )
            }
            LazyRow(
                state = lazyListState,
                flingBehavior = snapBehavior,
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center)
                    .padding(top = 200.dp, start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(18.dp),
            ) {
                items(heroData) { hero ->
                    HeroCard(hero) { heroId ->
                        navController.navigate("hero/$heroId")
                    }

                }
            }


        }
    }
}