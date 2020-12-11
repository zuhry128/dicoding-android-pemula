package com.example.mytransitionapp

import android.content.ClipData
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FoodListAdapter(private val foodList:ArrayList<Food>) : RecyclerView.Adapter<FoodListAdapter.ListViewholder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun onItemClick(onItemClickCallback:OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvname: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvdetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgphoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewholder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_food, viewGroup, false)
        return ListViewholder(view)
    }

    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        val food = foodList[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgphoto)

        holder.tvname.text =  food.name
        holder.tvdetail.text = food.detail

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClick(foodList[holder.adapterPosition])
        }

    }


    interface OnItemClickCallback {
        fun onItemClick(data: Food)
    }


    override fun getItemCount(): Int {
        return foodList.size
    }
}