package com.example.jklom0326.chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val job = launch { //백그라운드로 코루틴실행  job의 객체를반환
        delay(1000L)
        println("World!")
    }
    println("Hello,")// 즉시 이어서 실행이됨
    job.join() // 명시적으로 코루틴이 완료되길 기다림. 취소할 경우 job.cancel()함수를 사용
}