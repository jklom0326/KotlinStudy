package com.example.jklom0326.chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false  //(1) 초기화 확인 용도

    val person: Person by lazy{  // (2) lazy를 사용한 person객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim",23) // (3) 이부분이 Lazy 객체로 반환 됨
    }
    val personDelgate = lazy { Person("Hong",40)  } // (4) 위임 변수를 사용한 초기화

    println("Person Init: $isPersonInstantiated")
    println("PersonDelegate Init: ${personDelgate.isInitialized()}")

    println("person.name = ${person.name}") // (5) 이 시점에서 초기화
    println("personDelegate Init: ${personDelgate.value.name}") // (6) 이 시점에서 초기화

    println("person Init : $isPersonInstantiated")
    println("personDelgate Init : ${personDelgate.isInitialized()}")
}