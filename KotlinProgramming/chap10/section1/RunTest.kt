package com.example.jklom0326.chap10.section1

fun main() {
    // apply와 run 비교
    data class Person(var name: String, var skills: String)
    var person = Person("killdong", "Kotlin")

    val retrunObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "Success" // 사용되지 않음
    }
    println(person)
    println("returnObj : $retrunObj")

    val retrunObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "Success"
    }
    println(person)
    println("retrunObj2 : $retrunObj2")
}