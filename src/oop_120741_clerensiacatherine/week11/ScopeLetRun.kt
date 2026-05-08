package oop_120741_clerensiacatherine.week11

fun main(){
    println ("=== Test Let Function ===")
    val name: String? = "Alexander"

    val length = name?.let{
        println("Nama terdeteksi: $it")
        it.length
    }

    println("Panjang nama: $length")
}