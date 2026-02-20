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
}
