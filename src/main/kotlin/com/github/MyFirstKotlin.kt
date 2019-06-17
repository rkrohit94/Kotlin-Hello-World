//package com.github
//
//import java.io.File
//import java.nio.charset.Charset
//import java.time.LocalDate
//import java.util.*
//
//
//fun main(args : Array<String>) {
//    println("Hello, World!")
//
//
//    val values = readFileDirectlyAsText()
////   val size: Int = values.replace("\n", " ").split(" ").size
////    println(size)
////   val word = values.replace("\n", " ").split(" ")
////
////
////   val givenWord = word.filter { it=="code" }
////    println(givenWord.size)
//
//    println(totalWord(values))
//    println(countGivenWord(values, "code"))
//
////   val x= Person("abc","xyz",9)
//    val genres= listOf<String>("action")
//    val actors = listOf<String>("Tim Robbins","Morgan Freeman")
//    val actress = listOf<String>("William Sadler", "Bob Gunton")
//    val movie1 = Movie("1","The Shawshank Redemption", LocalDate.of(1994,1,1), listOf<Genres>(Genres.NORTH),"Frank Darabont",actors,actress,172)
//    val movie2 = Movie("2","The Godfather", LocalDate.of(1998,1,1),listOf<Genres>(Genres.NORTH),"Francis Ford Coppola", listOf("Marlon Brando","Al Pacino"),actress,150)
//    val movie3 = Movie("3","The Dark Knight ", LocalDate.of(2000,1,1),listOf<Genres>(Genres.NORTH),"Christopher Nolan", listOf(),actress,190)
//
//    val movieList = listOf<Movie>(movie1,movie2,movie3)
//
//    val movieStore = MovieStore(movieList)
//    val movieDuration= movieStore.findMoviesByDuration(150)
////    val movieYear= movieStore.findMoviesByYear(1998)
//
//    println(movieDuration)
//
//    val (imdbID,title) = movieList[0]
//
//    println(title)
//
//
//}
//
//
//    fun totalWord(str : String): Int {
//        return str.split(" ").size
//    }
//
//    fun countGivenWord(str : String, w : String): Int {
//      return   str.split(" ").count{it == w}
//    }
//
//
//    fun readFileDirectlyAsText(): String
//            = File("/Users/vinitkumarrohela/rohit/kotlin-hello-world/src/main/resources/word-count.txt").readText()
