package com.asterisk.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        val changeBtn = findViewById<Button>(R.id.btn_change)
        val container = findViewById<ConstraintLayout>(R.id.container)
        val changeBackgroundBtn = findViewById<Button>(R.id.btn_change_background)
        val changeTextBtn = findViewById<Button>(R.id.btn_change_text)
        val changeCustomTextBtn = findViewById<Button>(R.id.btn_add_custom_text)
        val inputText = findViewById<EditText>(R.id.et_text)

        changeBtn.setOnClickListener {
            text.setTextColor(resources.getColor(R.color.gold))
        }

        changeBackgroundBtn.setOnClickListener {
            container.setBackgroundColor(resources.getColor(R.color.dark_green))
        }

        changeTextBtn.setOnClickListener {
            text.text = getString(R.string.text_value)
        }

        container.setOnClickListener {
            text.text = getString(R.string.hello_from_kelechi)
            text.setTextColor(resources.getColor(R.color.white))
            container.setBackgroundColor(resources.getColor(R.color.teal_200))
        }

        changeCustomTextBtn.setOnClickListener {
            if (inputText.text.isEmpty()) {
                text.text = getString(R.string.error_text)
            } else {
                text.text = inputText.text
                inputText.setText("")
            }

        }

    }
}