package com.example.marvelheroes.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelheroes.data.heroData
import com.example.marvelheroes.presentation.hero_screen.HeroScreen
import com.example.marvelheroes.presentation.list_screen.ListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "list") {
        composable("list") { ListScreen(navController) }
        composable("hero/{heroId}") {
            val heroId = it.arguments?.getString("heroId")
            val hero = heroData.find { it.id == heroId }
            HeroScreen(hero, navController)
        }
    }
}