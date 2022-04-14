package com.example.jklom0326.chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val jobs = List(100_000) {
        launch {
            delay(1000L)
            println(".")
        }
    }
    jobs.forEach { it.join() }
}