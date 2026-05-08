package oop_120741_clerensiacatherine.week11

data class User(val name: String="", val age: Int=0)

fun main(){
    println("=== Test Apply ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== Test Also ===")
    val numbers = mutableListOf(1,2,3)
    numbers.also{
        println("Log sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("\n=== Test With ===")
    with(user){
        println("User Detail -> Nama: $name, Umur: $age")
    }
}