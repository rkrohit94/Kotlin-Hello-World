package com.github

import io.kotlintest.Description
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.mockk.MockK
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.BeforeAll
import java.time.LocalDate

class HelloWorldTests : StringSpec() {



    init {
        val genres= listOf<String>("action")
        val actors = listOf<String>("Tim Robbins","Morgan Freeman")
        val actress = listOf<String>("William Sadler", "Bob Gunton")
        val movie1 = Movie("1","The Shawshank Redemption", LocalDate.of(1994,1,1),listOf<Genres>(Genres.NORTH),"Frank Darabont",actors,actress,172)
        val movie2 = Movie("2","The Godfather", LocalDate.of(1998,1,1),listOf<Genres>(Genres.NORTH),"Francis Ford Coppola", listOf("Marlon Brando","Al Pacino"),listOf("Marlon Brando","Al Pacino"),180)
        val movie3 = Movie("3","The Dark Knight ", LocalDate.of(2000,1,1),listOf<Genres>(Genres.NORTH),"Christopher Nolan", listOf("Bale","heath ledger"),listOf("Monique Gabriela Curnen"),190)
        val movieList = listOf<Movie>(movie1,movie2,movie3)

//        "my first test" {
//            HelloWorld().greetings() shouldBe "Hello World!!!"
//        }
//
//        "mock greetings test" {
//            val car = mockk<HelloWorld>()
//            every { car.greetings() } returns "How are you?"
//            car.greetings() shouldBe "How are you?"
//            verify { car.greetings() }
//        }
//
//        "should find the movie list with more than given duration" {
//            MovieStore(movieList).findMoviesByDuration(170).size shouldBe 2;
//            MovieStore(movieList).findMoviesByDuration(170) shouldContainExactly listOf(movie1,movie3)
//        }
//
//        "should not find the movie list with more than given duration" {
//            MovieStore(movieList).findMoviesByDuration(200).size shouldBe 0;
//        }
//
//        "should find the movie list with for given actor" {
//            MovieStore(movieList).findMoviesByActor("Bale").size shouldBe 1;
//        }
//
//        "should not find the movie list with for given actor" {
//            MovieStore(movieList).findMoviesByActor("Salman").size shouldBe 0;
//        }
//
//
//        "should find the movie list with for given actress" {
//            MovieStore(movieList).findMoviesByActress("Monique Gabriela Curnen").size shouldBe 1;
//        }
//
//        "should not find the movie list with for given actress" {
//            MovieStore(movieList).findMoviesByActress("Katrina").size shouldBe 0;
//        }
//
//
//        "should  find the movie list with for given Year" {
//            MovieStore(movieList).findMoviesByYear(2000).size shouldBe 1;
//        }
//
//
//        "should Not find the movie list with for given Year" {
//            MovieStore(movieList).findMoviesByYear(2001).size shouldBe 0;
//        }
//
////        "should Mock the matches Year to be always true" {
//////            MovieStore(movieList).findMoviesByYear(2001).size shouldBe 0;
////
////            val movie = mockk<Movie>()
////            every { movie.matchesYear(any()) } returns true
////            movie.matchesYear(2) shouldBe true
////            verify { movie.matchesYear(2) }
////
////        }
//
//        "should Sort Movies By Duration" {
//            MovieStore(movieList).sortMovies(movieList) shouldContainExactly listOf(movie2,movie1,movie3)
//        }
//
//        "should check if movie exist or not" {
////            val movie = Movie("1","The Shawshank Redemption", LocalDate.of(1994,1,1),listOf<Genres>(Genres.NORTH),"Frank Darabont",actors,actress,172)
//            MovieStore(movieList).movieInMovieStore(movie1) shouldBe  true
//        }

        "should mock the http request get" {
            //            val movie = Movie("1","The Shawshank Redemption", LocalDate.of(1994,1,1),listOf<Genres>(Genres.NORTH),"Frank Darabont",actors,actress,172)
//            MovieStore(movieList).movieInMovieStore(movie1) shouldBe  true

            val apiCall = mockk<ApiCall>()

            val movie = Movie("1","The Shawshank Redemption", LocalDate.of(1994,1,1),listOf<Genres>(Genres.NORTH),"Frank Darabont",actors,actress,172)

            every {  apiCall.callApi() } returns mapOf("plot" to "xyz ........")

            MovieStore(movieList).getMovieData(movie,apiCall).plot   shouldBe "xyz ........"

        }
    }
}