package com.example.mealplan.data

class FoodItemRepository (private val dao: FoodItemDao){
    suspend fun insertItem(foodItemData: FoodItemData): FoodItemData {
        val item: FoodItemData = dao.insert(foodItemData)
        return item
    }
    suspend fun deleteItem(foodItemData: FoodItemData) = dao.delete(foodItemData)
    fun getAllItems() = dao.getAllItems()
    fun searchItemsByName(name: String) = dao.searchItemsByName(name)
    fun getItemNutrients() = dao.getItemNutrients()
}