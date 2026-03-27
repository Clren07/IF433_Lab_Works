package oop_120741_clerensiacatherine.week07

fun main(){
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStasus}")
    DatabaseManager.connect()

    println("\n=== Test Companion Object ===")
    val client = NetworkClient.createClient()
    client.connect()

    println ("\n=== Test Regular Class ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1==reg2}")

    println ("\n=== Test Data Class ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println (data1)
    println ("Sama? ${data1==data2}")

    val data3 = data1.copy(age=23)
    println ("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")
}

