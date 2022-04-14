package com.example.jklom0326.controlflow.controlflow3

fun add(int1 : Int, int2: Int ): Int{
   return int1 + int2
}

fun plusInput(input : Int) : Int{
    var result = 0
    for (i in 0..input){
     result += i
    }
    return  result
}

fun stringprint(): String{
    return "엄준식"
}

fun main() {
    println(add(2,3))
    println(plusInput(43))
    println(stringprint())

}