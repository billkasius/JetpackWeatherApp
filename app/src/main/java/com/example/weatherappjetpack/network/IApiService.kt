package com.example.weatherappjetpack.network

import com.example.weatherappjetpack.constant.Const.Companion.openWeatherMapApiKey
import com.example.weatherappjetpack.model.forecast.ForecastResult
import com.example.weatherappjetpack.model.weather.WeatherResult
import retrofit2.http.GET
import retrofit2.http.Query

interface IApiService {
    @GET("weather")
    suspend fun getWeather(
        @Query("lat") lat: Double = 0.0,
        @Query("lon") lon: Double = 0.0,
        @Query("units") units: String = "metric",
        @Query("appid") appid: String = openWeatherMapApiKey
    ): WeatherResult

    @GET("forecast")
    suspend fun getForecast(
        @Query("lat") lat: Double = 0.0,
        @Query("lon") lon: Double = 0.0,
        @Query("units") units: String = "metric",
        @Query("appid") appid: String = openWeatherMapApiKey
    ): ForecastResult
}