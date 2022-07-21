package com.example.jklom0326.chap06.section2

class Person{
    lateinit var name: String //(1) 늦은 초기화를 위한 선언

    fun test(){
        if(!::name.isInitialized){ // (2) 프로퍼티의 초기화 여부 판단
            println("not initialized")
        }else{
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong" // (3) 이 시점에서 초기화됨(지연초기호)
    kildong.test()
    println("name = ${kildong.name}")
}