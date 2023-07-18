package com.example.homework_userinterface

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MoviesDetail : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hui_movie_detail)

        val button = findViewById<ImageButton>(R.id.arrow_back_button)
        button.setOnClickListener { finish() }

    }
}
