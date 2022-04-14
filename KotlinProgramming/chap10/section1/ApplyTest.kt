package com.example.jklom0326.chap10.section1.apply

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("killdong", "Kotlin")

    // 여기서는 this는 person 객체를 가리킴
    person.apply { this.skills = "swift" }
    println(person)

    val retrunObj = person.apply {
        name = "Sean"
        skills = "Java"
    }
    println(person)
    println(retrunObj)
}