package com.catalyst.grocerystores.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.catalyst.grocerystores.auth.screens.Login
import com.catalyst.grocerystores.auth.screens.Register
import com.catalyst.grocerystores.navigation.destinations.Destination

@Composable
fun AuthenticationNavigationHost(
    navController: NavHostController
) {
    NavHost(navController = navController,
    startDestination = Destination.LoginDestination.route
    ) {
        composable (route = Destination.LoginDestination.route) {
            Login(navController = navController)
        }
        composable (route = Destination.SignUpDestination.route){
            Register()
        }
    }

}