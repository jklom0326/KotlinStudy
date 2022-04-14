package com.example.jklom0326.chap04.section2

fun main(){
    println("Enter The number : ")
    var number = readLine()!!.toInt()
    var factorial:Long = 1

    while (number > 0){
        factorial *= number
        --number
    }
    println("Factorial : $factorial")
}