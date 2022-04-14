package com.example.jklom0326.chap11.section2

import kotlinx.coroutines.*
import java.util.concurrent.Executors

fun main() = runBlocking(Dispatchers.Default) {

    val threadPool = Executors.newFixedThreadPool(4)
    val MyContext = threadPool.asCoroutineDispatcher()

    launch(Dispatchers.IO) {
        delay(1200L)
        println("Task from runBlocking")
    }

    coroutineScope {
        launch(MyContext) {
            delay(1500L)
            println("Task from nested launch")
        }
        delay(200L)
        println("Task from coroutineScope")
    }
    println("end of runBlocking")
}