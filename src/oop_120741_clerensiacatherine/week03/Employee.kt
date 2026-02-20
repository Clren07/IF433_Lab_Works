package oop_120741_clerensiacatherine.week03

class Employee (val name: String) {
    var salary: Int = 0
        set (value) {
            if (value < 0) {
                println("Error: Gaji tidak boleh negatif! Diset ke 0.")
                field = 0
            } else {
                println("Mencoba set gaji ke: $value")
                field = value
            }


        }

    private var performanceRating: Int = 3

    fun increasePerformanceRating() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1

}
