package com.example.foodnote.features.recipes.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitRecipeClient {
    val apiRecipeService: ApiRecipeService by lazy{
        Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiRecipeService::class.java)
    }
}