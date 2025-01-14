package com.example.weatherappjetpack.model.forecast

import com.example.weatherappjetpack.model.weather.Clouds
import com.example.weatherappjetpack.model.weather.Main
import com.example.weatherappjetpack.model.weather.Sys
import com.example.weatherappjetpack.model.weather.Weather
import com.example.weatherappjetpack.model.weather.Wind
import com.google.gson.annotations.SerializedName

data class CustomList(
    @SerializedName("dt") var dt: Int? = null,
    @SerializedName("main") var main: Main? = Main(),
    @SerializedName("weather") var weather: ArrayList<Weather>? = arrayListOf(),
    @SerializedName("clouds") var clouds: Clouds? = Clouds(),
    @SerializedName("wind") var wind: Wind? = Wind(),
    @SerializedName("visibility") var visibility: Int? = null,
    @SerializedName("pop") var pop: Double? = null,
    @SerializedName("sys") var sys: Sys? = Sys(),
    @SerializedName("dt_txt") var dtTxt: String? = null,
)