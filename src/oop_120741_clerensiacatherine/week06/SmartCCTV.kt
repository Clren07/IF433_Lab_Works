package oop_120741_clerensiacatherine.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        StartRecord()
    }

    override fun turnOff() {
        StopRecord()
    }

    override fun StartRecord() {
        println("Starting record")
    }
}