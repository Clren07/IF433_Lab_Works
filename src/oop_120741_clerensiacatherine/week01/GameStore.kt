package oop_120741_clerensiacatherine.week01

fun main (){
    val gameTitle = "Mini Game"
    val price = 50000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)
    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 80) / 100 else (price * 90) / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note : String?
) {
    println("=== STRUK PEMBELIAN GAME ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}