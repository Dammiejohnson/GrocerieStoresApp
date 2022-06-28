package com.catalyst.grocerystores.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.catalyst.grocerystores.navigation.navhost.AuthenticationNavigationHost

@Composable
fun AuthenticationWrapper () {
    val navHostController = rememberNavController()
        AuthenticationNavigationHost(
            navHostController = navHostController
        )
    }
