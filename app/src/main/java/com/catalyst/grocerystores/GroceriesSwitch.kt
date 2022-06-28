package com.catalyst.grocerystores

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.catalyst.grocerystores.auth.AuthenticationWrapper

@Composable
fun GroceriesSwitch(){
    val isAuthenticated = false

    if (isAuthenticated) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Welcome")

        }
    } else {
       AuthenticationWrapper()
    }
}