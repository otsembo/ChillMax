package com.example.chillmax.domain.models

data class TVAiringToday(
    val backdrop_path: String,
    val first_air_date: String,
    val genre_ids: List<Any>,
    val id: Int,
    val name: String,
    val origin_country: List<String>,
    val original_language: String,
    val original_name: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val vote_average: Double,
    val vote_count: Int
)