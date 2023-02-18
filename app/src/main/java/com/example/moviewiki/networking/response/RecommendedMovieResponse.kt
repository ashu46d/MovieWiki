package com.example.moviedb.data.networking.models.response

import com.example.moviedb.data.networking.models.Movie

data class RecommendedMovieResponse (
    val page: Int,
    val results: List<Movie>?)