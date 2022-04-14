package com.example.jklom0326.chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    list.forEach { print("$it") }
    println()
    list.forEachIndexed { index,value -> println("index[$index] : $value") }

    val returnedList = list.onEach { print(it) }
    println()
    // 순환 처리를 위해 사용하는 forEach 와 forEachIndexed
    val returnedMap = map.onEach { println("key ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")
    // 특정 조건에 일치하는 요소의 개수를 반환하는 count
    println()
    println(list.count { it % 2 == 0 })

    println()
    // fold : 초기값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4){total,next -> total + next}) // 4+1+ ... 6 = 25
    println(list.fold(1){total,next -> total * next}) // 1*1*2* ... 6 = 720
    println()
    //foldRight : fold 와 같고 마지막 요소에서 처음 요소로 반대로 적용
    println(list.foldRight(4){total,next -> total + next})
    println(list.foldRight(1){total,next -> total + next})
    println()
    //reduce : fold와 동일하지만 초기값을 사용하지않음
    println(list.reduce {total,next -> total + next})
    println(list.reduceRight {total,next -> total + next})

    val listWithNull = listOf(1, null, 3, null, 5,6)

    // max/min : 최댓값 요소와 최솟 값 요소의 반환
    println(list.max())
    println(list.min())

    // maxBy/minBy: 최댓값과 최솟값으로 나온 요소 it에 대한 식의 결과
    println("maxBy: "+ map.maxBy { it.key }) // 키를 기준으로 최댓값
    println("minBy: "+ map.minBy { it.key }) // 키를 기준으로 최솟값

    // sumBy: 식에 의해 도출된 모든 요소를 합산
    println(listPair.sumBy { it.second })

    // map : 컬렉션에 주어진 식을 적용해 새로운 컬렉션을 반환
    println(list.map { it * 2 }) // [2,4,6,8,10,12]

    // mapIndexed: 컬렉션에 인덱스를 포함해 주어진 식을 적요해 새로운 컬렉션을 반환
    val mapIndexed = list.mapIndexed { index, it -> index * 2}
    println(mapIndexed) // [0,2,6,12,20,30]

    // mapNotNull: null을 제외하고 식을 적용해 새로운 컬렉션 반환
    println(listWithNull.mapNotNull { it?.times(2) }) // [2,6,10,12]

    // flatMap: 각 요소에 식을 적용 후 다시 합쳐 새로운 컬렉션을 반환
    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc" , "12").flatMap { it.toList() }
    println(result)

    //groupBy: 주어진 함수의 결과에 따라 그룹화 하여 map으로 반환
    val grpMap = list.groupBy { if (it % 2 == 0 ) "even" else "odd"}
    println(grpMap)
}