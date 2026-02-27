package oop_120741_clerensiacatherine.week04

fun main () {
    println("---Testing Vehicle---")
    val generalVehicle = Vehicle ("Sepeda")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n ---Testing Car ---")
    val myCar = Car ("Toyota",4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n ---Testing Electric Car ---")
    val myElectricCar = ElectricCar("Wuling",2, 100)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n --- Manager ---")
    val myManager = Manager ("Sofia", 10000000)
    myManager.work()
    myManager.calculateBonus()
    print("Bonus:")
    println(myManager.calculateBonus())

    println("\n --- Developer ---")
    val myDeveloper = Developer ("Hansen", 8000000, "JavaScript")
    myDeveloper.work()
    myDeveloper.calculateBonus()
    print("Bonus:")
    println(myDeveloper.calculateBonus())

}

