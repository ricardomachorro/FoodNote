package com.example.foodnote.features.recipes.data


import com.example.foodnote.features.recipes.domain.RecipeRepository
import com.example.foodnote.features.recipes.presentation.RecipeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val recipeKoinModule = module{

    single{ RetrofitRecipeClient.apiRecipeService}
    single<RecipeRepository> { RecipeRepositoryImpl(get()) }
    viewModel { RecipeViewModel(get()) }

}