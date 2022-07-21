package com.example.jklom0326.chap09.section2

fun main() {
    val names: List<String> = listOf("One","two","three")

    val mutableNames = names.toMutableList()
    mutableNames.add("four")
    println(mutableNames)
}