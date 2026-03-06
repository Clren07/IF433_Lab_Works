package oop_120741_clerensiacatherine.week05

abstract class PaymentMethod (val accountName: String){
    abstract fun processPayment(amount: Double)
}