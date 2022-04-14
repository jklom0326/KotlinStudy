package com.example.jklom0326.chap09.section3

fun main() {
    // Linked list를 이용한 HashSet
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35,21,76,75)
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)

    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}