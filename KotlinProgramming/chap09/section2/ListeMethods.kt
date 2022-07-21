package com.example.jklom0326.chap09.section2

fun main() {
    var names: List<String> = listOf("one","two","three")

    println(names.size)  // list 의 크기
    println(names.get(0))  //해당 인덱스의 요소 가져오기
    println(names.indexOf("three")) // 해당요소의 인덱스 가져오기
    println(names.contains("two")) // 포함여부 확인후 포함되어 있으면 true반환
}