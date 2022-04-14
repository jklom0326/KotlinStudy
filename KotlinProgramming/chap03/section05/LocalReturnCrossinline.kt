package com.example.jklom0326.chap03.section05.crossinline

fun main() {
    shortFunc(3) {
        println("First call: $it")
        //return
    }
}


inline fun shortFunc(a:Int,crossinline out:(Int)->Unit){
    println("Before calling out()")
    nestedFunc {out(a)}
    println("After calling out()")
}
fun nestedFunc(body: ()-> Unit){
    body()
}