package com.example.weather.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.weatherbit.io/v2.0/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

     fun getApiWeather(): ApiWeather = this.retrofit.create(ApiWeather::class.java)
}
