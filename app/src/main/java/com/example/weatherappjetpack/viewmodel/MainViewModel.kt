package com.example.weatherappjetpack.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherappjetpack.model.MyLatLng
import com.example.weatherappjetpack.model.forecast.ForecastResult
import com.example.weatherappjetpack.model.weather.WeatherResult
import com.example.weatherappjetpack.network.RetrofitClient
import kotlinx.coroutines.launch

enum class STATE {
    LOADING,
    SUCCESS,
    FAILED

}

class MainViewModel : ViewModel() {
    //Control state of View Model
    var state by mutableStateOf(STATE.LOADING)
    //Hold value from API for Weather info
    var weatherResponse : WeatherResult by mutableStateOf(WeatherResult())
    //Hold value from API for Forecast info
    var forecastResponse : ForecastResult by mutableStateOf(ForecastResult())
    var errorMessage: String by mutableStateOf("")

    fun getWeatherByLocation(latLng: MyLatLng) {
        Log.d("EDMTDEV", "Call API HERE !!!")
        viewModelScope.launch {
            state = STATE.LOADING
            val apiService = RetrofitClient.getInstance()
            try{
                val apiResponse = apiService.getWeather(latLng.lat, latLng.lng)
                weatherResponse = apiResponse // Update state
                state = STATE.SUCCESS
            }catch (e: Exception) {
                errorMessage = e.message!!.toString()
                state = STATE.FAILED

            }
        }
    }

    fun getForecastByLocation(latLng: MyLatLng) {
        viewModelScope.launch {
            state = STATE.LOADING
            val apiService = RetrofitClient.getInstance()
            try{
                val apiResponse = apiService.getForecast(latLng.lat, latLng.lng)
                forecastResponse = apiResponse // Update state
                state = STATE.SUCCESS
            }catch (e: Exception) {
                errorMessage = e.message!!.toString()
                state = STATE.FAILED

            }
        }
    }
}