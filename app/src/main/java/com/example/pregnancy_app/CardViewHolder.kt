package com.example.pregnancy_app

import androidx.recyclerview.widget.RecyclerView
import com.example.pregnancy_app.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: AffirmationClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindAffirmation(affirmation: Affirmation)
    {
        cardCellBinding.cover.setImageResource(affirmation.cover)
        cardCellBinding.title.text = affirmation.title
        cardCellBinding.shortAffirmation.text = affirmation.author

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(affirmation)
        }


    }
}