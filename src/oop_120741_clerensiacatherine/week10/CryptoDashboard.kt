package oop_120741_clerensiacatherine.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 10.5))
    coinRepo.add(Coin("USDT", 5000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Tampilkan Dashboard Coin
    println("Status Response: ${response.status}")
    println("=== Coin Wallet Dashboard ===")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    // Repository Transaction
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 250.75))
    txRepo.add(Transaction("TX002", 1000.00))
    txRepo.add(Transaction("TX003", 75.25))
}