package oop_120741_clerensiacatherine.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {

    println("=== Test Apply ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== Test Also ===")
    val numbers = mutableListOf(1, 2, 3)

    numbers.also {
        println("Log sebelum ditambah: $it")
    }.add(4)

    println("Setelah ditambah: $numbers")

    println("\n=== Test With ===")
    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }

    println("\n=== Apply + Also ===")
    val newUser = User("Budi", 20).apply {
        age = 21
    }.also {
        println("User baru berhasil dibuat: $it")
    }
}