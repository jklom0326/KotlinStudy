package com.example.jklom0326.chap04.section3.trycath

import java.lang.Exception

fun main(){
    val a = 6
    val b = 0
    val c : Int

    try {
        c = a/b
    }catch (e:Exception){
        println("Exception is handled")
    }finally {
        println("finally블록은 반드시 실행됨")
    }
}