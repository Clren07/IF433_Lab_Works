package oop_120741_clerensiacatherine.week12

fun main (){
    println("=== Test Runcatching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover{0}.getOrNull()
    println("Recovered Value: $recovered")
}