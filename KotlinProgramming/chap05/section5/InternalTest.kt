package com.example.jklom0326.chap05.section5.internal

internal class InternalClass{
    internal var i = 1
    internal fun icFunc(){
        i += 1 // 접근허용
    }
    fun access(){
        icFunc() // 접근허용
    }
}
class Other{
    internal val ic = InternalClass() // 프로퍼티 지정시 internal로 맞춰야한다.
    fun test(){
        ic.i // 접근허용
        ic.icFunc() // 접근허용
    }
}

fun main() {
    val mic = InternalClass() // 생성가능
    mic.i // 접근허용
    mic.icFunc() // 접근허용
}