package com.catalyst.grocerystores.domain.repositories

import com.catalyst.grocerystores.data.remote.request.LoginRequest
import com.catalyst.grocerystores.data.remote.response.LoginResponse

interface UserRepository {
    suspend fun login(request: LoginRequest) : LoginResponse
}