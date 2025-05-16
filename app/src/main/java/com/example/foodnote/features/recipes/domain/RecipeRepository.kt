package com.example.foodnote.features.recipes.domain

import retrofit2.Response

interface RecipeRepository {

    suspend fun getRecipes():List<Recipe>
    suspend fun getRecipeById(id:Int):Recipe
    suspend fun  getFilterRecipesByCategory(): Response<RequestMealDB<ResultCategoryMealDB>>
    suspend fun  getFilterRecipesByArea(): Response<RequestMealDB<ResultAreaMealDB>>
    suspend fun  getFilterRecipesByIngredient(): Response<RequestMealDB<ResultIngredientMealDB>>
}