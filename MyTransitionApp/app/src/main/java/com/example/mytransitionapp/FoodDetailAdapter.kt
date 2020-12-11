package com.example.mytransitionapp

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

class FoodDetailAdapter(private val foodDetail: ArrayList<FoodDetail>) : RecyclerView.Adapter<FoodDetailAdapter.ListViewholder>() {

    inner class ListViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvPhotoDetail: ImageView = itemView.findViewById(R.id.food_Detail_Photo)
        var tvDetailText: TextView = itemView.findViewById(R.id.food_Detail_Text)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int):FoodDetailAdapter.ListViewholder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_detail, viewGroup, false)
        return ListViewholder(view)
    }
    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        val detail = foodDetail[position]

        Glide.with(holder.itemView.context)
                .load(detail.detailPhoto)
                .apply(RequestOptions().override(55,55))
                .into(holder.tvPhotoDetail)

        holder.tvDetailText.text = detail.detailText

    }

    override fun getItemCount(): Int {
        return foodDetail.size
    }

}