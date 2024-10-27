package com.example.travelgo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DestinationAdapter(private val destinations: List<Destination>) :
    RecyclerView.Adapter<DestinationAdapter.DestinationViewHolder>() {

    inner class DestinationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageDestination: ImageView = itemView.findViewById(R.id.imageDestination)
        val textDestinationName: TextView = itemView.findViewById(R.id.textDestinationName)
        val textDestinationLocation: TextView = itemView.findViewById(R.id.textDestinationLocation)
        val textDestinationRating: TextView = itemView.findViewById(R.id.textDestinationRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_destination, parent, false)
        return DestinationViewHolder(view)
    }

    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val destination = destinations[position]
        holder.imageDestination.setImageResource(destination.imageResId)
        holder.textDestinationName.text = destination.name
        holder.textDestinationLocation.text = destination.location
        holder.textDestinationRating.text = destination.rating
    }

    override fun getItemCount() = destinations.size
}
