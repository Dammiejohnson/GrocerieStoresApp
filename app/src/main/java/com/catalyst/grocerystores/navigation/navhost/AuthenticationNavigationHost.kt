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
    navHostController: NavHostController
) {
    NavHost(navController = navHostController,
    startDestination = Destination.LoginDestination.route
    ) {
        composable (route = Destination.LoginDestination.route) {
            Login(navController = navHostController)
        }
        composable (route = Destination.SignUpDestination.route){
            Register(navController = navHostController) //this is a form of polymorphism
        }
        //for each screen..it is supposed to be here,whenever a person goes to the login route, render the login composable
    }

}