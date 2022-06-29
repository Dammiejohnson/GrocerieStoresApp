package com.catalyst.grocerystores.domain.repositories

import com.catalyst.grocerystores.data.local.models.Grocery
import kotlinx.coroutines.flow.Flow

interface GroceryRepository {
    suspend fun saveProduct(grocery: Grocery)
    fun getAllGroceries(): Flow<List<Grocery>>

}