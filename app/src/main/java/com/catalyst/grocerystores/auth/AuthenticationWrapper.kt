package com.catalyst.grocerystores.auth

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.catalyst.grocerystores.auth.viewmodels.AuthViewModel
import com.catalyst.grocerystores.navigation.navhost.AuthenticationNavigationHost

@Composable
fun AuthenticationWrapper (
    viewModel: AuthViewModel
) {

    val navHostController = rememberNavController()
        AuthenticationNavigationHost(
            navHostController = navHostController,
           authViewModel = viewModel
        )
    }
