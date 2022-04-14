package com.example.jklom0326.chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listMixed = listOf(1, "hello", 3, "World", 5 ,"A")
    val listWithNull = listOf(1, null, 3, null, 5,6)
    val listReapeated = listOf(2,2,3,4,5,5,6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println()
    //filter: 식에 따라 요소를 골라내기
    println(list.filter { it % 2 == 0 })
    println(list.filterNot { it % 2 == 0 })
    println(listWithNull.filterNotNull())

    // filterIndexed: 인덱스와 함게 추출
    println("filterIndexed :" + list.filterIndexed{idx, value -> idx != 1 && value % 2 == 0})

    // filterIndexedTo: 추출후 mutable 컬렉션으로 변환
    val mutList = list.filterIndexedTo(mutableListOf()) { idx, value -> idx != 1 && value % 2 == 0}
    println("filterIndexedTo: $mutList")

    // filterkeys / filterValues: Map의 키/ 값에 따른 필터
    println("filterKeys: "+ map.filterKeys { it != 11 }) // { 22 = Kotlin, 33 = C++ }
    println("filterValues: "+ map.filterValues { it == "Java" }) // { 11 = Java }

    // 특정 자료형에 대한 필터
    println("filterIsInstance: "+ listMixed.filterIsInstance<String>())

    //특정 범위를 잘라내거나 반환
    //slice: 특정인덱스의 요소들을 잘라서 반환하기
    println("slice : "+list.slice(listOf(0,1,2)))

    //take: n개의 요소를 반환
    println(list.take(2))  // 앞 두요소를 반환 [1,2]
    println(list.takeLast(2))  // 마지막 요소의 두 요소 반환 [5,6]
    println(list.takeWhile { it < 3 }) // 조건식에 따른 반환 [1,2]

    //drop: 처음부터 n개의 요소를 제외한 List를 반환
    println(list.drop(3))// 앞의 요소 3개를 제외하고 반환
    println(list.dropWhile { it < 3 }) // 3미만을 제외하고 반환
    println(list.dropLastWhile { it > 3 }) // 3초과를 제외하고 반환

    // distinct: 중복요소는 하나로 취급해 목록 반환
    println("distinct : " + listReapeated.distinct())

    // intersect : 교집합 요소만 골라냄
    println("intersect : "+ list.intersect(listOf(6,7,8,9)))

}