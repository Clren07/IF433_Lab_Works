package oop_120741_clerensiacatherine.week03

class Player (val username: String){
    private var xp: Int = 0

    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        } else {
            val before=level
            xp += amount
            val after=level

            if(after>before) {
                println("Level Up! Selamat $username naik level $level")
            }

        }
    }
}
