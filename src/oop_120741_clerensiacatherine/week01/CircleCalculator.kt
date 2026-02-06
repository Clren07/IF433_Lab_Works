package oop_120741_clerensiacatherine.week01

fun main () {
    val radius = 7.0
    val pi = 13.4

    var area: Double = radius * radius * pi

    println("Radius: $radius , Area: $area")

   println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"