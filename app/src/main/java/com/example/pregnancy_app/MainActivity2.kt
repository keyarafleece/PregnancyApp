package com.example.pregnancy_app

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pregnancy_app.databinding.ActivityMain2Binding
import com.example.pregnancy_app.databinding.ActivityMainBinding
import com.google.android.material.internal.ContextUtils.getActivity


class MainActivity2 : AppCompatActivity(), AffirmationClickListener {

        private lateinit var binding: ActivityMain2Binding

        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            binding = ActivityMain2Binding.inflate(layoutInflater)
            setContentView(binding.root)


            populateAffirmations()

            val MainActivity = this
            binding.recyclerView.apply {
                layoutManager = GridLayoutManager(applicationContext, 3)
                adapter = CardAdapter(affirmationsList, MainActivity)
            }
        }
        override fun onClick(affirmation: Affirmation)
        {
            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra(AFFIRMATION_ID_EXTRA, affirmation.id)
            startActivity(intent)
        }
        private fun populateAffirmations() {
            val week1 = Affirmation(
                R.drawable.week1image,
                "I will be a good parent.",
                "WEEK 1",
                "I have the power to do everything I need to accomplish today."
            )
            affirmationsList.add(week1)

            val week2 = Affirmation(
                R.drawable.week2image,
                "My baby loves me.",
                "WEEK 2",
                "I celebrate the time energy and effort I give to myself for a positive pregnancy experience."
            )
            affirmationsList.add(week2)

            val week3 = Affirmation(
                R.drawable.week3image,
                "I love my baby.",
                "WEEK 3",
                "Perfectionism is a lie. I give myself permission to start messy."
            )
            affirmationsList.add(week3)

            val week4 = Affirmation(
                R.drawable.week4image,
                "I am fearless and brave.",
                "WEEK 4",
                "I am built for pregnancy. My body and my baby know what to do",
            )
            affirmationsList.add(week4)

            val week5 = Affirmation(
                R.drawable.week5image,
                "I rest when I need to. I relax and take loving care of my body and my baby.",
                "WEEK 5",
                "All of the strength I need is inside me."
            )
            affirmationsList.add(week5)

            val week6 = Affirmation(
                R.drawable.week6image,
                "I am strong, happy and healthy.",
                "WEEK 6",
                "I can do it because I am doing it.",
            )
            affirmationsList.add(week6)

            val week7 = Affirmation(
                R.drawable.week7image,
                "Fear is a liar.",
                "WEEK 7",
                "My body knows what it is doing. I was made for this"
            )
            affirmationsList.add(week7)

            val week8 = Affirmation(
                R.drawable.week8image,
                "One day at a time.",
                "WEEK 8",
                "Rest is fuel. I’m allowed to relax when I need to.\n"
            )
            affirmationsList.add(week8)

            val week9 = Affirmation(
                R.drawable.week9image,
                "Sink into it.",
                "WEEK 9",
                "I will be a great parent."
            )
            affirmationsList.add(week9)

            val week10 = Affirmation(
                R.drawable.week10image,
                "I am totally relaxed and at ease.",
                "WEEK 10",
                "My baby can feel the peace I feel."
            )
            affirmationsList.add(week10)

            val week11 = Affirmation(
                R.drawable.week11image,
                "Change makes change.",
                "WEEK 11",
                "I love taking care of this body I’m in."
            )
            affirmationsList.add(week11)

            val week12 = Affirmation(
                R.drawable.week12image,
                "I am enough.",
                "WEEK 12",
                "My little one is safe inside the womb."
            )
            affirmationsList.add(week12)

            val week13 = Affirmation(
                R.drawable.week13image,
                "I create life.",
                "WEEK 13",
                "How I feel matters — to me and to my baby."
            )
            affirmationsList.add(week13)

            val week14 = Affirmation(
                R.drawable.week14image,
                "I am proud of me.",
                "WEEK 14",
                "I love my baby. I love myself."
            )
            affirmationsList.add(week14)

            val week15 = Affirmation(
                R.drawable.week15image,
                "I've got this.",
                "WEEK 15",
                "Look at my beautiful body."
            )
            affirmationsList.add(week15)

            val week16 = Affirmation(
                R.drawable.week16image,
                "I feel at ease.",
                "WEEK 16",
                "Peace is medicine. I will take it every day."
            )
            affirmationsList.add(week16)

            val week17 = Affirmation(
                R.drawable.week17image,
                "I am enough.",
                "WEEK 17",
                "I am strong and so is my baby. Together, we are strong.\n"
            )
            affirmationsList.add(week17)

            val week18 = Affirmation(
                R.drawable.week18image,
                "I am allowed to enjoy this.",
                "WEEK 18",
                "Peace is medicine. I will take it every day."
            )
            affirmationsList.add(week18)

            val week19 = Affirmation(
                R.drawable.week19image,
                "My family is safe.",
                "WEEK 19",
                "I am in control, at peace, and in balance."
            )
            affirmationsList.add(week19)

            val week20 = Affirmation(
                R.drawable.week20image,
                "I guide.",
                "WEEK 20",
                "I know what I’m doing. I know how to take care of my body."
            )
            affirmationsList.add(week20)

            val week21 = Affirmation(
                R.drawable.week21image,
                "My baby is a miracle.",
                "WEEK 21",
                "I am surrounded by love, support, and respect."
            )
            affirmationsList.add(week21)

            val week22 = Affirmation(
                R.drawable.week22image,
                "I love the baby bump.",
                "WEEK 22",
                "There is intelligence in every cell in my body."
            )
            affirmationsList.add(week22)

            val week23 = Affirmation(
                R.drawable.week23image,
                "I know how to do this.",
                "WEEK 23",
                "I look forward to meeting my baby."
            )
            affirmationsList.add(week23)

            val week24 = Affirmation(
                R.drawable.week24image,
                "I am safe.",
                "WEEK 24",
                "My birth experience is going to be exactly what it’s supposed to be."
            )
            affirmationsList.add(week24)

            val week25 = Affirmation(
                R.drawable.week25image,
                "My baby is safe.",
                "WEEK 25",
                "I can put my fear aside and focus on love."
            )
            affirmationsList.add(week25)

            val week26 = Affirmation(
                R.drawable.week26image,
                "My baby is happy",
                "WEEK 26",
                "My job is to be calm and peaceful. Everything will happen as it should."
            )
            affirmationsList.add(week26)

            val week27 = Affirmation(
                R.drawable.week27image,
                "My baby is safe.",
                "WEEK 27",
                "My strength is enough for this task."
            )
            affirmationsList.add(week27)

            val week28 = Affirmation(
                R.drawable.week28image,
                "My baby is relaxed and at ease.",
                "WEEK 28",
                "My body is powerful and knows what to do."
            )
            affirmationsList.add(week28)

            val week29 = Affirmation(
                R.drawable.week29image,
                "My baby is beautiful.",
                "WEEK 29",
                "I accept every moment of the birthing experience."
            )
            affirmationsList.add(week29)

            val week30 = Affirmation(
                R.drawable.week30image,
                "I am a good parent.",
                "WEEK 30",
                "I welcome the challenge of parenthood with gratitude and a warm heart filled with love."
            )
            affirmationsList.add(week30)

            val week31 = Affirmation(
                R.drawable.week31image,
                "I am beautiful.",
                "WEEK 31",
                "My baby is already so loved."
            )
            affirmationsList.add(week31)

            val week32 = Affirmation(
                R.drawable.week32image,
                "I love me.",
                "WEEK 32",
                "I put my trust in the body that has brought me here."
            )
            affirmationsList.add(week32)

            val week33 = Affirmation(
                R.drawable.week33image,
                "I am happy.",
                "WEEK 33",
                "My body is strong; my heart is strong; my mind is strong."
            )
            affirmationsList.add(week33)

            val week34 = Affirmation(
                R.drawable.week34image,
                "I am ready.",
                "WEEK 34",
                "We will do this together, my baby and me."
            )
            affirmationsList.add(week34)

            val week35 = Affirmation(
                R.drawable.week35image,
                "I am strong.",
                "WEEK 35",
                "There is magic in my body. It knows how to create."
            )
            affirmationsList.add(week35)

            val week36 = Affirmation(
                R.drawable.week36image,
                "I am brave.",
                "WEEK 36",
                "I am meant to do this. I am meant to be here."
            )
            affirmationsList.add(week36)

            val week37 = Affirmation(
                R.drawable.week37image,
                "I am loved.",
                "WEEK 37",
                "I am allowed to enjoy this experience. I welcome the unknown."
            )
            affirmationsList.add(week37)

            val week38 = Affirmation(
                R.drawable.week38image,
                "I am powerful.",
                "WEEK 38",
                "I will allow myself to be at peace."
            )
            affirmationsList.add(week38)

            val week39 = Affirmation(
                R.drawable.week39image,
                "I am excited.",
                "WEEK 39",
                "Labor and birth will be safe and peaceful."
            )
            affirmationsList.add(week39)

            val week40 = Affirmation(
                R.drawable.week40image,
                "I am body is capable.",
                "WEEK 40",
                "I will show kindness to myself."
            )
            affirmationsList.add(week40)

            val week41 = Affirmation(
                R.drawable.week41image,
                "My mind is calm.",
                "WEEK 41",
                "I am allowed to rest."
            )
            affirmationsList.add(week41)

            val week42 = Affirmation(
                R.drawable.week42image,
                "I release worry.",
                "WEEK 42",
                "I am surrounded by love. My baby is surrounded by love.\n"
            )
            affirmationsList.add(week42)


            affirmationsList.add(week1)
            affirmationsList.add(week2)
            affirmationsList.add(week3)
            affirmationsList.add(week4)
            affirmationsList.add(week5)
            affirmationsList.add(week6)
            affirmationsList.add(week7)
            affirmationsList.add(week8)
            affirmationsList.add(week9)
            affirmationsList.add(week10)
            affirmationsList.add(week11)
            affirmationsList.add(week12)
            affirmationsList.add(week13)
            affirmationsList.add(week14)
            affirmationsList.add(week15)
            affirmationsList.add(week16)
            affirmationsList.add(week17)
            affirmationsList.add(week18)
            affirmationsList.add(week19)
            affirmationsList.add(week20)
            affirmationsList.add(week21)
            affirmationsList.add(week22)
            affirmationsList.add(week23)
            affirmationsList.add(week24)
            affirmationsList.add(week25)
            affirmationsList.add(week26)
            affirmationsList.add(week27)
            affirmationsList.add(week28)
            affirmationsList.add(week29)
            affirmationsList.add(week30)
            affirmationsList.add(week31)
            affirmationsList.add(week32)
            affirmationsList.add(week33)
            affirmationsList.add(week34)
            affirmationsList.add(week35)
            affirmationsList.add(week36)
            affirmationsList.add(week37)
            affirmationsList.add(week38)
            affirmationsList.add(week39)
            affirmationsList.add(week40)
            affirmationsList.add(week41)
            affirmationsList.add(week42)

        }

    }
