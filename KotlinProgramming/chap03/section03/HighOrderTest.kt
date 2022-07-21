package com.example.jklom0326.chap03.section03.highord


fun main(){
    val result : Int
    val multi = {x: Int, y : Int -> x * y}//람다식
    result = multi(10,20)
    println(result)
}