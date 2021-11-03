package com.cupsofcode.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = getRandomFruit()
        }
    }

    private val fruits = listOf(
        "Apple",
        "Pear",
        "Pineapple",
        "Strawberry",
        "Melon",
        "Blueberry"
    )

    /**
     * Returns random fruit from fruits as String.
     */
    private fun getRandomFruit(): String {
        return fruits.random()
    }

}