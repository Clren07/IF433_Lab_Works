package oop_120741_clerensiacatherine.week07

fun main(){
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStasus}")
    DatabaseManager.connect()

    println("\n=== Test Companion Object ===")
    val client = NetworkClient.createClient()
    client.connect()
}
