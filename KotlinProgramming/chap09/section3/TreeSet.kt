package com.example.jklom0326.chap09.section3

import java.util.*

fun main() {
    //자바의 java.util.TreeSet선언
    val intSortedSet: TreeSet<Int> = sortedSetOf(4,1,7,2)
    intSortedSet.add(6)
    intSortedSet.remove(1)
    println("intsSortedSet = ${intSortedSet}")
    intSortedSet.clear()
    println("intsSortedSet = ${intSortedSet}")
}