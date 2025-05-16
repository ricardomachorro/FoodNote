package com.example.foodnote.features.recipes.data

import com.example.foodnote.features.recipes.domain.RequestMealDB
import retrofit2.http.GET
import com.example.foodnote.features.recipes.domain.Recipe
import com.example.foodnote.features.recipes.domain.ResultAreaMealDB
import com.example.foodnote.features.recipes.domain.ResultCategoryMealDB
import com.example.foodnote.features.recipes.domain.ResultIngredientMealDB
import retrofit2.Response

interface ApiRecipeService {

    @GET("recipes")
    suspend fun getRecipes(): List<Recipe>

    @GET("recipes/{id}")
    suspend fun  getRecipeById(id:Int):Recipe

    @GET("list.php?c=list")
    suspend fun getFilterRecipesByCategory(): Response<RequestMealDB<ResultCategoryMealDB>>

    @GET("list.php?a=list")
    suspend fun  getFilterRecipesByArea(): Response<RequestMealDB<ResultAreaMealDB>>

    @GET("list.php?i=list")
    suspend fun  getFilterRecipesByIngredient(): Response<RequestMealDB<ResultIngredientMealDB>>

}