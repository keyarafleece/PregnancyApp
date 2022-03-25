package com.example.pregnancy_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pregnancy_app.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val affirmationID = intent.getIntExtra(AFFIRMATION_ID_EXTRA, -1)
        val affirmation = affirmationFromID(affirmationID)
        if(affirmation != null)
        {
            binding.cover.setImageResource(affirmation.cover)
            binding.title.text = affirmation.title
            binding.description.text = affirmation.description
            binding.author.text = affirmation.author
        }
    }

    private fun affirmationFromID(affirmationID: Int): Affirmation?
    {
        for(Affirmation in affirmationsList)
        {
            if(Affirmation.id == affirmationID)
                return Affirmation
        }
        return null
    }
}