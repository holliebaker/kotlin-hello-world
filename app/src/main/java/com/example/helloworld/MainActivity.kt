package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get a reference to the roll button and assign an onClick listener
        val button: Button = findViewById(R.id.button_roll)
        button.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val rollTextView: TextView = findViewById(R.id.text_roll_value)
        val diceImageView: ImageView = findViewById(R.id.image_dice)

        val rollValue: Int = (1..6).random()
        val rollImage = when (rollValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        rollTextView.text = getString(R.string.label_rolled) + rollValue.toString()

        diceImageView.setImageResource(rollImage)
        // updating the content description for TalkBack
        diceImageView.contentDescription = rollValue.toString()
    }
}
