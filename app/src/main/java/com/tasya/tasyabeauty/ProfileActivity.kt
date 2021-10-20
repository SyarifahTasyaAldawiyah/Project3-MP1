package com.tasya.tasyabeauty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_back = findViewById<Button>(R.id.btn_back)
        val btn_follow = findViewById<Button>(R.id.btn_follow)
        val lbl_text = findViewById<TextView>(R.id.lbl_text)


        btn_follow.setOnClickListener {
            btn_follow.text = "Mengikuti"
            lbl_text.text = "3501"
        }

        btn_back.setOnClickListener {
            val back = Intent(this@ProfileActivity, MainActivity::class.java)
            startActivity(back)
        }
    }
}