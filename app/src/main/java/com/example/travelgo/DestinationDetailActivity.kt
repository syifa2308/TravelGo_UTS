package com.example.travelgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelgo.databinding.ActivityDestinationDetailBinding

class DestinationDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDestinationDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDestinationDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan data dari intent
        val imageResId = intent.getIntExtra("imageResId", 0)
        val name = intent.getStringExtra("name")
        val location = intent.getStringExtra("location")
        val rating = intent.getStringExtra("rating")
        val description = intent.getStringExtra("description")

        // Set data ke tampilan
        binding.imageDestination.setImageResource(imageResId)
        binding.textDestinationName.text = name
        binding.textDestinationLocation.text = location
        binding.textDestinationRating.text = rating
        binding.textDestinationDescription.text = description
    }
}
