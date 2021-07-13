package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var box_one_text: View
    lateinit var box_two_text: View
    lateinit var box_three_text: View
    lateinit var box_four_text: View
    lateinit var box_five_text: View
    lateinit var constraint_layout: View
    lateinit var red_button: View
    lateinit var blue_button: View
    lateinit var yellow_button: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box_one_text = findViewById<View>(R.id.box_one_text)
        box_two_text = findViewById<View>(R.id.box_two_text)
        box_three_text = findViewById<View>(R.id.box_three_text)
        box_four_text = findViewById<View>(R.id.box_four_text)
        box_five_text = findViewById<View>(R.id.box_five_text)
        constraint_layout = findViewById<View>(R.id.constraint_layout)
        red_button = findViewById<View>(R.id.red_button)
        blue_button = findViewById<View>(R.id.blue_button)
        yellow_button = findViewById<View>(R.id.yellow_button)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text,
                        box_two_text,
                        box_three_text,
                        box_four_text,
                        box_five_text,
                        constraint_layout,
                        red_button,
                        blue_button,
                        yellow_button)

        for(item in clickableViews) {
            item.setOnClickListener {makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
       when (view.id) {
           //Using Color class
           R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
           R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

           //Using Android Colors
           R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
           R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
           R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_light)

           //Using Custom Colors
           R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
           R.id.blue_button -> box_four_text.setBackgroundResource(R.color.my_blue)
           R.id.yellow_button -> box_five_text.setBackgroundResource(R.color.my_yellow)

           else -> view.setBackgroundColor(Color.LTGRAY)
       }
    }
}