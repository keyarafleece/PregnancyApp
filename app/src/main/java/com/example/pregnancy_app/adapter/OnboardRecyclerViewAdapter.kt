package com.example.pregnancy_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pregnancy_app.R

class OnboardRecyclerViewAdapter : RecyclerView.Adapter<OnboardRecyclerViewAdapter.OnboardViewHolder>() {
    private val affirmationText = mutableListOf<String>()

    inner class OnboardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView3)
        val textView: TextView = view.findViewById(R.id.textView3)
    }
    // Create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.onboarding_layout, parent, false)
        return OnboardViewHolder(view)
    }
    // Replace the contents of a view
    override fun onBindViewHolder(holder: OnboardViewHolder, position: Int) {
        holder.textView.text=affirmationText[position]
        holder.imageView.setImageResource(R.drawable.pregnant_image_3)
    }
    // Return the size of your dataset
    override fun getItemCount(): Int {
        return affirmationText.size
    }
}