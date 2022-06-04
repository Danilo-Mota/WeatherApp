package com.example.weather.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiWeather {
    @GET("current?&city=Palmas&country=BR&key=APIKEY&lang=pt")
    fun getWeather(): Call<WeatherList>

}