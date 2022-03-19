package com.example.pregnancy_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.pregnancy_app.R

class OnboardingTwo: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.onboarding2_layout_resource_file, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        view.findViewById<Button>(R.id.button_onboarding2).setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_onboardingTwo_to_loginScreen)

        }
    }
}