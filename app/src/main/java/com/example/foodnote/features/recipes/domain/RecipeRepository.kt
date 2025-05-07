package com.example.foodnote.features.recipes.domain

interface RecipeRepository {

    suspend fun getRecipes():List<Recipe>
    suspend fun getRecipeById(id:Int):Recipe
}