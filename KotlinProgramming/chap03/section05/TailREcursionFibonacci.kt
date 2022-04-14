package com.example.jklom0326.chap03.section05

import java.math.BigInteger

fun main(){
    val n  = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n,first,second))
}

tailrec fun fibonacci(n:Int, a:BigInteger, b:BigInteger) : BigInteger {
    return if (n==0) a else fibonacci(n-1,b,a+b)
}