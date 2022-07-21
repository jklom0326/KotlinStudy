package com.example.jklom0326.chap03.section03

fun main(){
    val out: () -> Unit = { println("Hello World!")}

    out()
    val new = out
    new()
}