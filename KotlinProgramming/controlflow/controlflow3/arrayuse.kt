package com.example.jklom0326.controlflow.controlflow3

// 1. 기본타입 배열 선언하기 - 각 기본타입별로 10개의 빈공간이 할당됩니다.
var students = IntArray(10)
var longArray = LongArray(10)
var charArray = CharArray(10)
var floatArray = FloatArray(10)
var doubleArray = DoubleArray(10)
// arrayof() 함수를 사용하면 선언과 동시에 값을 입력할 수 있습니다.
var intArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//intArray 변수에는 1부터 10까지의 값이 각각의 배열공간에 저장되어 있습니다.

// 2. 문자열 타입 배열 선언하기
var stringArray = Array(10, {item ->""})
//arrayof() 함수로 값을 직접 입력해서 배열을 생성할 수 있습니다.
var datArray = arrayOf("MON","TUE","WED","TUR","FRI","SAT","SUN")

// 3. 앞에서 선언한 studens 변수에 값 넣기

fun main() {
    // 가. 대괄호를 사용하는 방법
    students[0] = 90
    students[1] = 91
    students[2] = 92
    students[3] = 93
    students[4] = 94
    // 나. set() 함수를 사용하는 방법
    students.set(5,95)
    students.set(6,96)
    students.set(7,97)
    students.set(8,98)
    students.set(9,99)

    // 4. 값 변경해 보기

    intArray[6] = 137
    intArray.set(9,200)

    var seventhValue = intArray[6]
    println("일곱번째 intArray의 값은 ${seventhValue}")
}