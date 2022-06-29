package com.catalyst.grocerystores.navigation.destinations



sealed class Destination(val name: String, val route: String) {
    object LoginDestination: Destination(name ="Login", route = "Login")

    object SignUpDestination: Destination(name ="SignUp", route = "Signup")
}
