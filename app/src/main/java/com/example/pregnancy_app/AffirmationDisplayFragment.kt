package com.example.pregnancy_app

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.pregnancy_app.databinding.FragmentAffirmationDisplayBinding

class AffirmationDisplayFragment : Fragment() {
    class DetailActivity : AppCompatActivity() {
        private lateinit var binding: FragmentAffirmationDisplayBinding

        override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
            super.onCreateView(name, context, attrs)



            binding = FragmentAffirmationDisplayBinding.inflate(layoutInflater)


            val affirmationID = intent.getIntExtra(AFFIRMATION_ID_EXTRA, -1)
            val affirmation = affirmationFromID(affirmationID)
            if (affirmation != null) {
                binding.cover.setImageResource(affirmation.cover)
                binding.title.text = affirmation.title
                binding.description.text = affirmation.description
                binding.author.text = affirmation.author
            }

            return (binding.root) // set content for fragment instead of activity
        }


        private fun affirmationFromID(affirmationID: Int): Affirmation? {
            for (affirmation in affirmationsList) {
                if (affirmation.id == affirmationID)
                    return affirmation
            }
            return null
        }
    }
}