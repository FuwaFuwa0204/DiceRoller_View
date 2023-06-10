package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button1)
        rollButton.setOnClickListener { rollDice() }

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener {
            countUp()
        }
        }

    private fun rollDice() {
        /*
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
        */
        var resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()


    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{
            var resultNumber = resultText.toString().toInt()
            if (resultNumber <6){
                resultNumber++
                resultText.text = resultNumber.toString()
            }
        }

    }
}