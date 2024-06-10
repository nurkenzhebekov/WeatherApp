package com.example.weatherapp.repository

import com.example.weatherapp.server.ApiServices

class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q, limit, "847e1b6d27b8dd585fce29f6d44fa819")
}