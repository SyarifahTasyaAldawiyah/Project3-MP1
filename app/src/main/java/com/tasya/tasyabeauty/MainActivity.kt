package com.tasya.tasyabeauty

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_detail = findViewById<Button>(R.id.btn_detail)
        val btn_profile = findViewById<Button>(R.id.btn_profile)
        val btn_implicit_intent = findViewById<Button>(R.id.btn_implicit_intent)
        val btn_product = findViewById<Button>(R.id.btn_product)
        val btn_result = findViewById<Button>(R.id.btn_result)

        btn_detail.setOnClickListener {
            val detail = Intent(this@MainActivity, DetailActivity::class.java)
            startActivity(detail)
        }

        btn_profile.setOnClickListener {
            val profile = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(profile)
        }

        btn_product.setOnClickListener {
            val product = Intent(this@MainActivity, ProductActivity::class.java)
            startActivity(product)
        }


        btn_implicit_intent.setOnClickListener {
            val phoneNumber = "089524569711"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }

        btn_result.setOnClickListener {
            val result = Intent(this@MainActivity, ResultActivity::class.java)
            startActivityForResult(result, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 200) {
            val view_content = findViewById<View>(R.id.view_content)
            val color = data?.getStringExtra(ResultActivity.EXTRA_COLOR)
            Log.d("Color", color.toString())
            view_content.setBackgroundColor(Color.parseColor(color.toString()))
        }
    }
}