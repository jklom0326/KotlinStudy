package com.example.jklom0326.chap09.section2

fun main() {
    // 가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("Sanggil","Chanho","inook")
    mutableList.add("junsik")
    mutableList.removeAt(1)
    mutableList[0] = "Ralo"
    println(mutableList)

    val mutableLsitMixed = mutableListOf("Android","Apple",4,5,'x')
    println(mutableLsitMixed)
}