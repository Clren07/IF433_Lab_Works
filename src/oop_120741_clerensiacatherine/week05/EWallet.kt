package oop_120741_clerensiacatherine.week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        if (balance < amount){
            println("Saldo Tidak Cukup")
        }
        else if (balance>=amount){
            balance -= amount
            println("Pembayaran Berhasil. Sisa saldo: $balance")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Top up berhasil. Saldo: $balance")

    }
}