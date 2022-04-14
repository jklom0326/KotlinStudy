package com.example.jklom0326.chap09.section3

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6,3,4,7)
    intsHashSet.add(5)
    intsHashSet.remove(6)
    println(intsHashSet)
}