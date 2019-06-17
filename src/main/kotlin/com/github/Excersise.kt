package com.github


fun main(){
    print("Hello")

    val movieStore = movieStore{
        movie {
            name        = "3 Idiots"
            releaseDate = "25 Dec 2009"
            actors      = listOf("Aamir Khan"," adasd")
        }

        movie {
            name        = "dangal"
            releaseDate = "25 Dec 2015"
            actors      = listOf("Aamir Khan"," adasd")
        }
    }
}

class MovieHandler() {
    private val movieList = mutableListOf<mymovie>()

    fun movie(init:  mymovie.() -> Unit){
        val m = mymovie()

    }
}

 class mymovie(){
    var name: String = ""
     var releaseDate:String = ""
     var actors:List<String> = listOf("")

 }


fun movieStore(init: MovieHandler.() -> Unit): MovieHandler {

    val instance = MovieHandler()
    instance.init()
    return instance
}
