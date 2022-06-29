package com.catalyst.grocerystores.data.remote.response

import com.catalyst.grocerystores.data.remote.models.User

data class LoginResponse(
    val status : String,
    val token: String,
    val data: User
)
