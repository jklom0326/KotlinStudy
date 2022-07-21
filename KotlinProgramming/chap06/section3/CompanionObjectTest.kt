package com.example.jklom0326.chap06.section3

class Person {
    var id: Int = 0
    var name: String = "KimChanHo"
    companion object {
        var language: String = "Korean"
        fun work(){
            println("coin....")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "Um"
    println(Person.language)
    Person.work()
}