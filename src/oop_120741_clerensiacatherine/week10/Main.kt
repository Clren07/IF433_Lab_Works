package oop_120741_clerensiacatherine.week10

fun main(){
    println ("=== Test Generic Class ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println ("\n === Test Multiple Parameters ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println ("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
}