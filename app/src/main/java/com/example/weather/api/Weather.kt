package com.example.weather.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Weather(
    @SerializedName("temp") val temperatura: String,
    @SerializedName("city_name") val cidade: String,
    @SerializedName("clouds") val nuvens: String
): Serializable
