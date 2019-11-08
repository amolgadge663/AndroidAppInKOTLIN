package com.amolsoftwares.rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_img)

        val btnRoll: Button = findViewById(R.id.roll_btn)
        btnRoll.setOnClickListener {

            rollDice() //This is kotlin function or method where declared

        }
    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1  //get Random Number 0 to 5 and add 1 to it
        val drawableRes = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceImage.setImageResource(drawableRes)

    }
}
