package com.example.travelgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DestinationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)  // Set layout hanya untuk activity_destination

        // Daftar contoh tempat wisata
        val destinations = listOf(
            Destination("Candi Borobudur", "Magelang, Indonesia", "4.8/5", R.drawable.candi_borobudur, "Candi Buddha terbesar di dunia."),
            Destination("Dufan", "Jakarta, Indonesia", "4.7/5", R.drawable.dufan, "Taman hiburan terkenal di Indonesia."),
            Destination("Pulau Kalimantung", "Sibolga, Sumatera Utara", "4.8/5", R.drawable.kalimantung, "Pulau yang indah dengan pantai yang bersih."),
            Destination("Labuan Bajo", "Nusa Tenggara Timur, Indonesia", "4.9/5", R.drawable.labuan_bajo, "Tempat terkenal untuk melihat komodo."),
            Destination("Pulau Karang", "Sumatera Utara, Indonesia", "4.8/5", R.drawable.karang, "Pulau kecil dengan pemandangan menakjubkan.")
        )

        // Atur RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewDestinations)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DestinationAdapter(destinations)
    }
}
