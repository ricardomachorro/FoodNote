package com.example.foodnote.features.recipes.data

import retrofit2.http.GET
import com.example.foodnote.features.recipes.domain.Recipe

interface ApiRecipeService {

    @GET("recipes")
    suspend fun getRecipes(): List<Recipe>

    @GET("recipes/{id}")
    suspend fun  getRecipeById(id:Int):Recipe


}