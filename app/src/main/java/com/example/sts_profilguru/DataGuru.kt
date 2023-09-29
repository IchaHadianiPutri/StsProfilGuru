package com.example.sts_profilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DataGuru : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_guru)

        val button = findViewById<Button>(R.id.bkButton)

        button.setOnClickListener{
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}