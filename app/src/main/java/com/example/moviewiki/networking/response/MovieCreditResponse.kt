package com.example.moviedb.data.networking.models.response

import com.example.moviedb.data.networking.models.Actor


data class MovieCreditResponse(
    val id: Int,
    val cast: List<Actor>)
