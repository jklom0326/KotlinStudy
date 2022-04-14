package com.example.jklom0326.controlflow.controlflow3

class CollectionUse

//  1. 값으로 컬렉션 생성하기
var mutableList = mutableListOf("Mon","TUE","WED")

//  2. 빈 컬렉션 생성하기
var stringList = mutableListOf<String>() // 문자열로된 빈 컬렉션을 생성합니다.
fun main() {
    // 값을 추가합니다.
    mutableList.add("THU")
    // 값을 꺼냅니다.
    println("mutableList의 첫번째 값은 ${mutableList.get(0)}입니다")
    println("mutableList의 두번째 값은 ${mutableList.get(1)}입니다")
    println("mutableList의 세번째 값은 ${mutableList.get(2)}입니다")
    println("mutableList의 네번째 값은 ${mutableList.get(3)}입니다")

    // 값을 추가합니다.
    stringList.add("월")
    stringList.add("화")
    stringList.add("수")

    // 값을 변경합니다.
    stringList.set(1,"요일변경")
    println("string의 두번째 값은 ${stringList.get(1)}입니다")

    // 값을 삭제합니다.
    stringList.removeAt(1)
    println("string의 두번째 값은 ${stringList.get(1)}입니다")

    // 개수를 출력합니다
    println("string에는 ${stringList.size}개의 값이 있습니다.")
}