package com.example.jklom0326.chap03.section05

fun main() {
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("second call: $it") }
}

inline fun shortFunc(a:Int,out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}