package oop_120741_clerensiacatherine.week11

data class User(val name: String="", val age: Int=0)

fun main(){
    println("=== Test Apply ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}