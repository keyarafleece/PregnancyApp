package com.example.pregnancy_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hide title bar
        getSupportActionBar()?.hide()

        setContentView(R.layout.activity_main)
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        // get reference to button
        val btn_click_me = findViewById(R.id.button_activity_main) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            // code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
    }
