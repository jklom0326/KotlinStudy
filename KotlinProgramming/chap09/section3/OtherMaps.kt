package com.example.jklom0326.chap09.section3

import java.util.*
import kotlin.collections.LinkedHashMap

fun main() {
    // java.util.HashMap 사용
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "hello", 2 to "World")
    println("hashMap = $hashMap")

    // java.util.sortedMap 사용
    val sortedMap:SortedMap<Int, String> = sortedMapOf(1 to "apple", 2 to "banana")
    println("sortedMap = $sortedMap")

    // java.util.LinkedHashMap 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "computer", 2 to "Mouse")
    println("linkedHash =$linkedHash")
}