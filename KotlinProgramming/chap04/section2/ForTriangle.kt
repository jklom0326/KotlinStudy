package com.example.jklom0326.chap04.section2

fun main(){
    println("Enter The Number : ")
    var n = readLine()!!.toInt()

    for (line in 1..n){
        for (space in 1..(n-line)) print(" ")
//        for (star in 1..(2*line-1)) print("*")
        for (star in 1 until 2*line) print("*")
        println()
    }
}