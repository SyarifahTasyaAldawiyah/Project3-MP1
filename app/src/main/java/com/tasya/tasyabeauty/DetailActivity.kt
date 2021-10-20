package com.tasya.tasyabeauty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener {
            val back = Intent(this@DetailActivity, MainActivity::class.java)
            startActivity(back)
        }
    }
}