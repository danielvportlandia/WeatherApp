package com.example.weatherapp.models

import java.io.Serializable

data class Main (
    val temp: Double,
    val pressure: Int,
    val humidity: Int,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double
        ) : Serializable