package oop_120741_clerensiacatherine.week06

class SmartCCTV (override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        StartRecord()
    }
}