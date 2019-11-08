package com.amolsoftwares.rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button =
            findViewById(R.id.roll_btn) //This way we can get the tbn ref in kotlin
        //btnRoll.text = "Lets Roll a dice" //This will change the btn txt
        btnRoll.setOnClickListener {
            //Toast.makeText(this, "This btn is cliked", Toast.LENGTH_SHORT).show() //This is toast

            rollDice() //This is kotlin function or method where declared

        }
    }

    private fun rollDice() {
        val txtResult: TextView = findViewById(R.id.result_txt)

        val randomInt = Random.nextInt(6) + 1  //get Random Number 0 to 5 and add 1 to it

        txtResult.text = randomInt.toString()

    }
}
