package com.example.foodnote.features.recipes.data

import com.example.foodnote.features.recipes.domain.RequestMealDB
import com.example.foodnote.features.recipes.domain.Recipe
import com.example.foodnote.features.recipes.domain.RecipeRepository
import com.example.foodnote.features.recipes.domain.ResultAreaMealDB
import com.example.foodnote.features.recipes.domain.ResultCategoryMealDB
import com.example.foodnote.features.recipes.domain.ResultIngredientMealDB
import retrofit2.Response

class RecipeRepositoryImpl(private val api: ApiRecipeService): RecipeRepository {
    override suspend fun getRecipes(): List<Recipe> = api.getRecipes()
    override suspend fun getRecipeById(id: Int): Recipe = api.getRecipeById(id)
    override suspend fun getFilterRecipesByCategory(): Response<RequestMealDB<ResultCategoryMealDB>> = api.getFilterRecipesByCategory()
    override suspend fun getFilterRecipesByArea(): Response<RequestMealDB<ResultAreaMealDB>> = api.getFilterRecipesByArea()
    override suspend fun getFilterRecipesByIngredient(): Response<RequestMealDB<ResultIngredientMealDB>> = api.getFilterRecipesByIngredient()


}