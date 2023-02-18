package com.example.moviedb.data.networking.models.response

import com.example.moviedb.data.networking.models.Movie

data class PopularMovieResponse (
    val page: Int,
    val results: List<Movie>?)
