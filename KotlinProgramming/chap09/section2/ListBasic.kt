package com.example.jklom0326.chap09.section2

fun main() {
    // 불변형List의 사용
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("one","two","three")

    for (name in names){
        println(name)
    }
    for (num in numbers) print(num)
    println()// 내용이 없을때는 한줄 내리는 개행
}