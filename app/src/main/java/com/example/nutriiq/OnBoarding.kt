package com.example.nutriiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button



class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        val btnMulai : Button = findViewById(R.id.btnMulai)

        btnMulai.setOnClickListener{
            val intent = Intent(this@OnBoarding,MasukPage::class.java)
            startActivity(intent)
        }
    }
}