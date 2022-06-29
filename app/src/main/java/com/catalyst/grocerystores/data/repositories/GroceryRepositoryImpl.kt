package com.catalyst.grocerystores.data.repositories

import com.catalyst.grocerystores.data.local.dao.GroceriesDAO
import com.catalyst.grocerystores.data.local.models.Grocery
import com.catalyst.grocerystores.domain.repositories.GroceryRepository
import kotlinx.coroutines.flow.Flow

class GroceryRepositoryImpl (
    private val groceryDao: GroceriesDAO
        ) : GroceryRepository{
    override suspend fun saveProduct(grocery: Grocery) {
        groceryDao.saveGrocery(grocery)
    }

    override fun getAllGroceries(): Flow<List<Grocery>> {
       return groceryDao.getAllGroceries()
    }


}