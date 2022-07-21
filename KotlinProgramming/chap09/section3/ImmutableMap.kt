package com.example.jklom0326.chap09.section3

fun main() {
    //불변형 Map의 성언 및 초기화
    val langMap: Map<Int, String> = mapOf(11 to "java", 22 to "Kotlin", 33 to "C++")
    for ((key,value) in langMap) { //키와 값의 쌍을 출력
        println("key = $key, value = $value")
    }
    println("langMap[22] = ${langMap[22]}") // 키 22에 대한 요소 출력
    println("langMap.get(22)= ${langMap.get(22)}")
    println("lang.keys = ${langMap.keys}")
}