package com.rodrigoaads.recyclerviewapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ItemAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items : List<ItemModel> = itemRepository

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ItemViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemViewHolder constructor(
       itemView: View
    ) : RecyclerView.ViewHolder(itemView){
        private val itemTitle = itemView.text_title
        private val itemDescription = itemView.text_description
        private val itemImage = itemView.image_item

        fun bind(itemModel: ItemModel){
            itemTitle.text = itemModel.name
            itemDescription.text = itemModel.description
            itemImage.setImageResource(R.drawable.ic_android_green)
        }
    }


}