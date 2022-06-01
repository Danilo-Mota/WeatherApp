package com.example.weather.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class WeatherList(
    @SerializedName("data") val resultado: List<Weather>
): Serializable
