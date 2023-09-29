package com.example.sts_profilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnGuru)
        val button1 = findViewById<Button>(R.id.btnSiswi)

        button.setOnClickListener{
            val Intent = Intent( this, DataGuru::class.java)
            startActivity(Intent)
        }

        button1.setOnClickListener{
            val Intent = Intent( this, DataSiswa::class.java)
            startActivity(Intent)
        }
    }
}