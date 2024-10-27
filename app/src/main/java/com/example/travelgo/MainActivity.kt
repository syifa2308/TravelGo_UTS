package com.example.travelgo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartButton: Button = findViewById(R.id.getStartButton)

        // Set onClick listener for the button
        getStartButton.setOnClickListener {
            // Intent untuk berpindah ke Activity lain
            val intent = Intent(this, DestinationActivity::class.java)
            startActivity(intent)
        }
    }
}
