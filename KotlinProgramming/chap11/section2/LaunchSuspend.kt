package com.example.jklom0326.chap11.section2

import kotlinx.coroutines.*

suspend fun dowork1(): String{
    delay(1000)
    return "Work1"
}
suspend fun dowork2(): String{
    delay(3000)
    return "Work2"
}

private fun worksInSerial(){
    // 순차적 실행
    GlobalScope.launch {
        val one = dowork1()
        val two = dowork2()
        println("Kotlin one: $one")
        println("Kotlin two: $two")
    }
}
private fun worksInParallel(){
    //Deferred<T> 를 통해 결과값을 반환
    val one = GlobalScope.async {
        dowork1()
    }
    val two = GlobalScope.async {
        dowork2()
    }
    GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined : $combined")
    }
}

fun main(){
//    worksInSerial()
    worksInParallel()
    readLine()
}
