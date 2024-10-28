package com.example.uts

import java.io.Serializable



data class Place(
    val name: String,
    val location: String,
    val description: String,
    val rating: Double,
    val imageResource: Int
) : Serializable
