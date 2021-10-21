package com.rodrigoaads.recyclerviewapplication

val itemRepository = mutableListOf<ItemModel>()

class Repository {
    fun createItem(itemModel: ItemModel){
        itemRepository.add(itemModel)
    }
}