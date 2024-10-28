// PlaceAdapter.kt
package com.example.uts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(
    private val places: List<Place>,
    private val onClick: (Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]
        holder.bind(place)
        holder.itemView.setOnClickListener { onClick(place) }
    }

    override fun getItemCount(): Int = places.size

    inner class PlaceViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nameTextView: TextView = view.findViewById(R.id.placeName)
        private val locationTextView: TextView = view.findViewById(R.id.placeLocation)
        private val ratingTextView: TextView = view.findViewById(R.id.placeRating)
        private val imageView: ImageView = view.findViewById(R.id.placeImage)

        fun bind(place: Place) {
            nameTextView.text = place.name
            locationTextView.text = place.location
            ratingTextView.text = place.rating.toString()
            imageView.setImageResource(place.imageResource)
        }
    }
}
