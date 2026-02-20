package oop_120741_clerensiacatherine.week03

class Employee (val name: String) {
    var salary: Int = 0
        set (value) {
            if (value < 0) {
                println("Error: Gaji tidak boleh negatif! Diset ke 0.")
                field = 0 //Gunakan field, bukan this.salary
            } else {
                println("Mencoba set gaji ke: $value")
                field = value //Gunakan field untuk assign nilai asli
            }


        }

    //Hanya bisa diakss di file/class ini saja
    private var performanceRating: Int = 3

    fun increasePerformanceRating() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating)
    }

    //Kita tidak bbuat getter untuk performanceRating, jadi data ini benar-benar rahasia
    //Kecuali kita membuat function khusus untuk print.

    fun printStatus() {
        println("Karyawan $name, Rating: $performanceRating")
    }

}
