package com.github

import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.Request
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import java.time.Duration
import java.time.LocalDate
import java.time.Year
import java.util.*

class MovieStore(val movieList: List<Movie>) {



//    companion object {
//        fun createMovieList() : List<Movie>{
//         val movie = Movie("3", "The Dark Knight ", LocalDate.of(2000, 1, 1), listOf<Genres>(Genres.NORTH), "Christopher Nolan", listOf("Bale", "heath ledger"), listOf("Monique Gabriela Curnen"), 190)
//            return listOf<Movie>(movie)
//        }
//    }

    fun findMoviesByYear(year: Int) = movieList.filter{ it.matchesYear(year)}

    fun findMoviesByDuration(duration: Int) : List<Movie>{
      return  movieList.filter {  it.duration > duration }
    }

    fun findMoviesByActor(actor: String) : List<Movie>{
        return  movieList.filter {  it.actor.contains(actor) }
    }

    fun findMoviesByActress(actress: String) : List<Movie>{
        return  movieList.filter {  it.actress.contains(actress) }
    }

    fun movieInMovieStore(movie : Movie) = movieList.contains(movie)

    fun sortMovies(movieList: List<Movie>) = movieList.sortedBy { it.duration }

    fun getMovieData(movie: Movie, apiCall:ApiCall): Movie{

        val data = apiCall.callApi()
        movie.plot = data["plot"] as String
        return movie

    }

}

class ApiCall{

    fun callApi(): Map<String, String> {
//      return  "http://www.omdbapi.com/?i=tt3896198&apikey=d08087a".httpGet().response()
        return mapOf("plot" to "The Guardians struggle to keep together ")
    }
}

fun main(){


//    val genres= listOf<String>("action")
//    val actors = listOf<String>("Tim Robbins","Morgan Freeman")
//    val actress = listOf<String>("William Sadler", "Bob Gunton")
//    val movie1 = Movie("1","The Shawshank Redemption", LocalDate.of(1994,1,1), listOf<Genres>(Genres.NORTH),"Frank Darabont",actors,actress,172,"","https://m.",Rated.PG13)
////    val movie2 = Movie("2","The Godfather", LocalDate.of(1998,1,1),listOf<Genres>(Genres.NORTH),"Francis Ford Coppola", listOf("Marlon Brando","Al Pacino"),actress,150)
////    val movie3 = Movie("3","The Dark Knight ", LocalDate.of(2000,1,1),listOf<Genres>(Genres.NORTH),"Christopher Nolan", listOf(),actress,190)
//
//    val movieList = listOf<Movie>()
//
//    val movieStore = MovieStore(movieList)
//
//    movieStore.getMovieData()
}