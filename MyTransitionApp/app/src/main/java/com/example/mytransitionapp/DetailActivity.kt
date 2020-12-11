package com.example.mytransitionapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    companion object {
        const val IMG_EXTRA = "image_extra"
        const val TEXT_EXTRA = "text_extra"
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvSetImage:ImageView = findViewById(R.id.food_Detail_Photo)
        val tvSetDetail:TextView = findViewById(R.id.food_Detail_Text)
        val tvSetName:TextView = findViewById(R.id.detaiiiiiil)

        val tvImage = intent.getIntExtra(IMG_EXTRA, 0)
        val tvText = intent.getStringExtra(TEXT_EXTRA)
        val tvName = intent.getStringExtra(NAME_EXTRA)
        tvSetDetail.text = tvText
        tvSetName.text = tvName

        Glide.with(this)
                .load(tvImage)
                .apply(RequestOptions())
                .into(tvSetImage)

        title = "$tvName"


    }
}