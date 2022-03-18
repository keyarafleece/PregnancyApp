package com.example.pregnancy_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pregnancy_app.adapter.OnboardRecyclerViewAdapter

class OnboardingOne: Fragment() {
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
        adapter= OnboardRecyclerViewAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.photos_grid)
        recyclerView.adapter = adapter
        }

}