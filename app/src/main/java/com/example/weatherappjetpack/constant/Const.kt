package com.example.weatherappjetpack.constant

class Const {
    companion object {
        val permissions = arrayOf(
            android.Manifest.permission.ACCESS_COARSE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION,
        )
        const val openWeatherMapApiKey = "YOUR_API_KEY";

        const val colorBg1 = 0xff2a4e70;
        const val colorBg2 = 0xff7cb0d5;
        const val cardColor = 0xff333639;

        const val LOADING = "Loading..."
        const val NA = "N/A"
    }
}