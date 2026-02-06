package oop_120741_clerensiacatherine.week01

fun main() {
    val name = "John Thor"
    val score = 0

    //Concatenation gaya lama
    println("Name: $name, Score: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }
    println("Grade: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus (score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
