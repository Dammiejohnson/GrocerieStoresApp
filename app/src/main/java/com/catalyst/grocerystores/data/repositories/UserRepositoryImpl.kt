package com.catalyst.grocerystores.data.repositories

import com.catalyst.grocerystores.data.remote.Api
import com.catalyst.grocerystores.data.remote.request.LoginRequest
import com.catalyst.grocerystores.data.remote.response.LoginResponse
import com.catalyst.grocerystores.domain.repositories.UserRepository

class UserRepositoryImpl(private val api: Api) : UserRepository {
    override suspend fun login(request: LoginRequest): LoginResponse {
        return api.login(request)
    }

}