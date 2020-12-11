package com.example.mytransitionapp

import android.content.ClipData
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mytransitionapp.AboutMeData.aboutData

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var parcelList:ArrayList<FoodListAdapter> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()

        //for parsing data using kotlin, pls work im tired already


    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val foodListAdapter = FoodListAdapter(list)
        rvFoods.adapter = foodListAdapter

        foodListAdapter.onItemClick(object : FoodListAdapter.OnItemClickCallback {
            override fun onItemClick(food: Food) {
                val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
                moveIntent.putExtra(DetailActivity.IMG_EXTRA, food.photo)
                moveIntent.putExtra(DetailActivity.TEXT_EXTRA, food.detail)
                moveIntent.putExtra(DetailActivity.NAME_EXTRA, food.name)
                startActivity(moveIntent)
            }

        })

    }

    private fun showRecyclerAbout() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val aboutMeAdapter = AboutMeAdapter(aboutData)
        rvFoods.adapter = aboutMeAdapter
    }

    //Menu code blocks
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.about_me -> {
                title = "about me"
                showRecyclerAbout()
            }
        }
    }

}