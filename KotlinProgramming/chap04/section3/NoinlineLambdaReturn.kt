package com.example.jklom0326.chap04.section3.noline


fun main(){
    retFunc()
}

inline  fun inlineLambda(a:Int ,b:Int ,out : (Int,Int)-> Unit){
    out(a,b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3)lit@{a,b ->
        val result = a+b
        if(result > 10) return@lit
        println("result : $result")
    }
    println("end of retFunc")
}