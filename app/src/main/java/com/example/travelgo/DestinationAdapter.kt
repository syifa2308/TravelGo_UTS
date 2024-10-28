package com.example.travelgo

import android.content.Intent // Import Intent here
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DestinationAdapter(private val destinations: List<Destination>) : RecyclerView.Adapter<DestinationAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageDestination)
        val nameTextView: TextView = view.findViewById(R.id.textDestinationName)
        val locationTextView: TextView = view.findViewById(R.id.textDestinationLocation)
        val ratingTextView: TextView = view.findViewById(R.id.textDestinationRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.destination_borobudur, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val destination = destinations[position]
        holder.imageView.setImageResource(destination.imageResId)
        holder.nameTextView.text = destination.name
        holder.locationTextView.text = destination.location
        holder.ratingTextView.text = destination.rating

        // Set the click listener to navigate to DestinationDetailActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DestinationDetailActivity::class.java)
            intent.putExtra("imageResId", destination.imageResId)
            intent.putExtra("name", destination.name)
            intent.putExtra("location", destination.location)
            intent.putExtra("rating", destination.rating)
            intent.putExtra("description", destination.description) 
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = destinations.size
}
