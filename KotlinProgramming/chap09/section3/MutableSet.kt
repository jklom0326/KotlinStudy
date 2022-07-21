package com.example.jklom0326.chap09.section3

fun main() {
    // 가변형 Set 정하기
    val animal = mutableSetOf("Lion","Dog","Cat","Python","Hippo")
    println(animal)

    animal.add("Dog") // 요소중 "Dog"가 이미 존재하므로 변화 없음
    println(animal)

    animal.remove("Python")
    println(animal)
}