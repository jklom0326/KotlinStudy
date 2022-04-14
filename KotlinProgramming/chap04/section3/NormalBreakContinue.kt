package com.example.jklom0326.chap04.section3

fun main(){
    for(i in 1..5){
        if (i==3) break // continue 일때도 확인 해보기
        print(i)
    }
    println()
    println("outside")
}