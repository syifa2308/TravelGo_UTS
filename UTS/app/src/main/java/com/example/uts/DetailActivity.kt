// DetailActivity.kt
package com.example.uts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val place = intent.getSerializableExtra("place") as? Place
        place?.let {
            findViewById<TextView>(R.id.placeName).text = it.name
            findViewById<TextView>(R.id.placeLocation).text = it.location
            findViewById<TextView>(R.id.placeDescription).text = it.description
            findViewById<TextView>(R.id.placeRating).text = it.rating.toString()
            findViewById<ImageView>(R.id.placeImage).setImageResource(it.imageResource)
        }
    }
}
