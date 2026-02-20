package oop_120741_clerensiacatherine.week03

class Weapon  (val name: String) { //Val (read-only) tidak bisa diubah
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan damage tidak boleh bernilai negatif!")
                //nilai field tidak berubah
            } else if (value > 1000) {
                println("Peringatan Overpowered. Damage diatur menjadi 1000")
                field = 1000
            } else {
                field = value //nilai field berubah sesuai setter
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }

    fun printStatus() {
        println("Senjata $name, Damage: $damage, Tier: $tier")
    }
}

fun main(){
    val w = Weapon("AK-94")

    //Test Validasi Damage
    w.damage = -50 //Error
    w.damage = 9999 //Set ke 1000

    w.printStatus()
}