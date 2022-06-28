package com.catalyst.grocerystores.data.remote.response

data class LoginResponse(
    val status : String,
    val token: String,
    val data: User
)
