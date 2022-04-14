package com.example.jklom0326.chap02.section3

fun main(){
    var str1 : String? = "Hello Kotlin"
   // str1 =null
    println("str1: $str1")
    println("str1: $str1  length : ${str1?.length}")
//    val len = if(str1 != null) str1.length else -1
//    println("str1: $str1  length :${len}") // -1을 받았을때 무슨일을 할 수 있다.
    println("str1: $str1  length :${str1?.length ?: -1}")
}