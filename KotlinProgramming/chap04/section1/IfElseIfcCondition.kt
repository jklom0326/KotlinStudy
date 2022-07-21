package com.example.jklom0326.chap04.section1

fun main(){
    println("Enter the score:")
    val score = readLine()!!.toDouble()// 세이프티콜을 이용하면 예외처리를해줘야하는데 나중에함
    var grade = "F"

    if (score>=90.0){
        grade = "A"
    }else if(score in 80.0..89.9){
        grade = "B"
    }else if(score in 70.0..79.9){
        grade = "C"
    }
    println("Score : $score, Grade : $grade")
}