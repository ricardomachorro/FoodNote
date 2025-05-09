package com.example.foodnote.features.recipes.data

import com.example.foodnote.features.recipes.domain.Recipe
import com.example.foodnote.features.recipes.domain.RecipeRepository

class RecipeRepositoryImpl(private val api: ApiRecipeService): RecipeRepository {
    override suspend fun getRecipes(): List<Recipe> = api.getRecipes()
    override suspend fun getRecipeById(id: Int): Recipe = api.getRecipeById(id)

}