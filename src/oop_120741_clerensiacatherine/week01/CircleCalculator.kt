package oop_120741_clerensiacatherine.week01

fun main (args: Array<String>) {
    //Variable definition
    var radius: Double = 7.0
    var pi: Double = 13.4

    //Calculation
    var area: Double = radius * radius * pi

    //Output Concatenation
    println("Radius: " + radius + ", Area: " + area)

    //Logic Check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}