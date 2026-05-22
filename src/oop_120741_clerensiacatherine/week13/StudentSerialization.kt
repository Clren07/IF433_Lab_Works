package oop_120741_clerensiacatherine.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

// Serialization (Object -> CSV)
fun Student.toCSV(): String = "$name,$age,$gpa"

// Deserialization (CSV -> Object)
fun fromCSV(line: String): Student {
    val parts = line.split(",")
    return Student(
        parts[0],
        parts[1].toInt(),
        parts[2].toDouble()
    )
}

fun saveStudent(student: List<Student>, path: String) {
    File(path).writeText(
        student.joinToString("\n") { it.toCSV() }
    )
}

fun loadStudent(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCSV(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan")
        emptyList()
    }
}

fun main() {
    val students = listOf(
        Student("Alice", 20, 3.8),
        Student("Bob", 22, 3.5)
    )

    saveStudent(students, "students.csv")

    val loaded = loadStudent("students.csv")

    println("=== LOADED STUDENT DATA ====")
    loaded.forEach { println(it) }
}