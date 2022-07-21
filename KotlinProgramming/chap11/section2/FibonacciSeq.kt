package com.example.jklom0326.chap11.section2

val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1)

    while (true){
        yield(a+b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    println(fibonacciSeq.take(40).toList())
}