package com.example.Myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvSummary: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSummary = findViewById(R.id.tvSummary)

        findViewById<Button>(R.id.btnMainMeal).setOnClickListener {
            startActivity(Intent(this, MainMealActivity::class.java))
        }

        findViewById<Button>(R.id.btnSideDish).setOnClickListener {
            startActivity(Intent(this, SideDishActivity::class.java))
        }

        findViewById<Button>(R.id.btnDrink).setOnClickListener {
            startActivity(Intent(this, DrinkActivity::class.java))
        }

        findViewById<Button>(R.id.btnConfirm).setOnClickListener {
            startActivity(Intent(this, ConfirmActivity::class.java))
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            OrderRepo.clear()
            updateSummary()
        }

        updateSummary()
    }

    override fun onResume() {
        super.onResume()
        updateSummary()
    }

    private fun updateSummary() {
        val o = OrderRepo.order
        val main = o.main ?: "尚未選擇主餐"
        val sides = if (o.sides.isEmpty()) "尚未選擇副餐" else o.sides.joinToString(", ")
        val drink = o.drink ?: "尚未選擇飲料"
        tvSummary.text = "主餐: $main\n副餐: $sides\n飲料: $drink"
    }
}
