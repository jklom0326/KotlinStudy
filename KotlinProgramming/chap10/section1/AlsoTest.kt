package com.example.jklom0326.chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("killdong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "Success"
    }

    println(person)
    println("a : $a")

    val b = person.also {
        it.skills = "Java"
        "Success"// 마지막 문장은 사용되지 않음
    }

    println(person)
    println("b : $b")
}