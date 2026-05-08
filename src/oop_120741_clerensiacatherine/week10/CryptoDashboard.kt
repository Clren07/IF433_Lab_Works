package oop_120741_clerensiacatherine.week10

// CryptoDashboard.kt

fun main() {

    // Repository Coin
    val coinRepo = WalletRepository<Coin>()

    // Tambah data coin
    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 10.5))
    coinRepo.add(Coin("USDT", 5000.0))

    // Bungkus dalam response
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Print dashboard
    println("Status Response: ${response.status}")
    println("=== Coin Wallet Dashboard ===")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    // Search contoh
    println("\n=== Search Coin: BTC ===")
    coinRepo.searchByName("BTC").forEach {
        val coin = it as Coin
        println("Found: ${coin.name}, Balance: ${coin.balance}")
    }

    // Repository Transaction
    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250.75))
    txRepo.add(Transaction("TX002", 1000.00))
    txRepo.add(Transaction("TX003", 75.25))

    println("\n=== Transaction History ===")
    txRepo.getAll().forEach { tx ->
        println("Transaction ID: ${tx.id}, Amount: ${tx.amount}")
    }
}