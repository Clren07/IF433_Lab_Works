package oop_120741_clerensiacatherine.week04

open class Developer (name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
        super.calculateBonus()
    }
}
