package com.example.composesubmission.repository

import com.example.composesubmission.model.Item
import com.example.composesubmission.model.ItemData

class ItemRepository {
    fun getItem(): List<Item> {
        return ItemData.itemsData
    }
    fun searchItem(query: String): List<Item>{
        return ItemData.itemsData.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}