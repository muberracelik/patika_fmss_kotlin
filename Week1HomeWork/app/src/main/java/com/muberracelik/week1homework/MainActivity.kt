package com.muberracelik.week1homework

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)

        button.setOnClickListener {
            var rolledDice = rollDice()

            // Displaying the return value from the function as a toast message
            Toast.makeText(this, "Rolled $rolledDice ", Toast.LENGTH_SHORT).show()
        }
    }
    // Function that makes random dice come from 1 to 6
    private fun rollDice() : Int
    {
        val randomInt = Random.nextInt(6)+1
        val drawableResource = when(randomInt){
            1 -> R.drawable.ic_dice_1
            2 -> R.drawable.ic_dice_2
            3 -> R.drawable.ic_dice_3
            4 -> R.drawable.ic_dice_4
            5 -> R.drawable.ic_dice_5
            else -> R.drawable.ic_dice_6
        }
        imageView.setImageResource(drawableResource)
        return randomInt
    }
}
