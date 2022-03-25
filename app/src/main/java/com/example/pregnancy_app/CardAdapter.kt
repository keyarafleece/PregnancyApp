package com.example.pregnancy_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pregnancy_app.databinding.CardCellBinding

class CardAdapter(
    private val affirmations: List<Affirmation>,
    private val clickListener: AffirmationClickListener
)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
        holder.bindAffirmation(affirmations[position])
    }

    override fun getItemCount(): Int = affirmations.size
}