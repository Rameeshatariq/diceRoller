package com.example.kotlinbasics

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinbasics.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val ctx : Context = this
    lateinit var dataBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        dataBinding.rollButton.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
            val randomInt = Random.nextInt(6) + 1

        val drawableRes = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice

        }

        dataBinding.diceImage.setImageResource(drawableRes)
        }
}