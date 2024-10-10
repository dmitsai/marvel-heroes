package com.example.marvelheroes.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.marvelheroes.data.Hero


@Composable
fun HeroCard(hero: Hero, onCardClick: (String) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(600.dp)
            .clickable { onCardClick(hero.id) }
    ) {
        AsyncImage(
            model = hero.imageModel,
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .align(Alignment.Center)
        )
        Text(
            text = hero.name,
            color = Color.White,
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            modifier = Modifier
                .padding(start = 32.dp, bottom = 16.dp)
                .align(Alignment.BottomStart)
                .width(200.dp)
        )
    }
}