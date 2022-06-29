package com.catalyst.grocerystores.navigation.navhost

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.catalyst.grocerystores.cart.screens.Cart
import com.catalyst.grocerystores.explore.screens.Explore
import com.catalyst.grocerystores.favorites.screens.Favorites
import com.catalyst.grocerystores.general.components.BottomNavBar
import com.catalyst.grocerystores.navigation.destinations.PrimaryDestination
import com.catalyst.grocerystores.profile.screens.Profile
import com.catalyst.grocerystores.store.screens.Store

@Composable
fun ApplicationNavigationHost(){
    val navController = rememberNavController()
    Scaffold (
        bottomBar = {
            BottomNavBar(
                modifier = Modifier.fillMaxSize(),
                navController = navController
            )
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = PrimaryDestination.Store.startRoute
        ){
            composable(route = PrimaryDestination.Store.startRoute){
                Store()
            }
            composable(route = PrimaryDestination.Store.startRoute){
                Explore()
            }
            composable(route = PrimaryDestination.Store.startRoute){
                Cart()
            }
            composable(route = PrimaryDestination.Store.startRoute){
                Favorites()
            }
            composable(route = PrimaryDestination.Store.startRoute){
                Profile()
            }
        }

    }

}