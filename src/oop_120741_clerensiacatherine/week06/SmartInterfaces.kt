package oop_120741_clerensiacatherine.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun StartRecord ()
    fun StopRecord (){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}