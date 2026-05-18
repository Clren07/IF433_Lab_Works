package oop_120741_clerensiacatherine.week12

fun main (){
    println("=== Test Runcatching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}