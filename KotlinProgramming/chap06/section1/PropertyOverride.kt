package com.example.jklom0326.chap06.section1

open class First{
    open val x: Int = 0 // (1) 오버라이딩 가능
    get() {
        println("First x")
        return field
    }
    val y: Int = 0 //  (2) open 키워드가 없으면 final 타입
}

class  Second: First(){
    override val x: Int = 0 // (3) 부모와 구현이 다름
    get() {
        println("Second x")
        return field + 3
    }
    // override val y: Int = 0 // (4) 에러! 오버라이딩 불가
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}