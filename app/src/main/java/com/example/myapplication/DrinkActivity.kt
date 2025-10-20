package com.example.Myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class DrinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        val rg = findViewById<RadioGroup>(R.id.rgDrinks)
        val btnSave = findViewById<Button>(R.id.btnSaveDrink)

        btnSave.setOnClickListener {
            val checked = rg.checkedRadioButtonId
            if (checked != -1) {
                val rb = findViewById<RadioButton>(checked)
                OrderRepo.order.drink = rb.text.toString()
            }
            finish()
        }
    }
}
