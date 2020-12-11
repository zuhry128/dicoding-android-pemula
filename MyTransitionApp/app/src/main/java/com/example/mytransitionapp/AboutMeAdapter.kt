package com.example.mytransitionapp

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutMeAdapter(private val aboutData:ArrayList<About>) : RecyclerView.Adapter<AboutMeAdapter.ListviewHolder>() {

    inner class ListviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvProfilePhoto:ImageView = itemView.findViewById(R.id.img_profile_photo)
        var tvUserName:TextView = itemView.findViewById(R.id.tv_userName)
        var tvUserEmail:TextView = itemView.findViewById(R.id.tv_userEmail)
    }

    override fun onCreateViewHolder(ViewGroup: ViewGroup, i: Int): ListviewHolder {
        val view = LayoutInflater.from(ViewGroup.context).inflate(R.layout.about_me, ViewGroup, false)
        return ListviewHolder(view)
    }

    override fun onBindViewHolder(holder: AboutMeAdapter.ListviewHolder, position: Int) {
        val about = aboutData[position]

        Glide.with(holder.itemView.context)
                .load(about.userPhoto)
                .apply(RequestOptions().override(55, 55))
                .into(holder.tvProfilePhoto)

        holder.tvUserName.text = about.userName
        holder.tvUserEmail.text = about.userEmail
    }

    override fun getItemCount(): Int {
        return aboutData.size
    }
}