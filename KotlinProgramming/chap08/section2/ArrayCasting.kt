package com.example.jklom0326.chap08.section2

import java.util.*

fun main() {
    val b = Array<Any>(10,{0})
    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])
    println(Arrays.toString(b))
}