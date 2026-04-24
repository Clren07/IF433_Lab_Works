package oop_120741_clerensiacatherine.week10

fun main (){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 8.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 25, 12.3, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 5, -2.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -7.0, "OPEN")
    )
    println("=== HOF FILTER CLOSED ===")
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    closedTrades.forEach {
        println(it)
    }
}
