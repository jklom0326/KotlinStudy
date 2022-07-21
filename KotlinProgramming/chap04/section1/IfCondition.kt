package com.example.jklom0326.chap04.section1

fun main(){
    val a = 12
    val b = 30

    val max = if (a > b){
        println("a 선택")
        a
    }else{
        println("b 선택")
        b
    }
    println(max)
}