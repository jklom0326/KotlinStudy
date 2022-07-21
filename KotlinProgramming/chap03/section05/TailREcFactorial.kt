package com.example.jklom0326.chap03.section05.tailrec

fun main(){
    val number = 5
    println("Factorail : $number -> ${factorial(number)}")
}
tailrec fun factorial(n:Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1,run*n)
}
