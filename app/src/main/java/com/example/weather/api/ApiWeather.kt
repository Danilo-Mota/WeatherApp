package com.example.weather.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiWeather {
    @GET("current?&city=Palmas&country=BR&key=aa880d47d52e41ff8a90a63d9660f708&lang=pt")
    fun getWeather(): Call<WeatherList>

}