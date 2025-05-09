package com.example.foodnote.features.recipes.data

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodnote.features.recipes.domain.RecipeRepository
import org.koin.dsl.module


val recipeKoinModule = module{

    single{ RetrofitRecipeClient.apiRecipeService}
    single<RecipeRepository> { RecipeRepositoryImpl(get()) }
    viewModel { RecipeViewModel(get()) }

}