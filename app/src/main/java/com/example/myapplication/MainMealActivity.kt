package com.example.Myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainMealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_meal)

        val rg = findViewById<RadioGroup>(R.id.rgMainMeals)
        val btnSave = findViewById<Button>(R.id.btnSaveMain)

        btnSave.setOnClickListener {
            val checked = rg.checkedRadioButtonId
            if (checked != -1) {
                val rb = findViewById<RadioButton>(checked)
                OrderRepo.order.main = rb.text.toString()
            }
            finish()
        }
    }
}
