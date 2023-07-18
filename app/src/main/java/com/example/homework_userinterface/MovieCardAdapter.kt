package com.example.homework_userinterface

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


class MovieCardAdapter( context: Context, resource: Int, private var cards: List<MovieCard>) :
    ArrayAdapter<MovieCard>(context, resource, cards) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        var view = convertView
        if (view == null) {
            view = inflater.inflate(R.layout.hui_movie_card, parent, false)
            val imageView = view.findViewById<ImageView>(R.id.movie_imageView)
            val ageCategoryView = view.findViewById<TextView>(R.id.movie_ageCategory)
            val genreView = view.findViewById<TextView>(R.id.movie_genre)
            val titleView = view.findViewById<TextView>(R.id.movie_title)
            val ratingView = view.findViewById<LinearLayout>(R.id.movie_rating)

            val movieCard: MovieCard = cards[position]

            imageView.setImageResource(context.resources.getIdentifier(movieCard.picture, "drawable", context.packageName))
            ageCategoryView.text = movieCard.ageCategory
            genreView.text = movieCard.genre
            titleView.text = movieCard.title
            for (e in 0 until movieCard.rating.length) {
                val image: ImageView = ratingView.getChildAt(e) as ImageView
                image.setColorFilter(R.color.toolbarIconColor)
            }
        }
        view!!.setOnClickListener { (context as NavigationHost).navigateTo(MoviesDetail(), false) }

        return view!!
    }
}