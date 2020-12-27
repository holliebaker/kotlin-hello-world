package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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
        val rollValue: Int = (1..6).random()

        rollTextView.text = getString(R.string.label_rolled) + rollValue.toString()
    }
}
