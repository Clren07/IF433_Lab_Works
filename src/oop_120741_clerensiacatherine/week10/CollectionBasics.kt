package oop_120741_clerensiacatherine.week10

fun main() {
    println("=== TEST LIST ===")

    // Immutable List
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // ERROR
    println("Immutable List: $frameworks")

    // Mutable List
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}