package com.example.marvelheroes.data

data class Hero(val id: String, val name: String, val description: String, val imageModel: String)

val heroData = listOf(
    Hero(
        "1",
        "Deadpool",
        "Please don't make the super suit green...or animated",
        "https://iili.io/JMnAfIV.png"
    ),
    Hero(
        "2",
        "Iron Man",
        "I AM IRON MAN",
        "https://iili.io/JMnuDI2.png"
    ),
    Hero(
        "3",
        "Spider Man",
        "In iron suit",
        "https://iili.io/JMnuyB9.png"
    )
)

