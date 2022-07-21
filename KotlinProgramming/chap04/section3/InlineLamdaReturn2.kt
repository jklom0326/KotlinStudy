package com.example.jklom0326.chap04.section3.return2

fun main(){
    retFunc()
}

inline  fun inlineLambda(a:Int ,b:Int ,out : (Int,Int)-> Unit){
    out(a,b)
}
// 암묵적 라벨표시하는법
fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3){a,b ->
        val result = a+b
        if(result > 10) return@inlineLambda // 람다식 명칭을 그대로 라벨처럼 사용함
        println("result : $result")
    }
    println("end of retFunc")
}