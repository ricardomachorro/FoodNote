package com.example.foodnote.features.recipes.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodnote.features.recipes.domain.RecipeRepository
import com.example.foodnote.features.recipes.domain.RequestMealDB
import com.example.foodnote.features.recipes.domain.ResultAreaMealDB
import kotlinx.coroutines.launch

class RecipeViewModel(private val recipeRepository: RecipeRepository) : ViewModel(){

        var selectionOption by mutableStateOf("c");

        var optionsFiltered by mutableStateOf(emptyList<Any>());


        fun updateFilterRecipes(option : String){
                 selectionOption = option;

                viewModelScope.launch {
                        if(selectionOption == "a"){

                            val response = recipeRepository.getFilterRecipesByArea()
                            if(response.isSuccessful){
                                    optionsFiltered = response.body()?.meals?: emptyList()
                            }

                        }else if(selectionOption == "c"){
                                val response = recipeRepository.getFilterRecipesByCategory()
                                if(response.isSuccessful){

                                        optionsFiltered = response.body()?.meals?:emptyList()

                                }

                        }else if(selectionOption == "i"){

                                val response = recipeRepository.getFilterRecipesByIngredient()
                                if(response.isSuccessful){
                                        optionsFiltered = response.body()?.meals?: emptyList()
                                }

                        }
                }
        }

        


}