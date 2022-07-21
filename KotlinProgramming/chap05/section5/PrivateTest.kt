package com.example.jklom0326.chap05.section5

private class PrivateClass{
    private var i = 1
    private fun privateFunc(){
        i += 1 //접근허용
    }
    fun access(){
        privateFunc()
    }
}
class OtherClass(){
//    val opc = PrivateClass() // 불가 - 프로퍼티 opc 는 private이 되야함
    fun  test(){
        val pc = PrivateClass() // 생성가능
    }
}

fun main() {
    val pc = PrivateClass() // 생성가능
//    pc.i // 접근불가
//    pc.privateFunc() // 접근불가
}
fun TopFunction(){
    val tpc = PrivateClass()// 객체 생성가능
}