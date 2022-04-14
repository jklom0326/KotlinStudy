package com.example.jklom0326.chap09.section2

fun main() {
    val fruits = listOf("apple","banana","kiwi")

    for (item in fruits){
        println(item)
    }

    for(index in fruits.indices){
        println("fruits[$index] : ${fruits[index]}")
    }

    for (index in fruits.indices){
        if (index % 2 ==0) println("fruit[$index] : ${fruits[index]}")
    }

    var index = 0
    while (index < fruits.size){
        println("fruit[$index] : ${fruits[index]}")
        index++
    }
}