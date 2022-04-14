package com.example.jklom0326.chap03.section05

import java.util.function.LongFunction

fun main(){
    val number = 4
    val result : Long

    result = factorial(number)
    println("Factorial : $number -> $result")
}

fun factorial(n: Int) : Long {
    return if (n==1) n.toLong() else n* factorial(n-1)
}