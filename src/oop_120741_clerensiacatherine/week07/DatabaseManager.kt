package oop_120741_clerensiacatherine.week07

object DatabaseManager {
    var connectionStasus: String = "Disconnected"

    fun connect(){
        connectionStasus = "Connected to Server"
        println("Database is ready")
    }
}