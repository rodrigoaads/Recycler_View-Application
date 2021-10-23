package com.rodrigoaads.recyclerviewapplication


object ItemList {
    val itemRepository = mutableListOf<ItemModel>()
}

class Repository {
    fun createItem(itemModel: ItemModel){
        ItemList.itemRepository.add(itemModel)
    }
}