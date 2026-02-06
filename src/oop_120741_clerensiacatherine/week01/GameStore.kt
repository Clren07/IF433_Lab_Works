package oop_120741_clerensiacatherine.week01

fun main (){
    val gameTitle = "Mini Game"
    val price = 50000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 80) / 100 else (price * 90) / 100
