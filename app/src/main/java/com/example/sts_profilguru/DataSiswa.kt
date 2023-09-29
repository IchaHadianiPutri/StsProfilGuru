package com.example.sts_profilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DataSiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_siswa)

        val button = findViewById<Button>(R.id.bckButton)

        button.setOnClickListener{
            val intent =Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}