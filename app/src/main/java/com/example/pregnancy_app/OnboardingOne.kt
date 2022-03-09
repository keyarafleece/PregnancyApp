package com.example.pregnancy_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class OnboardingOne: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.onboarding1_layout_resource_file, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        view.findViewById<Button>(R.id.button_onboarding1).setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_onboardingOne_to_onboardingTwo)
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_activity_main).setOnClickListener {
            val profileToMainFeed =
                ProfileFragmentDirections.actionProfileFragmentToMainFeedFragment()
            findNavController().navigate(profileToMainFeed)
        }

 */
        }
    }
}