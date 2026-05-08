package oop_120741_clerensiacatherine.week11

fun String.addGreeting(): String {
    return "Hello $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}