package com.example.kotlinbasics

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_color_my_views.*

class ColorMyViews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)

        val clickable : List<View> = listOf(tv_text, box_two, box_three,box_four,box_five)
        for(items in clickable){
            items.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.tv_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}