package com.example.jklom0326.chap04.section1

//인자가 없는 when

fun main(){
    println("Enter the Score : ")
    var score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when{
        score >= 90.0 -> 'A'        // scroe 를 직접 넣어서 조건을 만들어준다다
        score in 80.0..89.9 -> 'B'
        score in 70.0..79.9 -> 'C'
        score < 70 -> 'F'
    }
    println("Score : $score, Grade : $grade")

}