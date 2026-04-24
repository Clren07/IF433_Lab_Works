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

    println("\n=== HOF: FILTER (WINNING TRADES) ===")
    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("Hasil WINNING TRADES:")
    winningTrades.forEach {
        println("${it.pair} | ${it.position} | +${it.roe}%")
    }

    println("\n=== HOF: FILTER (LOSING TRADES) ===")
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("Hasil LOSING TRADES:")
    losingTrades.forEach {
        println("${it.pair} | ${it.position} | ${it.roe}%")
    }

    println("\n=== HOF: SORTEDBYDESCENDING + MAP (TOP PERFORMERS) ===")
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    println("Hasil TOP PERFORMERS:")
    topPerformersString.forEach {
        println(it)
    }

    println("\n=== HOF: SORTEDBY + MAP (WORST PERFORMERS) ===")
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    println("Hasil WORST PERFORMERS:")
    worstPerformersString.forEach {
        println(it)
    }

    println("\n=== HOF: MAP + TOSET (UNIQUE PAIRS) ===")
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    println("Hasil UNIQUE PAIRS:")
    uniquePairs.forEach {
        println(it)
    }

    println("\n=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach {
        println(it)
    }

    println("\n=== WORST PERFORMERS ===")
    worstPerformersString.forEach {
        println(it)
    }

    println("\n=== TRADED PAIRS ===")
    uniquePairs.forEach {
        println(it)
    }


}
