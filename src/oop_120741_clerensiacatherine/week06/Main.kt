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
    val mySmartLamp = SmartLamp("L01","Ruang Tamu")
    val mySmartSpeaker = SmartSpeaker ("S01", "Google Nest Dapur")
    val mySmartCCTV = SmartCCTV("C01", "Evziz Garasi")

    println("\n=== Testing Devices ===")
    val hub = SmartHomeHub()

    hub.addDevice(mySmartLamp)
    hub.addDevice(mySmartSpeaker)
    hub.addDevice(mySmartCCTV)

    hub.activeSecurityMode()
    hub.turnOnAllSwitches()
}