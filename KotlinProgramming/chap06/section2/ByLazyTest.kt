package com.example.jklom0326.chap06.section2

class LazyTest {
    init {
        println("init block")
    }
    val subject by lazy {
        println("lazy initialzied")
        "Kotlin programming"
    }
    fun flow() {
        println("not initailized")
        println("subject one : $subject")
        println("subject two : $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}