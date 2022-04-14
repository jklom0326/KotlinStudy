package com.example.jklom0326.chap03.section05.localreturn

fun main() {
    shortFunc(3) {
        println("First call: $it")
        return
    }
}

inline fun shortFunc(a:Int,out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}