package com.example.jklom0326.chap03.section05.noinline

fun main(){
    shortFunc(3){ println("First call : $it")}
}

inline fun shortFunc(a: Int, noinline out:(Int)-> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}