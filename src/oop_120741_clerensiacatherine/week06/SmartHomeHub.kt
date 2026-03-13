package oop_120741_clerensiacatherine.week06

class SmartHomeHub (){
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun turnOnAllSwitches(){
        for (device in devices) {
            if (device is Switchable){
                device.turnOff()
            }
        }
    }

}