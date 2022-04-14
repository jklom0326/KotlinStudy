package com.example.jklom0326.chap09.section2

import java.util.ArrayList

fun main() {
    // 가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello","Kotiln", "Wow")
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}