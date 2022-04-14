package com.example.jklom0326.chap04.section2

fun main(){
    var sum = 0
    var odd = 0
    var even = 0

    for(x in 1..100) sum +=x
        println("sum : $sum")

    for (x in 1..100 step 2) odd += x
        println("odd : $odd")

    for(x in 0..100 step 2)  even += x
        println("even : $even")

}