package com.example.foodnote.features.recipes.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.foodnote.features.recipes.domain.RecipeRepository

class RecipeViewModel(private val recipeRepository: RecipeRepository) : ViewModel(){

        val selectionOption by mutableStateOf("c")



}