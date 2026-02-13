package oop_120741_clerensiacatherine.week02

import java.util.Scanner

class Hero (
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack (targetName: String) {
        println("$name menebas $targetName")
    }
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

}

fun main (){
    val Scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = Scanner.nextLine()

    print("Masukkan Stat Damage: ")
    val baseDamage = Scanner.nextInt()

    val hero = Hero(name, baseDamage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0){
        println ("Menu")
        println ("1. Serang")
        println ("2. Kabur")
        println ("Pilih Aksi:")
        val pilih = Scanner.nextInt()
        Scanner.nextLine()

        if (pilih == 1){
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            println("Enemy HP : $enemyHp")

            if (enemyHp > 0) {
                println("Musuh membalas!")
                hero.takeDamage((10..20).random())
                println("Hero ${hero.name} HP : ${hero.hp}")
            }
        }

        if (pilih == 2) {
            println ("Hero ${hero.name} memilih kabur. Game Selesai")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Musuh MENANG!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}