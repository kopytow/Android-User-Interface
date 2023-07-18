package com.example.homework_userinterface

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.homework_userinterface.R.layout.hui_movie_detail

class MoviesDetail : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(hui_movie_detail, container, false)

        // Set up the toolbar
        setUpToolbar(view)

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun setUpToolbar(view: View) {
        val toolbar = view.findViewById<Toolbar>(R.id.app_bar)
        val activity = activity as AppCompatActivity?
        activity?.setSupportActionBar(toolbar)
    }
}
