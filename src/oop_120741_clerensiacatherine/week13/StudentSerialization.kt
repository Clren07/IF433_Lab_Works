package oop_120741_clerensiacatherine.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

// Serialization (Object -> CSV)
fun Student.toCSV(): String = "Name, Sage, Sqa"

// Deserialization (CSV -> Object)
fun fromCSV(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0],parts[1].toInt(), parts[2].toDouble())
}