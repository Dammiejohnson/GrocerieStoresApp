package com.catalyst.grocerystores.navigation.destinations

import com.catalyst.grocerystores.R

sealed class PrimaryDestination(
    val name: String,
    val startRoute: String,
    val rootRoute : String,
    val icon: Int
) {
    object Store : PrimaryDestination(
        name = "Store",
        startRoute = "store",
        rootRoute = "store_root",
        icon = R.drawable.store
    )
    object Explore : PrimaryDestination(
        name = "Explore",
        startRoute = "explore",
        rootRoute = "explore_root",
        icon = R.drawable.search
    )
    object Cart : PrimaryDestination(
        name = "Cart",
        startRoute = "cart",
        rootRoute = "cart_root",
        icon = R.drawable.cart
    )
    object Favorite : PrimaryDestination(
        name = "Favorite",
        startRoute = "favorite",
        rootRoute = "favorite_root",
        icon = R.drawable.liked
    )
    object Profile : PrimaryDestination(
        name = "Profile",
        startRoute = "profile",
        rootRoute = "profile_root",
        icon = R.drawable.profile
    )
}
