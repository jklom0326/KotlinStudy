package com.example.jklom0326.chap11.section1

// 1. Thread클래스를 상속받아 구현하기
class SimpelThread: Thread() {
    override fun run(){
        println("Current Threads: ${Thread.currentThread()}")
    }

    // 2. Runnable 인터페이스로부터 run() 메서드 구현하기
    class SimpleRunnable: Runnable {
        override fun run() {
            println("interface Threads: ${Thread.currentThread()}")
        }
    }

}

fun main() {
    val thread = SimpelThread()
    thread.start()

    val runnable = SimpelThread.SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    // 익명객체를 이용한방법
    object : Thread() {
        override fun run() {
            println("object Threads : ${Thread.currentThread()}")
        }
    }.start()

    // 람다식
    Thread {
        println("lamda Threads : ${Thread.currentThread()}")
    }.start()

}