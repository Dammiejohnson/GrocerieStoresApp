package com.catalyst.grocerystores.data.remote

import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST("api/v1/auth/login")
    suspend fun login(@Body request: )
}