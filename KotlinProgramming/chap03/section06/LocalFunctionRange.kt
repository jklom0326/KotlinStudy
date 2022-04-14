package com.example.jklom0326.chap03.section06

fun a()=b()
fun b()= println("b")

fun c(){
    //fun d() = e()
    fun e() = println("e")
}

fun main(){
    a()
   // e()
}