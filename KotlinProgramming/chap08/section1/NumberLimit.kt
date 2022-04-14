package com.example.jklom0326.chap08.section1

class Calc<T: Number> {
    // 클래스의 형식매개병수 제한
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main(args: Array<String>) {

    val clac = Calc<Int>()
    println(clac.plus(12,20))

    val calc2 =Calc<Double>()
    val calc3 =Calc<Long>()
//    val calc4 =Calc<String>() // 제한된 자료형으로 인해 오류발생!

    println(calc2.plus(2.3,2.5))
    println(calc3.plus(5L,10L))
}