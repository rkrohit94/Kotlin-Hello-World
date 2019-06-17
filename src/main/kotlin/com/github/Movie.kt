package com.github

import java.net.URL
import java.time.Duration
import java.time.LocalDate
import java.time.Year
import java.util.*

enum class Genres {
    NORTH, ACTION, THRILLER, DRAMA
}

enum class Rated {
    PG13, PG18
}

data class Movie(val imdbID:String,
                 val title:String,
                 var releaseDate:LocalDate,
                 val genres:List<Genres>,
                 val director:String,
                 val actor:List<String>,
                 val actress:List<String>,
                 val duration: Int
                 ){

    var plot:String = ""
    var posterImage: String = ""
    var rated: Rated = Rated.PG13

    //    companion object {
//        fun createMovie() = Movie("3","The Dark Knight ", LocalDate.of(2000,1,1),listOf<Genres>(Genres.NORTH),"Christopher Nolan", listOf("Bale","heath ledger"),listOf("Monique Gabriela Curnen"),190)
//    }
//
    fun matchesYear(year: Int) = year == releaseDate.year


//    operator fun component1(): String {
//        return  this.imdbID
//    }
//
//    operator fun component2(): String {
//        return this.title
//    }

}