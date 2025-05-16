package com.example.foodnote.features.recipes.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodnote.features.recipes.domain.ResultAreaMealDB
import com.example.foodnote.features.recipes.domain.ResultCategoryMealDB
import com.example.foodnote.features.recipes.domain.ResultIngredientMealDB
import org.koin.core.context.GlobalContext.get


@Composable
fun RecipeScreen(viewModel: RecipeViewModel ) {

    Box(
        modifier = Modifier
            .padding(40.dp)
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            DropDownFixedElement(viewModel)
            ResultDropDown(viewModel)
        }
    }





}


@Composable
fun DropDownFixedElement(viewModel: RecipeViewModel){
    var expanded by remember {mutableStateOf(false)}

    Box(
        modifier = Modifier
            .padding(16.dp)
    ){
            Text(
                text ="Options of Search",
                modifier = Modifier.clickable { expanded = true } )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {expanded = false}
        ) {
            DropdownMenuItem(
                text = { Text("Category") },
                onClick = {
                    viewModel.updateFilterRecipes("c");
                    expanded = false;
                }
            )
            DropdownMenuItem(
                text = { Text("Area") },
                onClick = {
                    viewModel.updateFilterRecipes("a");
                    expanded = false;
                }
            )

            DropdownMenuItem(
                text = { Text("Ingredient") },
                onClick = {
                    viewModel.updateFilterRecipes("i");
                    expanded = false;
                }
            )
        }
    }


}


@Composable
fun ResultDropDown(viewModel: RecipeViewModel){

    var expanded by remember {mutableStateOf(false)}

    Box( modifier = Modifier
        .padding(16.dp)){

        Text(
            text ="Options of Search",
            modifier = Modifier.clickable { expanded = true } )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {expanded = false}
        ) {
            viewModel.optionsFiltered.forEach {
                    option ->
                DropdownMenuItem(
                    text = {
                        if(viewModel.selectionOption == "a"){
                            val option = option as ResultAreaMealDB
                            Text("${option.strArea}")
                        }else if(viewModel.selectionOption == "c"){
                            val option = option as ResultCategoryMealDB
                            Text(option.strCategory)
                        }else if(viewModel.selectionOption == "i"){
                            val option = option as ResultIngredientMealDB
                            Text(option.strIngredient)
                        }
                    },
                    onClick = {    }
                )
            }

        }

    }




}