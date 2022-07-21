package com.example.jklom0326.controlflow.controlflow3

var eraOfRyu = 2.32
var eraOfDegrom = 2.43

fun main() {
    val era = if(eraOfRyu < eraOfDegrom){
        println("2019 류현진이 디그롬을 이겼습니다.")
        eraOfRyu
    }else{
        println("2019 디그롬이이 류현진을 이겼습니다.")
        eraOfDegrom
    }
    println("2019MLB에서 가장높은 ERA는 ${era}")
}