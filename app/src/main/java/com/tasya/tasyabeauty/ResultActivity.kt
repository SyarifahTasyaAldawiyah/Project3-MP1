package com.tasya.tasyabeauty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class ResultActivity : AppCompatActivity() {
            companion object{
                const val RESULT_CODE = 200
                const val EXTRA_COLOR = "extra_color"
            }

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_result)

                val btn_result = findViewById<Button>(R.id.btn_result)
                val rd_colors = findViewById<RadioGroup>(R.id.rd_colors)

                btn_result.setOnClickListener {
                    if (rd_colors.checkedRadioButtonId != 0) {
                        var value = "#FFFFC107"
                        when (rd_colors.checkedRadioButtonId) {
                            R.id.rd_merah -> value = "#ff0000"
                            R.id.rd_hijau -> value = "#00ff00"
                            R.id.rd_biru -> value = "#0000ff"
                            R.id.rd_hitam -> value = "#000000"
                        }
                        val result = Intent()
                        result.putExtra(EXTRA_COLOR, value)
                        setResult(200, result)
                        finish()
                    }
                }

        }

    }
