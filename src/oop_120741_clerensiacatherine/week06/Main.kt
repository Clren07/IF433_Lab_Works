package oop_120741_clerensiacatherine.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("--> Memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    //Task
    val mySmartLamp = SmartLamp("1","Ruang Tamu")
    val mySmartSpeaker = SmartSpeaker ("1", "Google Nest Dapur")
    val mySmartCCTV = SmartCCTV("1", "Evziz Garasi")


}