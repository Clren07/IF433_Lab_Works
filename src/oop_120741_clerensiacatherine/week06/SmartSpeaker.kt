package oop_120741_clerensiacatherine.week06

class SmartSpeaker (override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOff() {
        println ("$name dinyalakan")
    }

    override fun turnOn() {
        println ("$name dimatikan")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}