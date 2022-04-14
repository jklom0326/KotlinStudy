package com.example.jklom0326.chap03.section03

fun main(){
    val result : Int
    result = highorder({x,y-> x+y},10,20)

    println(result)
}

fun highorder(sum: (Int,Int)-> Int,a:Int, b:Int):Int{
    return sum(a,b)
}