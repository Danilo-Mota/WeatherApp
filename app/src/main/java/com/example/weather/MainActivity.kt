package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weather.api.ApiService
import com.example.weather.api.WeatherList
import com.example.weather.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getInfos()
    }

    fun getInfos(){
        val call = ApiService().getApiWeather().getWeather()
        call.enqueue(object : Callback<WeatherList>{
            override fun onResponse(call: Call<WeatherList>, response: Response<WeatherList>) {
                val response = response.body()
                if (response != null){
                    val result = response.resultado[0]
                    binding.cidade.text = result.cidade
                    binding.temperatura.text = result.temperatura
                    binding.nuvens.text = result.nuvens
                    binding.porDoSol.text = result.porDoSol
                    binding.nascerDoSol.text = result.nascerDoSol
                    binding.humidade.text = result.humidade
                }
            }

            override fun onFailure(call: Call<WeatherList>, t: Throwable) {

            }
        })
    }
}