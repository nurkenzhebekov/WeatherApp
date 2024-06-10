package com.example.weatherapp.repository

import com.example.weatherapp.server.ApiServices

class WeatherRepository(val api: ApiServices) {

    fun getCurrentWeather(lat: Double, lon: Double, unit: String) =
        api.getCurrentWeather(lat, lon, unit, "847e1b6d27b8dd585fce29f6d44fa819")

    fun getForecastWeather(lat: Double, lon: Double, unit: String) =
        api.getForecastWeather(lat, lon, unit, "847e1b6d27b8dd585fce29f6d44fa819")
}