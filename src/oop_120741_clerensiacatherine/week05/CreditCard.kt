package oop_120741_clerensiacatherine.week05

class CreditCard (accountName: String, val limit: Double):PaymentMethod(accountName){
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        if((amount+usedAmount)<limit){
            usedAmount += amount
        } else if ((amount+usedAmount)>limit){
            println("Transaksi ditolak karena melebihi limit")
        }

    }
}