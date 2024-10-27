package com.example.travelgo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi tombol Get Start
        val getStartButton: Button = findViewById(R.id.buttonGetStart)
        getStartButton.setOnClickListener {
            // Pindah ke DestinationActivity
            val intent = Intent(this, DestinationActivity::class.java)
            startActivity(intent)
        }
    }
}
