package com.example.Myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val btnConfirm = findViewById<Button>(R.id.btnConfirmSubmit)
        btnConfirm.setOnClickListener {
            val order = OrderRepo.order
            if (!order.isComplete()) {
                Toast.makeText(
                    this,
                    "請選擇主餐、至少一項副餐、以及飲料。",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }

            val msg = "主餐: ${order.main}\n" +
                    "副餐: ${order.sides.joinToString(", ")}\n" +
                    "飲料: ${order.drink}\n\n是否提交？"

            AlertDialog.Builder(this)
                .setTitle("確認訂單")
                .setMessage(msg)
                .setPositiveButton("Submit") { dialog, _ ->
                    dialog.dismiss()
                    Toast.makeText(this, "訂單已提交！", Toast.LENGTH_SHORT).show()
                    finish()
                }
                .setNegativeButton("取消", null)
                .show()
        }
    }
}
