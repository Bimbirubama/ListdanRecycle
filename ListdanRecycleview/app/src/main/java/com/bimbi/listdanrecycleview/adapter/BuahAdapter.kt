package com.bimbi.listdanrecycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bimbi.listdanrecycleview.R
import com.bimbi.listdanrecycleview.model.ModelBuah

class BuahAdapter(private val itemList: List<ModelBuah>) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.gambar)
        val itemNama: TextView = itemView.findViewById(R.id.nama)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_images, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemNama.text = currentItem.nama
    }
}
