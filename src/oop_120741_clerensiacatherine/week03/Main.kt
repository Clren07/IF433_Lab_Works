package oop_120741_clerensiacatherine.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -100
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("Pajak yang harus dibayar: ${e.tax}")
}