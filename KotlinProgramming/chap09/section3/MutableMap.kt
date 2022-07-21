package com.example.jklom0326.chap09.section3

fun main() {
    // 가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String> // 선언할 때 키와 값ㄷ의 자료형을 명시할 수 있음
            = mutableMapOf("Korea" to "Seoul","China" to "Bejing","Japan" to "Tokyo")
    println(capitalCityMap.values) // 값만 출력함
    println(capitalCityMap.keys) // 키만출력
    capitalCityMap.put("UK","London")
    capitalCityMap.remove("China")
    println(capitalCityMap)

    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData) //putAll 을 이용한 병합
    println(capitalCityMap)
}