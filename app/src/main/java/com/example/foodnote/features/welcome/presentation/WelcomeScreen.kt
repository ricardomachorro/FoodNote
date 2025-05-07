package com.example.foodnote.features.welcome.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodnote.R
import com.example.foodnote.core.ui.theme.YellowBase
import com.example.foodnote.core.ui.theme.YellowBase


@Composable
fun WelcomeScree(){



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(YellowBase)

    ){
       Column(
           modifier = Modifier
               .fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally


       ) {
            Image(
                modifier = Modifier
                    .size(100.dp),
                contentDescription = "",
                painter = painterResource(id= R.drawable.logo_image_orange)
            )
       }
    }



}