package oop_120741_clerensiacatherine.week07

object GameManager {
    var isRunning: Boolean = false

    fun startGame() {
        if (isRunning) {
            println("Game sudah berjalan! Mencegah inisiasi ganda")
        } else {
            isRunning = true
            println("Memulai Game Engine...")
        }
    }

}