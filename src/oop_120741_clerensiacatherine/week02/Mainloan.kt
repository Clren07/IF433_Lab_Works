package oop_120741_clerensiacatherine.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val title = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan lama pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: tidak boleh minus
    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(
        bookTitle = title,
        borrower = borrower,
        loanDuration = duration
    )

    println("\n=== Detail Peminjaman ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}
