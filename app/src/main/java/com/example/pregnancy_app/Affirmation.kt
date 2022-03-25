package com.example.pregnancy_app

    var affirmationsList = mutableListOf<Affirmation>()

    val AFFIRMATION_ID_EXTRA = "affirmationExtra"

    class Affirmation(
        var cover: Int,
        var author: String,
        var title: String,
        var description: String,
        val id: Int? = affirmationsList.size
    )
