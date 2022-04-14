package com.example.jklom0326.chap10.section1

fun main(args: Array<String>) {
    val score: Int? = 32
    //var score = null

    //일반적인 null 검사
    fun checkScore(){
        if (score != null ){
            println("Score : $score")
        }
    }
    // let을 사용해 null 검사를 제거
    fun checkSocreLet() {
        score?.let { println("Score: $it") }
        val str = score.toString()
        println(str)
    }

    checkScore()
    checkSocreLet()
}