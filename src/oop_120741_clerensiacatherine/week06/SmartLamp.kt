package oop_120741_clerensiacatherine.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOff() {
        println ("$name dinyalakan")
    }

    override fun turnOn() {
        println ("$name dimatikan")
    }
}