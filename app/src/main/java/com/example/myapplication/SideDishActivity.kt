package com.example.Myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class SideDishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_dish)

        val cb1 = findViewById<CheckBox>(R.id.cbSide1)
        val cb2 = findViewById<CheckBox>(R.id.cbSide2)
        val cb3 = findViewById<CheckBox>(R.id.cbSide3)
        val btnSave = findViewById<Button>(R.id.btnSaveSides)

        btnSave.setOnClickListener {
            val sides = ArrayList<String>()
            if (cb1.isChecked) sides.add(cb1.text.toString())
            if (cb2.isChecked) sides.add(cb2.text.toString())
            if (cb3.isChecked) sides.add(cb3.text.toString())
            OrderRepo.order.sides = sides
            finish()
        }
    }
}
