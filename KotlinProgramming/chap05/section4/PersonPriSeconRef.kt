package com.example.jklom0326.chap05.section3.seconref

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){// (2) 주 생성자
    val fName = println("[Primary Constructor] Person fName $firstName") // (3) 프로퍼티 할당

    init {
        println("[init] Person init block") // (4) 초기화 블록
    }
    // (1) 보조생성자
    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")): this(firstName){
        println("[Secondary Constructor] Body : $firstName, $age") // (5) 부 생성자 본문
    }
}

fun main() {
    val p1 = Person("Kildong", 30)// (1) -> (2) 호출 , (3)->(4)->(5)
    println()
    val p2 = Person("Dooly")  // (2) 호출, (3) -> (4) 실행
}