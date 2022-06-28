package com.catalyst.grocerystores.auth.state

data class AuthState (
    val isAuthenticated: Boolean = false,
    val isLoading: Boolean = false,
    val errorOccured: Boolean = false,
    val errorMessage: String = ""


        )