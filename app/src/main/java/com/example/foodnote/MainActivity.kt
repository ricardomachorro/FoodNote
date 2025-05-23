package com.example.foodnote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodnote.core.ui.theme.FoodNoteTheme
import com.example.foodnote.features.recipes.data.recipeKoinModule
import com.example.foodnote.features.recipes.presentation.RecipeScreen
import com.example.foodnote.features.welcome.presentation.WelcomeScreen
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        startKoin {
            androidContext(this@MainActivity )
            modules(recipeKoinModule)
        }
        setContent {
            //WelcomeScreen()
            RecipeScreen( viewModel = get())
        }
    }
}

