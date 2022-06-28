package com.catalyst.grocerystores.auth.events

sealed class AuthEvent {
    data class Login (
        val email: String,
        val password: String
            ) : AuthEvent()

    object LOginSuccess : AuthEvent()
}
