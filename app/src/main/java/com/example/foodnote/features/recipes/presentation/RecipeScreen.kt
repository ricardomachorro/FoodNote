package com.example.foodnote.features.recipes.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
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
import org.koin.core.context.GlobalContext.get


@Composable
fun RecipeScreen(navController: NavController,viewModel: RecipeViewModel ) {


}


@Composable
fun DropDownElement(){
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
                text = { Text("Option 1") },
                onClick = { /* Do something... */ }
            )
            DropdownMenuItem(
                text = { Text("Option 2") },
                onClick = { /* Do something... */ }
            )
        }
    }


}