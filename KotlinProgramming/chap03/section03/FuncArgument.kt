package com.example.jklom0326.chap03.section03.funargs

fun main(){
    val res1 = sum(2,3)
    val res2 = mul(sum(3,3),2)

    println("res1 = $res1, res2 = $res2")
}

fun sum(a: Int,b:Int)= a + b
fun mul(a: Int,b:Int)= a * b