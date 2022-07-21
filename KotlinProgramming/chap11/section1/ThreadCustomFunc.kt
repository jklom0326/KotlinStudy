package com.example.jklom0326.chap11.section1

public fun thread(start: Boolean = true, isDaemon: Boolean = false,
                  contextClassLoader: ClassLoader? = null, name: String? = null,
                  priority: Int = -1, block: () ->Unit): Thread {
    val thread = object : Thread(){
        public override fun run() {
            block()
        }
    }
    if (isDaemon) // 백그라운드 실행여부
        thread.isDaemon =true
    if (priority > 0)
        thread.priority = priority
    if (name != null)
        thread.name = name
    if (contextClassLoader != null)
        thread.contextClassLoader = contextClassLoader
    if (start)
        thread.start()
    return thread
}

fun main() {
    // 스레드의 옵션 변수를 손쉽게 설정할 수 있음
    thread(start = true) {
        println("Current Threads(Custom Function): ${Thread.currentThread() }")
        println("Priority : ${Thread.currentThread().priority}")  // 기본값은 5
        println("Name : ${Thread.currentThread().name }")
        println("Daemon : ${Thread.currentThread().isDaemon }")
    }
}