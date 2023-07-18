package com.example.homework_userinterface

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), NavigationHost {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hui_main_activity)

        val moviesTitle = resources.getStringArray(R.array.movies_title)
        val moviesGenre = resources.getStringArray(R.array.movies_genre)
        val moviesAgeCategory = resources.getStringArray(R.array.movies_age_category)
        val moviesRating = resources.getStringArray(R.array.movies_rating)
        val moviesPicture = resources.getStringArray(R.array.movies_picture)

        val cardList = ArrayList<MovieCard>()

        for (e in moviesTitle.indices) {
            cardList.add(MovieCard(moviesTitle[e], moviesGenre[e], moviesAgeCategory[e], moviesRating[e], moviesPicture[e]))
        }
        val gridLayout = findViewById<GridView>(R.id.movies_grid)
        gridLayout.adapter = MovieCardAdapter(this, R.id.movie_card_frame, cardList)


//
//        if (savedInstanceState == null) {
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.container, MoviesDetail())
//                .commit()
//        }
    }

    override fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)

        if (addToBackstack) {
            transaction.addToBackStack(null)
        }

        transaction.commit()
    }
}
