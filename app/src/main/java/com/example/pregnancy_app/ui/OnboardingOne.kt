package com.example.pregnancy_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.pregnancy_app.R
import com.example.pregnancy_app.adapter.OnboardRecyclerViewAdapter

class OnboardingOne : Fragment(), OnboardRecyclerViewAdapter.Listener {
    private lateinit var adapter: OnboardRecyclerViewAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.onboarding1_list_layout, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val affirmationList = mutableListOf("My pregnant body is absolutely beautiful",
        "I rest when I need to",
        "I'm important",
        "I am a strong woman",
        "Making mistakes is OK",
        "My baby senses the peace I feel")
        adapter = OnboardRecyclerViewAdapter(affirmationList, this)
        val recyclerView = view.findViewById<RecyclerView>(R.id.photos_grid)
        recyclerView.adapter = adapter
    }

    override fun onImageClicked(index: Int, view: View) {
        TODO("not yet implemented")
    }

}