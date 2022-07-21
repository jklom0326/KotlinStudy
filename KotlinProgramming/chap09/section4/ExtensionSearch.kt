package com.example.jklom0326.chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listpair = listOf(Pair("A", 300),Pair("B", 200),Pair("C", 100))
    val listReapeated = listOf(2,2,3,4,5,5,6)

    // elementAt: 인덱스에 해당하는 요소반환
    println("elementAt : " + list.elementAt(1))

    // elementAtOrElse: 인덱스를 벗어나는 경우 식에 따라 결과 반환 아니면 요소 반환
    println("elementAtOrElse : " +list.elementAtOrElse(10,{2 * it}))
    // elementAtOrElse(10) {2 * it} 표현식과 동일

    // elementAtOrNull: 인덱스를 벗어나느 경우 null 반환
    println("elementAtOrNull: "+ list.elementAtOrNull(10))

    // first : 식에 일치하는 첫 요소 반환
    println("first : "+ listpair.first{it.second == 200})

    // last : 식에 일치하는 마지막요소 반환
    println("last :" + listpair.last { it.second == 200 })

    // firstOrNull : 식에 일치하지 않는 경우 null 반환
    println("firstOrNull : "+ listpair.firstOrNull { it.first == "E" })

    // lastOrNull : 식에 일치하지 않는 경우 null 반환
    println("lastOrNull : "+ listpair.lastOrNull { it.first == "E" })

    // IndexOf : 주어진 요소에 일치하는 첫 인덱스 반환
    println("IndexOf :" + list.indexOf(4))

    // IndexOfFirst : 람다식에 일치하는 첫 요소의 인덱스 반환, 없으면 -1
    println("IndexOfFirst :" + list.indexOfFirst { it % 2 == 0 })

    // lastIndexOf : 주어진 요소에 일치하는 가장 마지막 인덱스 반환
    println("lastIndexOf : "+ listReapeated.lastIndexOf(5))

    // indexOfLast : 람다식에 일치하는 마지막 요소의 인덱스 반환, 없으면 -1
    println("indexOfLast : " + list.indexOfLast { it % 2 == 0 })

    // single : 람다식에 일치하는 요소 하나를반환
    println("single : " + listpair.single{it.second == 100})
    println("singleOrNull : " + listpair.singleOrNull { it.second == 500 })

    // binarySearch: 요소에 대해 이진 탐색 후 인덱스 반환
    println("binarySearch : " + list.binarySearch(3))

    //find : 조건식을 만족하는 첫 번째 검색된 요소 반호나, 없으면 null
    println("find : " + list.find { it > 3 })
}