package com.example.uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecommendationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set up data dan adapter untuk RecyclerView di sini
        val places = getPlaces()
        val adapter = PlaceAdapter(places) { place -> openDetail(place) }
        recyclerView.adapter = adapter
    }

    private fun getPlaces(): List<Place> {
        // Data contoh
        return listOf(
            Place("Candi Borobudur", "Magelang, Indonesia", "Description...", 4.8, R.drawable.borobudur),
            // Tambahkan data lainnya di sini
        )
    }

    private fun openDetail(place: Place) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("place", place)
        startActivity(intent)
    }
}
