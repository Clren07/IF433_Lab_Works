package oop_120741_clerensiacatherine.week11

fun main(){
    println("=== Test Extention Functions ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}