package com.tasya.tasyabeauty

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener {
            val back = Intent(this@ProductActivity, MainActivity::class.java)
            startActivity(back)
        }
    }
}