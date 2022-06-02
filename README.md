# WeatherApp
Aplicativo desenvolvido para ensinar Kotlin na semana do meio ambiente do IFMS Campus Coxim

ApiKey = aa880d47d52e41ff8a90a63d9660f708

Imports:
 //Retrofit
 
    implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"
    
    implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    
buildscript {
    ext{
        retrofitVersion = '2.9.0'
    } 
    
 //Data Binding
 
dataBinding {
      enabled true
  }
  
 id 'kotlin-kapt'
 
 Link api: https://www.weatherbit.io/api/weather-current
